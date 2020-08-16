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

//WebUI.setText(findTestObject('LoginPage/txt_Username'), username)
//
//WebUI.setText(findTestObject('LoginPage/txt_Password'), password)
//
//WebUI.click(findTestObject('LoginPage/btn_Login'))
//
//WebUI.verifyElementText(findTestObject('LoginPage/txt_ErrorMessages'), expectedResult)
WebUI.verifyElementVisible(findTestObject('LoginPage/ttl_LoginPanel'))

def dataLogin = findTestData('Data Files/LoginNegative')

for (def RowLogin = 1; RowLogin <= findTestData('Data Files/LoginNegative').getRowNumbers(); RowLogin++) {
    WebUI.setText(findTestObject('LoginPage/txt_Username'), dataLogin.getValue('username', RowLogin))

    WebUI.setText(findTestObject('LoginPage/txt_Password'), dataLogin.getValue('password', RowLogin))

    WebUI.click(findTestObject('LoginPage/btn_Login'))

    WebUI.verifyElementText(findTestObject('LoginPage/txt_ErrorMessages'), dataLogin.getValue('expectedResult', RowLogin)) //	def Warning = WebUI.getText(findTestObject('Object Repository/OR_SignInToWorkspace/txt_SekolahQA'))
    //
    //	WebUI.verifyMatch(Warning, dataSetLogin.getValue('expected Result', RowLogin), false)
}

