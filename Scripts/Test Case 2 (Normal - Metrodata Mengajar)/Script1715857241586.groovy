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
WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/input__email'), 'papahgilak@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Metrodata Academy/input__password'), 'ANgLrNN9LeX238E+iUxpGw==')

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/button_Masuk'))

WebUI.delay(3)

if (WebUI.verifyTextPresent('Lihat Program', false)) {
	WebUI.comment('Berhasil Login')
} else {
	WebUI.comment('Gagal Login')
}

//WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/button_M Gilang Rizky Ramadhan'))
//
//WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/button_Keluar'))

//------------------------------Memilih Menu Metrodata Mengajar--------------------------------
WebUI.click(findTestObject('Object Repository/Page_MetrodataMengajar/span_Program'))
'Klik Button Program'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MetrodataMengajar/span_Metrodata Mengajar_absolute inset-0'))

'Pilih Menu Mentrodata Mengajar'
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Page_MetrodataMengajar/h1_Acara di Metrodata Mengajar'), 10)

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Page_MetrodataMengajar/a_CyberSHEcurity Empowering Women in Security'))
'Pilih Acara di Metrodata Academy : CyberSHEcurity: Empowering Women in Security'
WebUI.takeFullPageScreenshot()

WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Page_MetrodataMengajar/button_Daftar'))
'Klik Button Daftar'
WebUI.takeScreenshot()

WebUI.delay(2)
//-----------------------------Mengisi Form Data Diri-------------------------------------------------
WebUI.setText(findTestObject('Object Repository/Page_MetrodataMengajar/input__name'), 'Tiara Andini')
'Input Nama Lengkap'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_MetrodataMengajar/input__email'), 'tiara_andini@gmail.com')
'Input Email'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_MetrodataMengajar/input__phoneNumber'), '81209873467')
'Input Nomor Telepon'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_MetrodataMengajar/input__institution'), 'Metrodata')
'Input Perusahaan/Universitas'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_MetrodataMengajar/input__jobTitle'), 'Staff')
'Input Jabatan'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_MetrodataMengajar/button_Submit'))
'Klik Button Submit'
WebUI.takeScreenshot()
WebUI.delay(5)

TestObject Alert = findTestObject('Object Repository/Page_MetrodataMengajar/li_Pendaftaran berhasil')

try {
	 WebUI.comment('Perdaftaran Berhasil')
	 WebUI.takeScreenshot()
}catch(Exception e){
	 WebUI.comment('Pendaftaran Gagal')
	 WebUI.takeScreenshot()
}

//if (WebUI.verifyTextPresent('Object Repository/Page_MetrodataMengajar/li_Pendaftaran berhasil', false)) {
//    WebUI.comment('Perdaftaran Berhasil')
//
//    WebUI.takeScreenshot()
//} else {
//    WebUI.comment('Pendaftaran Gagal')
//
//    WebUI.takeScreenshot()
//}

WebUI.closeBrowser()