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

WebUI.click(findTestObject('PIM/subMenu_EmployeeList'))

WebUI.verifyElementPresent(findTestObject('PIM/ttl_EmployeeInformation'), 0)

WebUI.setText(findTestObject('PIM/02. Search/txt_srcName'), 'Betty Grace Johnson')

not_run: WebUI.setText(findTestObject('PIM/02. Search/txt_srcId'), '')

WebUI.click(findTestObject('PIM/02. Search/opt_src_EmpStatus'))

WebUI.click(findTestObject('PIM/02. Search/opt_srcESPermanent'))

WebUI.click(findTestObject('PIM/02. Search/opt_srcJobTitle'))

WebUI.click(findTestObject('PIM/02. Search/opt_srcJTFinanceManager'))

WebUI.click(findTestObject('PIM/02. Search/opt_srcSubUnit'))

WebUI.click(findTestObject('PIM/02. Search/opt_srcSUFinance'))

WebUI.setText(findTestObject('PIM/02. Search/txt_srcSpvName'), 'Hannah Flores')

WebUI.click(findTestObject('PIM/02. Search/btn_Search'))

WebUI.verifyTextNotPresent('No Records Found', false)

