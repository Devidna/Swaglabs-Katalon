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

'Klik Checkout'
WebUI.click(findTestObject('Browser/Checkout Pages/Button Checkout'))

'Masukkan informasi pelanggan (First Name)'
WebUI.sendKeys(findTestObject('Browser/Checkout Pages/First Name Field'), GlobalVariable.firstName)

'Masukkan informasi pelanggan (Last Name)'
WebUI.sendKeys(findTestObject('Browser/Checkout Pages/Last Name Field'), GlobalVariable.lastName)

'Masukkan informasi pelanggan (Zip/Postal Code)'
WebUI.sendKeys(findTestObject('Browser/Checkout Pages/Postal Code Field'), GlobalVariable.postalCode)

'Klik Continue'
WebUI.click(findTestObject('Browser/Checkout Pages/Button Continue'))

url = WebUI.getUrl()

assert url.equals('https://www.saucedemo.com/v1/checkout-step-two.html')

WebUI.delay(1)

