import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.verifyElementText(findTestObject('Admin/ttl_Skills'), 'Skills')

def dataSet = findTestData('Data Files/Skills (1)')

for (def RowSkills = 1; RowSkills <= findTestData('Data Files/Skills (1)').getRowNumbers(); RowSkills++) {
    //for (def RowLogin : 1.. dataSetLogin.getRowNumbers())
    WebUI.click(findTestObject('Admin/btn_Add'))

    WebUI.setText(findTestObject('Admin/txt_SkillName'), dataSet.getValue('skillName', RowSkills))

    WebUI.setText(findTestObject('Admin/txt_Desc'), dataSet.getValue('description', RowSkills))

    WebUI.click(findTestObject('Admin/btn_Save'))

    WebUI.verifyElementPresent(findTestObject('Admin/txt_Success'), 0) //	WebUI.setText(findTestObject('OR_SignInToWorkspace/Txt_Email'), dataSetLogin.getValue('username', RowLogin))
    //
    //	WebUI.setText(findTestObject('OR_SignInToWorkspace/Txt_Password'), dataSetLogin.getValue('password', RowLogin))
    //
    //	WebUI.click(findTestObject('OR_SignInToWorkspace/Btn_SignIn'))
    //
    //	def Warning = WebUI.getText(findTestObject('Object Repository/OR_SignInToWorkspace/txt_SekolahQA'))
    //
    //	WebUI.verifyMatch(Warning, dataSetLogin.getValue('expected Result', RowLogin), false)
}

