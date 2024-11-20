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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://marketing-app.dev.porterpipe.com/')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt (2)'), 'marben.dimson@porterpipe.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (2)'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/div_Enter password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd (2)'), 
    'ayNFi9n8PEAw7J4CRxdLUA==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (2)'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Do this to reduce the number of times_edee07 (2)'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (2)'))

WebUI.click(findTestObject('Object Repository/Page_Pipeline Marketing/span_Ad Calendar (1)'))

WebUI.scrollToElement(findTestObject('Page_Pipeline Marketing/span_Test Automation (1)'), -50)

WebUI.click(findTestObject('Page_Pipeline Marketing/span_Test Automation (1)'))

WebUI.click(findTestObject('Object Repository/Page_Pipeline Marketing/img'))

WebUI.clearText(findTestObject('Object Repository/Page_Pipeline Marketing/input_Title_title (2)'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Pipeline Marketing/input_Title_title (2)'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_Pipeline Marketing/input_Start Date_startDate'), '21112024')

WebUI.click(findTestObject('Object Repository/Page_Pipeline Marketing/button_Save (2)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Pipeline Marketing/h2_Campaign Edited'))

WebUI.click(findTestObject('Ad Campaign/Close btn'))

