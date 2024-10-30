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

WebUI.navigateToUrl('https://mtr.dev.porterpipe.com/')

WebUI.setText(findTestObject('Object Repository/Drafts/Page_Sign in to your account/input_Sign in_loginfmt'), 'marben.dimson@porterpipe.com')

WebUI.click(findTestObject('Object Repository/Drafts/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Drafts/Page_Sign in to your account/input_Enter password_passwd'), 
    'ayNFi9n8PEAw7J4CRxdLUA==')

WebUI.click(findTestObject('Object Repository/Drafts/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Drafts/Page_Sign in to your account/input_Do this to reduce the number of times_edee07'))

WebUI.click(findTestObject('Object Repository/Drafts/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Drafts/Page_MTR Web/button_Drafts 29'))

WebUI.click(findTestObject('Object Repository/Drafts/Page_MTR Web/svg_Sales Packets_lucide lucide-ellipsis'))

WebUI.click(findTestObject('Object Repository/Drafts/Page_MTR Web/div_Open_1'))

WebUI.setText(findTestObject('Object Repository/Drafts/Page_MTR Web/input_Add Page_react-aria1827729712-rhh'), '123')

WebUI.click(findTestObject('Object Repository/Drafts/Page_MTR Web/input_Add Page_react-aria1827729712-rhh'))

WebUI.setText(findTestObject('Object Repository/Drafts/Page_MTR Web/input_Add Page_react-aria1827729712-rhr'), '123')

WebUI.click(findTestObject('Object Repository/Drafts/Page_MTR Web/input_Add Page_react-aria1827729712-rhr'))

WebUI.setText(findTestObject('Object Repository/Drafts/Page_MTR Web/input_Add Page_react-aria1827729712-ri5'), '123')

WebUI.setText(findTestObject('Object Repository/Drafts/Page_MTR Web/input_Add Page_react-aria1827729712-rif'), '123')

WebUI.setText(findTestObject('Object Repository/Drafts/Page_MTR Web/input_Add Page_react-aria1827729712-rip'), '123')

WebUI.setText(findTestObject('Object Repository/Drafts/Page_MTR Web/input_Add Page_react-aria1827729712-rj3'), '123')

WebUI.click(findTestObject('Object Repository/Drafts/Page_MTR Web/input_Add Page_react-aria1827729712-rj3'))

WebUI.setText(findTestObject('Object Repository/Drafts/Page_MTR Web/input_Add Page_react-aria1827729712-rjd'), '123')

WebUI.setText(findTestObject('Object Repository/Drafts/Page_MTR Web/input_Add Page_react-aria1827729712-rjn'), '123')

WebUI.click(findTestObject('Object Repository/Drafts/Page_MTR Web/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Drafts/Page_MTR Web/li_Successfully added heat 123'))

