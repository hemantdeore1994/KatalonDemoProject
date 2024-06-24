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

WebUI.navigateToUrl('https://www.goibibo.com/flights/')

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/div_FromEnter city or airport'))

WebUI.setText(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/input_text'), 'mumbai')

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/div_Mumbai, India (BOM)Chhatrapati Shivaji _47d575'))

WebUI.setText(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/input_text'), 'Del')

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/div_New Delhi, India (DEL)Indira Gandhi Int_efdddb'))

WebUI.rightClick(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/p_New Delhi'))

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/div_Departure19 Jun24 Wednesday'))

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/p_17'))

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/p_Click to add a return flight for better d_bfce50'))

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/div_314,020'))

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/span_Travellers  Class_sc-12foipm-8 eXKWBG _f0a772'))

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/svg'))

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/path'))

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/li_business'))

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/a_Done'))

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/span_SEARCH FLIGHTS'))

WebUI.closeBrowser()

