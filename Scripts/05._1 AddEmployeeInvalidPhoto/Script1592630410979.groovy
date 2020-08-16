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

not_run: WebUI.setText(findTestObject('PIM/01. Add/txt_FirstName'), '/*-')

not_run: WebUI.setText(findTestObject('PIM/01. Add/txt_MiddleName'), '+-*')

not_run: WebUI.setText(findTestObject('PIM/01. Add/txt_LastName'), '<>?+')

WebUI.uploadFile(findTestObject('PIM/01. Add/btn_Photo'), 'C:\\Users\\Dika\\Desktop\\debug.txt')

WebUI.click(findTestObject('PIM/01. Add/btn_Save'))

WebUI.verifyElementPresent(findTestObject('PIM/01. Add/txt_FailMessage'), 0)

