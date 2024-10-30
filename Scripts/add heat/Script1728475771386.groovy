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

WebUI.setText(findTestObject('Object Repository/M T R/MTR/MTRV2/Page_Sign in to your account/input_Sign in_loginfmt'), 'marben.dimson@porterpipe.com')

WebUI.click(findTestObject('Object Repository/M T R/MTR/MTRV2/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/M T R/MTR/MTRV2/Page_Sign in to your account/input_Enter password_passwd'), 
    'ayNFi9n8PEAw7J4CRxdLUA==')

WebUI.click(findTestObject('Object Repository/M T R/MTR/MTRV2/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/M T R/MTR/MTRV2/Page_Sign in to your account/input_Do this to reduce the number of times_edee07'))

WebUI.click(findTestObject('Object Repository/M T R/MTR/MTRV2/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/M T R/MTR/Page_MTR Web/button_Add HEAT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/M T R/MTR/Page_MTR Web/button_From computer'), 10)

///Upload Files
TestObject fileInput = findTestObject('Object Repository/M T R/MTR/Page_Sign in to your account/upload from computer')

WebUI.sendKeys(fileInput, 'C:\\Users\\Triseed\\Downloads')

WebUI.click(findTestObject('M T R/MTR/Page_MTR Web/button_Next'))

WebUI.setText(findTestObject('Object Repository/M T R/MTR/MTRV2/Page_MTR Web/input_Add Page_react-aria9327618227-r4j'), '123')

WebUI.setText(findTestObject('Object Repository/M T R/MTR/MTRV2/Page_MTR Web/input_Add Page_react-aria9327618227-r4t'), 'TEST')

WebUI.setText(findTestObject('Object Repository/M T R/MTR/MTRV2/Page_MTR Web/input_Add Page_react-aria9327618227-r57'), 'TEST')

WebUI.setText(findTestObject('Object Repository/M T R/MTR/MTRV2/Page_MTR Web/input_Completed_react-aria9327618227-r5h'), '123')

WebUI.setText(findTestObject('Object Repository/M T R/MTR/MTRV2/Page_MTR Web/input_Completed_react-aria9327618227-r5r'), '12')

WebUI.setText(findTestObject('Object Repository/M T R/MTR/MTRV2/Page_MTR Web/input_Completed_react-aria9327618227-r65'), '1')

WebUI.click(findTestObject('Object Repository/M T R/MTR/MTRV2/Page_MTR Web/input_Completed_react-aria9327618227-r65'))

WebUI.setText(findTestObject('Object Repository/M T R/MTR/MTRV2/Page_MTR Web/input_Completed_react-aria9327618227-r6f'), '123')

WebUI.setText(findTestObject('Object Repository/M T R/MTR/MTRV2/Page_MTR Web/input_Completed_react-aria9327618227-r6p'), '123')

WebUI.setText(findTestObject('M T R/MTR/Page_MTR Web/dropdown_textbox'), '1')

WebUI.sendKeys(findTestObject('M T R/MTR/Page_MTR Web/dropdown_textbox'), Keys.chord(Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('M T R/MTR/Page_MTR Web/dropdown_textbox'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('M T R/MTR/Page_MTR Web/button_Save'))

WebUI.verifyElementVisible(findTestObject('M T R/Page_MTR Web/td_TEST'))

WebUI.closeBrowser()

