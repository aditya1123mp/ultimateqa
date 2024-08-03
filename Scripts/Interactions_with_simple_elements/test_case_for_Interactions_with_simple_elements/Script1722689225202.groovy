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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ultimateqa.com/automation')

WebUI.click(findTestObject('interaction_with_simple_element/link_for_interaction_with_simple_element'))

WebUI.callTestCase(findTestCase('Interactions_with_simple_elements/click_me_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Interactions_with_simple_elements/raise_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Interactions_with_simple_elements/Click_this_button_using_ID'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Interactions_with_simple_elements/click_button_using_class'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Interactions_with_simple_elements/click_button_using_name'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Interactions_with_simple_elements/use_this_link'), [:], FailureHandling.STOP_ON_FAILURE)

