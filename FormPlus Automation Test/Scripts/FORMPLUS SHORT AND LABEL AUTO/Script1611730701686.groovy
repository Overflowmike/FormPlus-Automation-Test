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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pdf.formpl.us/')

WebUI.click(findTestObject('Object Repository/Page_PDF Builder  Formplus/span_Controls'))

WebUI.click(findTestObject('Object Repository/Page_PDF Builder  Formplus/p_Short text'))

WebUI.click(findTestObject('Object Repository/Page_PDF Builder  Formplus/button_Short Text_css-stevrt-ButtonIcon e5710yz2'))

WebUI.setText(findTestObject('Object Repository/Page_PDF Builder  Formplus/input_Title_input-value'), 'SHORT TEXT FIELD AUTOMATION')

WebUI.setText(findTestObject('Object Repository/Page_PDF Builder  Formplus/input_Help Text_input-value'), 'STFA')

WebUI.click(findTestObject('Object Repository/Page_PDF Builder  Formplus/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_PDF Builder  Formplus/img'))

WebUI.click(findTestObject('Object Repository/Page_PDF Builder  Formplus/div_Labeled text'))

WebUI.click(findTestObject('Object Repository/Page_PDF Builder  Formplus/img_1'))

WebUI.setText(findTestObject('Object Repository/Page_PDF Builder  Formplus/input_Title_input-value'), 'NUMBER OF TURNOVER')

WebUI.setText(findTestObject('Object Repository/Page_PDF Builder  Formplus/input_Help Text_input-value'), 'NOT')

WebUI.click(findTestObject('Object Repository/Page_PDF Builder  Formplus/span_Save'))

WebUI.closeBrowser()

