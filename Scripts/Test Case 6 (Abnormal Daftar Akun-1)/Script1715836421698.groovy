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

//-------------------------- Masuk Kedalam --------------------------//


String name = 'Daftar Akun Coba'
String email = 'testdaftar@gmail.com'
String password = ''
String confirmPassword = 'XI61MEO8PAA='

WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/input__name'), name )
WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/input__email'), email)
WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/input__password'), password )
WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/input__confirmpassword'), confirmPassword )
	

if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
    println("Error: Ada field yang kosong!")
}	
'Klik term condition'
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/input__termsCondition'))
	
'Klik Tombol Daftar'
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/button_Daftar'))
	
WebUI.takeScreenshot()
WebUI.delay(4)
WebUI.closeBrowser()
