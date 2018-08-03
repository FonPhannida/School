import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('kobiton-store:13131', true)

Mobile.verifyElementExist(findTestObject('login_page/register_button'), 0)

Mobile.tap(findTestObject('login_page/register_button'), 0)

Mobile.verifyElementExist(findTestObject('register/activate_acc_page_message'), 0)

Mobile.tap(findTestObject('register/activatecode'), 0)

Mobile.verifyElementExist(findTestObject('register/activatecode_page_message'), 0)

Mobile.verifyElementExist(findTestObject('register/edit_text_field'), 0)

Mobile.setText(findTestObject('register/edit_text_field'), 'Sodsud456444444444444444444444444444444444444444444444444444444444444444444444444444444', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('register/activate_account_button'), 0)

Mobile.waitForElementPresent(findTestObject('register/warningmessage1'), 0)

Mobile.verifyElementText(findTestObject(null), 'Minimum 5 characters')

Mobile.closeApplication()

