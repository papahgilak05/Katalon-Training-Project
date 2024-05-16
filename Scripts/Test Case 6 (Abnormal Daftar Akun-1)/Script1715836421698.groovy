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

//------------------------Ambil data dari excell----------------------------
String pathData = 'Data Files/data_excel_daftar_akun_abnormal'

def hitungbarisexcel = findTestData(pathData).getRowNumbers()


// Membuka browser dan mengatur ukuran jendela
WebUI.openBrowser('')
WebUI.maximizeWindow()

//-------------------------- Membuka Website Metrodata Academy --------------------------//
WebUI.navigateToUrl('https://metrodataacademy.id/')

'Berhasil Membuka Website Metrodata Academy'
//screenshoot
WebUI.takeScreenshot()

//-------------------------- Masuk Kedalam Login Page --------------------------//
//WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/Button Tiga Garis Di Pojok Kanan Atas'))
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/a_Daftar'))

WebUI.delay(2)

//-------------------------- Masuk Kedalam Daftar Akun --------------------------//
'Mengisi Formulir Pendaftaran'
// Memulai perulangan untuk mengisi formulir pendaftaran dengan data dari Excel

for ( int i = 1; i <= hitungbarisexcel.toInteger(); i++) {
	try {
	String nama_lengkap = findTestData(pathData).getValue('nama_lengkap', i)
	String email = findTestData(pathData).getValue('email', i)
	String password = findTestData(pathData).getValue('password', i)
	String confirm_password = findTestData(pathData).getValue('confirm_password', i)

//------------------------------Cek Get Value Hasil Perulangan-------------------------
	println("Nama Lengkap ke-"+i+" adalah "+nama_lengkap)
	println("Email ke-"+i+" adalah "+email)
	println("Password ke-"+i+" adalah "+password)
	println("Konfirmasi Password ke-"+i+" adalah "+confirm_password)
	
// Mengisi formulir pendaftaran dengan data dari Excel
	WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/input__name'), nama_lengkap)
	WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/input__email'), email)
	WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/input__password'), password)
	WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/input__confirmpassword'), confirm_password)
	
	'Klik term condition'
	WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/input__termsCondition'))
	
	'Klik Tombol Daftar'
	WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/button_Daftar'))
	
	WebUI.takeScreenshot()
	WebUI.delay(2)

// Memastikan tidak ada field yang kosong sebelum mengisi formulir
    if (nama_lengkap.isEmpty() || email.isEmpty() || password.isEmpty() || confirm_password.isEmpty()) {
        println("Error: Ada field yang kosong untuk perulangan ke-" + i + ". Pastikan semua field di isi.")
    }
	
} catch (Exception e) {
	println(e.getMessage())
	
	// Lanjutkan ke iterasi berikutnya jika terjadi kesalahan
	continue
    }
}

'Klik term condition'
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/input__termsCondition'))
'Klik Tombol Daftar'
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/button_Daftar'))

WebUI.takeScreenshot()
WebUI.delay(4)
WebUI.takeScreenshot()
WebUI.closeBrowser()
