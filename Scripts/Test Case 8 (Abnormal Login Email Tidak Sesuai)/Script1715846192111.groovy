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

//-------------------------- Membuka Browser --------------------------------------------//
WebUI.openBrowser('')
WebUI.maximizeWindow()

//-------------------------- Membuka Website Metrodata Academy --------------------------//
WebUI.navigateToUrl('https://metrodataacademy.id/')
'Berhasil Membuka Website Metrodata Academy'
WebUI.takeScreenshot()
//WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/path'))

//-------------------------- Masuk Kedalam Login Page ------------------------------------//
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/input__email'), 'papahgil@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Metrodata Academy/input__password'), 'ANgLrNN9LeX238E+iUxpGw==')
'Melakukan Input Data Login'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/button_Masuk'))

if(WebUI.verifyTextPresent("Try Again", false))
{
	'Hasil Sesuai dan Gagal Login'
	WebUI.takeScreenshot()
}else {
	'Hasil tidak sesuai dan Berhasil Login'
	WebUI.takeScreenshot()
}

WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/button_Try Again'))
WebUI.closeBrowser()

