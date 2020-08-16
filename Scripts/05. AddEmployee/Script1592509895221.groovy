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

WebUI.click(findTestObject('PIM/01. Add/btn_Add'))

WebUI.verifyElementPresent(findTestObject('PIM/01. Add/ttl_AddEmployee'), 0)

WebUI.setText(findTestObject('PIM/01. Add/txt_FirstName'), 'Betty')

WebUI.setText(findTestObject('PIM/01. Add/txt_MiddleName'), 'Grace')

WebUI.setText(findTestObject('PIM/01. Add/txt_LastName'), 'Johnson')

WebUI.uploadFile(findTestObject('PIM/01. Add/btn_Photo'), 'C:\\Users\\Dika\\Desktop\\0.png')

WebUI.click(findTestObject('PIM/01. Add/btn_Save'))

WebUI.verifyElementPresent(findTestObject('PIM/01. Add/01. EditEmployee/03. Personal Info/ttl_PersonalDetails'), 0)
