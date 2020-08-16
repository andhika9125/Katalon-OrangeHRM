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

not_run: WebUI.click(findTestObject('PIM/01. Add/01. EditEmployee/03. Personal Info/sideBarNav'))

WebUI.click(findTestObject('PIM/01. Add/01. EditEmployee/02. Job/menu_Job'))

WebUI.verifyElementPresent(findTestObject('PIM/01. Add/01. EditEmployee/02. Job/ttl_Job'), 0)

WebUI.click(findTestObject('PIM/01. Add/01. EditEmployee/03. Personal Info/btn_Edit-Save'))

WebUI.click(findTestObject('PIM/01. Add/01. EditEmployee/02. Job/opt_JobTitle'))

WebUI.click(findTestObject('PIM/01. Add/01. EditEmployee/02. Job/opt_JTFinanceManager'))

WebUI.click(findTestObject('PIM/01. Add/01. EditEmployee/02. Job/opt_EmployeeStatus'))

WebUI.click(findTestObject('PIM/01. Add/01. EditEmployee/02. Job/opt_ESFulltime'))

not_run: WebUI.click(findTestObject('PIM/01. Add/01. EditEmployee/02. Job/opt_JobCategory'))

not_run: WebUI.click(findTestObject('PIM/01. Add/01. EditEmployee/02. Job/opt_JCProfesionals'))

WebUI.setText(findTestObject('PIM/01. Add/01. EditEmployee/02. Job/txt_JoinDate'), '2017-05-22')

WebUI.click(findTestObject('PIM/01. Add/01. EditEmployee/02. Job/null'))

WebUI.delay(2)

WebUI.click(findTestObject('PIM/01. Add/01. EditEmployee/02. Job/opt_SubUnit'))

WebUI.click(findTestObject('PIM/01. Add/01. EditEmployee/02. Job/opt_SUFinance'))

WebUI.delay(2)

WebUI.click(findTestObject('PIM/01. Add/01. EditEmployee/03. Personal Info/btn_Edit-Save'))

WebUI.verifyElementPresent(findTestObject('PIM/01. Add/01. EditEmployee/03. Personal Info/txt_Success'), 0)

