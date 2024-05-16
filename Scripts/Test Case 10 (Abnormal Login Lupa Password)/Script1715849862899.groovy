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
//-------------------------- Membuka Website Metrodata Academy --------------------------//
WebUI.navigateToUrl('https://metrodataacademy.id/')

'Berhasil Membuka Website Metrodata Academy'
WebUI.takeScreenshot()

//-------------------------- Masuk Kedalam Login Page --------------------------//
//WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/Button Tiga Garis Di Pojok Kanan Atas'))
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/a_Masuk'))

//-------------------------- Masuk Kedalam --------------------------//
'klik Lupa Password?'
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/a_Lupa Password'))

WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/input__email'), 'coba.mail')
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/button_Atur_Ulang'))

WebUI.takeScreenshot()

WebUI.delay(4)

WebUI.closeBrowser()
