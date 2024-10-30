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

WebUI.setText(findTestObject('Object Repository/Create Packet/Page_Sign in to your account/input_Sign in_loginfmt'), 'marben.dimson@porterpipe.com')

WebUI.click(findTestObject('Object Repository/Create Packet/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Create Packet/Page_Sign in to your account/input_Enter password_passwd'), 
    'ayNFi9n8PEAw7J4CRxdLUA==')

WebUI.click(findTestObject('Object Repository/Create Packet/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Create Packet/Page_Sign in to your account/label_Dont show this again'))

WebUI.click(findTestObject('Object Repository/Create Packet/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Create Packet/Page_MTR Web/button_Create Packet'))

WebUI.setText(findTestObject('Object Repository/Create Packet/Page_MTR Web/input_Next_react-aria678189088-r75'), '123')

WebUI.click(findTestObject('Create Packet/Page_MTR Web/svg_Next_lucide lucide-chevron-down'))

///
WebUI.sendKeys(findTestObject('Object Repository/Create Packet/Page_MTR Web/svg_Next_lucide lucide-chevron-down'), Keys.chord(
        Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('Object Repository/Create Packet/Page_MTR Web/svg_Next_lucide lucide-chevron-down'), Keys.chord(
        Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('Object Repository/Create Packet/Page_MTR Web/svg_Next_lucide lucide-chevron-down'), Keys.chord(
        Keys.ENTER))

//
WebUI.click(findTestObject('Create Packet/Page_MTR Web/input_Next_react-aria678189088-r5d'))

WebUI.setText(findTestObject('Create Packet/Page_MTR Web/input_Next_react-aria678189088-r5d'), '123')

WebUI.click(findTestObject('Object Repository/Create Packet/Page_MTR Web/button_Add Page'))

WebUI.click(findTestObject('Create Packet/Page_MTR Web/div_From HEAT'))

WebUI.click(findTestObject('Object Repository/Create Packet/Page_MTR Web/div_CUST PO_outline-none ease-in-out flex s_b28eec'))

//
WebUI.sendKeys(findTestObject('Object Repository/Create Packet/Page_MTR Web/svg_CUST PO_lucide lucide-chevron-down'), Keys.chord(
        Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('Object Repository/Create Packet/Page_MTR Web/svg_CUST PO_lucide lucide-chevron-down'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Create Packet/Page_MTR Web/button_Add (1)'))

WebUI.click(findTestObject('Create Packet/Page_MTR Web/button_Generate'))

WebUI.click(findTestObject('Create Packet/Page_MTR Web/button_Save'))

