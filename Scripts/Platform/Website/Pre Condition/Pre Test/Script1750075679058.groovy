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

'Buka browser'
WebUI.openBrowser('')

'Buka halaman login'
WebUI.navigateToUrl(GlobalVariable.baseURL)

'Isi username yang valid'
WebUI.setText(findTestObject('Object Repository/Browser/Login Pages/Username Field'), 'standard_user')

'Isi password yang valid'
WebUI.setEncryptedText(findTestObject('Object Repository/Browser/Login Pages/Password Field'), 'qcu24s4901FyWDTwXGr6XA==')

'Klik tombol login'
WebUI.click(findTestObject('Object Repository/Browser/Login Pages/Login Button'))

'Pastikan elemen header di halaman produk muncul'
WebUI.verifyElementVisible(findTestObject('Browser/Product List Pages/Header Product'))

'Pastikan elemen header di halaman produk muncul dengan tulisan "Products"'
WebUI.verifyElementText(findTestObject('Browser/Product List Pages/Header Product'), 'Products')

WebUI.delay(2)

