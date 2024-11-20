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

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/div_Sign in                                _3e62ce'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt (1)'), 'marben.dimson@porterpipe.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/div_marben.dimsonporterpipe.com            _eac0ff'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd (1)'), 
    'ayNFi9n8PEAw7J4CRxdLUA==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Do this to reduce the number of times_edee07 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Pipeline Marketing/span_Announcement'))

WebUI.click(findTestObject('Object Repository/Page_Pipeline Marketing/svg_Show_size-8 text-white'))

WebUI.setText(findTestObject('Object Repository/Page_Pipeline Marketing/input_Title_title (1)'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_Pipeline Marketing/textarea_Announcement Description_description'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Page_Pipeline Marketing/input_Contact Number_contactNumber'), '1234567890')

WebUI.setText(findTestObject('Object Repository/Page_Pipeline Marketing/input_URL Link_urlLink'), 'test.com')

WebUI.setText(findTestObject('Object Repository/Page_Pipeline Marketing/input_Start Date_startDate (1)'), '26112024')

WebUI.setText(findTestObject('Object Repository/Page_Pipeline Marketing/textarea_Notes_note (1)'), 'test')

WebUI.click(findTestObject('Object Repository/Page_Pipeline Marketing/button_Save (1)'))

WebUI.click(findTestObject('Object Repository/Page_Pipeline Marketing/button_Close (1)'))

