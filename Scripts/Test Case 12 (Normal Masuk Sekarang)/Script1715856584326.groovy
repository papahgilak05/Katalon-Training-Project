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
import com.kms.katalon.core.util.KeywordUtil

// Membuka browser dan mengatur ukuran jendela
WebUI.openBrowser('')
WebUI.maximizeWindow()
//-------------------------- Membuka Website Metrodata Academy --------------------------//
WebUI.navigateToUrl('https://metrodataacademy.id/')

'Berhasil Membuka Website Metrodata Academy'
//screenshoot
WebUI.takeScreenshot()

//-------------------------- Masuk Kedalam Daftar Akun Page --------------------------//
//WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/Button Tiga Garis Di Pojok Kanan Atas'))
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/a_Daftar'))

'Klik Masuk Sekarang'
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/Masuk_Sekarang'))

WebUI.delay(3)

'Redirect ke Halaman Login Page'
WebUI.takeScreenshot()

//-------------------------- Memasukan Inputan Login -------------------------------------//
WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/input__email'), 'papahgilak@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Metrodata Academy/input__password'), 'ANgLrNN9LeX238E+iUxpGw==')
'Melakukan Input Data Login'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/button_Masuk'))
WebUI.delay(4)

//------------------------- Percabangan Kondisi Login -----------------------------------//
if (WebUI.verifyTextPresent('Lihat Program', false)) {
	KeywordUtil.logInfo('Berhasil Login' + WebUI.takeScreenshot())
} else {
	KeywordUtil.logInfo('Gagal Login' + WebUI.takeScreenshot())
}

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/button_M Gilang Rizky Ramadhan'))


//------------------------- Logout -------------------------------------------------------//
WebUI.delay(4)
'Logout'
WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/button_Keluar'))


WebUI.closeBrowser()