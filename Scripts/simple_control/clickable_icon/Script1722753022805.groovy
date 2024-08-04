import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ultimateqa.com/automation')

WebUI.click(findTestObject('interaction_with_simple_element/link_for_interaction_with_simple_element'))

WebUI.click(findTestObject('Object Repository/simple_controls/clickable_icon_name'))

WebUI.setText(findTestObject('Object Repository/simple_controls/clickable_icon_name'), 'First_name_' + RandomStringUtils.randomAlphabetic(
        6))

WebUI.click(findTestObject('Object Repository/simple_controls/clickable_icon_email'))

WebUI.setText(findTestObject('Object Repository/simple_controls/clickable_icon_email'), (('name' + RandomStringUtils.randomAlphabetic(
        6)) + '@') + 'gmail.com')

WebUI.click(findTestObject('Object Repository/simple_controls/send_email_button'))

WebUI.delay(3)

message = WebUI.getText(findTestObject('Object Repository/simple_controls/for_mail_success_message'))

System.out.println(message)

if (message == 'Thanks for contacting us') {
    KeywordUtil.markPassed('the messsage is same')
} else {
    KeywordUtil.markFailed('the message is not same')
}



