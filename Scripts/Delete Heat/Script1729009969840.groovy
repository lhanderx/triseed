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

WebUI.navigateToUrl('https://mtr.dev.porterpipe.com/')

WebUI.setText(findTestObject('Object Repository/Delete Heat/Page_Sign in to your account/input_Sign in_loginfmt'), 'marben.dimson@porterpipe.com')

WebUI.click(findTestObject('Object Repository/Delete Heat/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Delete Heat/Page_Sign in to your account/input_Enter password_passwd'), 
    'ayNFi9n8PEAw7J4CRxdLUA==')

WebUI.click(findTestObject('Object Repository/Delete Heat/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Delete Heat/Page_Sign in to your account/input_Do this to reduce the number of times_edee07'))

WebUI.click(findTestObject('Object Repository/Delete Heat/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Delete Heat/Page_MTR Web/div_CUST PO_outline-none ease-in-out flex s_b28eec'))

WebUI.click(findTestObject('Object Repository/Delete Heat/Page_MTR Web/svg_View PDF_lucide lucide-ellipsis'))

WebUI.click(findTestObject('Object Repository/Delete Heat/Page_MTR Web/div_Delete'))

WebUI.click(findTestObject('Object Repository/Delete Heat/Page_MTR Web/button_Okay'))

