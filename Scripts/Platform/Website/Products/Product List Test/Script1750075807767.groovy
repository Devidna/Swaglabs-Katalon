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

'Login dengan user valid\r\n'
WebUI.callTestCase(findTestCase('Platform/Website/Pre Condition/Pre Test'), [:], FailureHandling.STOP_ON_FAILURE)

'Daftar produk muncul lengkap dengan nama, harga, dan tombol Add to Cart'
WebUI.verifyElementVisible(findTestObject('Browser/Product List Pages/Product Titles'))

WebUI.verifyElementVisible(findTestObject('Browser/Product List Pages/Product Prices'))

WebUI.verifyElementVisible(findTestObject('Browser/Product List Pages/Button Add to Carts'))

productTitles = WebUI.findWebElements(findTestObject('Browser/Product List Pages/Product Titles'), 0)

productPrices = WebUI.findWebElements(findTestObject('Browser/Product List Pages/Product Prices'), 0)

productAddToCarts = WebUI.findWebElements(findTestObject('Browser/Product List Pages/Button Add to Carts'), 0)

'Nama Produk ada lebih dari 0'
assert productTitles.size() > 0

'Harga Produk ada lebih dari 0'
assert productPrices.size() > 0

'Button add to carts ada lebih dari 0'
assert productAddToCarts.size() > 0

WebUI.closeBrowser()

