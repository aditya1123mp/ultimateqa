import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

WebUI.verifyElementClickable(findTestObject('Object Repository/interaction_with_simple_element/click_this_button_using_id'))

WebUI.click(findTestObject('Object Repository/interaction_with_simple_element/click_this_button_using_id'))

WebUI.delay(3)

message = WebUI.getText(findTestObject('Object Repository/interaction_with_simple_element/to_verify_heading'))

System.out.println(message)

if (message == 'Button success') {
    KeywordUtil.markPassed('first name is same')
} else {
    KeywordUtil.markFailed('first name is not same')
}

WebUI.click(findTestObject('Object Repository/interaction_with_simple_element/comment_box'))

WebUI.setText(findTestObject('Object Repository/interaction_with_simple_element/comment_box'), GlobalVariable.commenttext)

WebUI.click(findTestObject('Object Repository/interaction_with_simple_element/name_text_b0x'))

WebUI.setText(findTestObject('Object Repository/interaction_with_simple_element/name_text_b0x'), 'First_name_' + RandomStringUtils.randomAlphabetic(
	6))

WebUI.click(findTestObject('Object Repository/interaction_with_simple_element/email_text_box'))

WebUI.setText(findTestObject('Object Repository/interaction_with_simple_element/email_text_box'), 'username' + RandomStringUtils.randomAlphabetic(
	6) + '@'+'gmail.com')


WebUI.click(findTestObject('Object Repository/interaction_with_simple_element/website_textbox'))

WebUI.setText(findTestObject('Object Repository/interaction_with_simple_element/website_textbox'), 'username' + RandomStringUtils.randomAlphabetic(
	6) + '.com')

WebUI.click(findTestObject('Object Repository/interaction_with_simple_element/name_text_b0x'))

name = WebUI.getAttribute(findTestObject('Object Repository/interaction_with_simple_element/name_text_b0x'),'value')

System.out.println(name)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/interaction_with_simple_element/submit_comment_button'))

