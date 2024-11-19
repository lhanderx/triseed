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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://marketing-app.dev.porterpipe.com/')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt'), 'marben.dimson@porterpipe.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd'), 'ayNFi9n8PEAw7J4CRxdLUA==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Forgot my password_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Do this to reduce the number of times_edee07'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_Pipeline Marketing/span_Ad Calendar'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Pipeline Marketing/svg_November_size-8 text-white'))

WebUI.setText(findTestObject('Object Repository/Page_Pipeline Marketing/input_Title_title'), 'Test Automation')

//WebUI.click(findTestObject('Object Repository/Ad Campaign/Page_Pipeline Marketing/span_Drag and drop or browse from File Mana_afac7e'))
String projectDir = RunConfiguration.getProjectDir()

String filePath = projectDir + '/UploadFiles/Screenshot_1.png'

TestObject fileInput = findTestObject('Object Repository/Page_Pipeline Marketing/Upload File')

WebUI.sendKeys(fileInput, filePath)

WebUI.click(findTestObject('Object Repository/Page_Pipeline Marketing/button_Crop'))

WebUI.setText(findTestObject('Object Repository/Page_Pipeline Marketing/input_Start Date_startDate'), '11202024')

WebUI.setText(findTestObject('Object Repository/Page_Pipeline Marketing/textarea_Notes_note'), 'test')

WebUI.click(findTestObject('Page_Pipeline Marketing/button_Save'))

WebUI.verifyElementVisible(findTestObject('Ad Campaign/Page_Pipeline Marketing/h2_Campaign Added'))

WebUI.click(findTestObject('Object Repository/Page_Pipeline Marketing/button_Close'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Pipeline Marketing/span_Test Automation'))

