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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.redbus.in/')

WebUI.click(findTestObject('Object Repository/Page_Book Bus Tickets Online, Easy  Secure _729263/i_concat(India, , s No. 1 Online Bus Ticket_4f81f5'))

WebUI.setText(findTestObject('Object Repository/Page_Book Bus Tickets Online, Easy  Secure _729263/input_concat(India, , s No. 1 Online Bus Ti_2144e2'), 
    'mu')

WebUI.click(findTestObject('Object Repository/Page_Book Bus Tickets Online, Easy  Secure _729263/li_Mumbai'))

WebUI.setText(findTestObject('Object Repository/Page_Book Bus Tickets Online, Easy  Secure _729263/input_Mumbai_dest'), 
    'del')

WebUI.click(findTestObject('Object Repository/Page_Book Bus Tickets Online, Easy  Secure _729263/text_Delhi'))

WebUI.click(findTestObject('Object Repository/Page_Book Bus Tickets Online, Easy  Secure _729263/i_Delhi_sc-cSHVUG NyvQv icon icon-datev2'))

WebUI.click(findTestObject('Object Repository/Page_Book Bus Tickets Online, Easy  Secure _729263/svg_Icons_SVG__redone'))

WebUI.click(findTestObject('Object Repository/Page_Book Bus Tickets Online, Easy  Secure _729263/span_19'))

WebUI.click(findTestObject('Object Repository/Page_Book Bus Tickets Online, Easy  Secure _729263/button_SEARCH BUSES'))

WebUI.closeBrowser()

