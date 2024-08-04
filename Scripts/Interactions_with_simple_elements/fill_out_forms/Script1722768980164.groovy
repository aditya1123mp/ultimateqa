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
import org.openqa.selenium.WebElement
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.ObjectRepository as OR
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ultimateqa.com/automation')

WebUI.click(findTestObject('Object Repository/simple_controls/fill_out_forms'))

WebUI.click(findTestObject('Object Repository/simple_controls/first_name_box'))

WebUI.setText(findTestObject('Object Repository/simple_controls/first_name_box'), 'First_name_' + RandomStringUtils.randomAlphabetic(
        6))

WebUI.click(findTestObject('Object Repository/simple_controls/comment_box_001'))

WebUI.setText(findTestObject('Object Repository/simple_controls/comment_box_001'), GlobalVariable.commenttext)

WebUI.click(findTestObject('Object Repository/simple_controls/submit_button_001'))

WebUI.click(findTestObject('simple_controls/second_name_box'))

WebUI.setText(findTestObject('simple_controls/second_name_box'), 'First_name_' + RandomStringUtils.randomAlphabetic(6))

WebUI.click(findTestObject('simple_controls/second_comment_box'))

WebUI.setText(findTestObject('simple_controls/second_comment_box'), GlobalVariable.commenttext)

// Define the XPaths for the captcha question and answer
String captchaQuestionXpath = "//span[@class='et_pb_contact_captcha_question']"
String captchaAnswerXpath = "//input[@class='input et_pb_contact_captcha']"

// Get the captcha question element
TestObject captchaQuestionObject = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, captchaQuestionXpath)
WebElement captchaQuestionElement = WebUiCommonHelper.findWebElement(captchaQuestionObject, 30)

// Get the captcha question text
String question = captchaQuestionElement.getText().replaceAll('[^0-9+\\-*/]', '').trim()

// Evaluate the arithmetic expression
def evaluate = { expression ->
    def engine = new groovy.text.GStringTemplateEngine()
    def binding = [:]
    def template = new groovy.text.SimpleTemplateEngine().createTemplate("\${$expression}")
    return template.make(binding).toString().toInteger()
}
def result = evaluate(question)

// Get the captcha answer element
TestObject captchaAnswerObject = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, captchaAnswerXpath)

// Set the result in the answer input field
WebUI.setText(captchaAnswerObject, result.toString())


WebUI.click(findTestObject('simple_controls/submit_button_002'))

