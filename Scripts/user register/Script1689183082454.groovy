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

Mobile.startApplication('C:\\Users\\Iqbal\\Downloads\\app-release-second-hand-gcp.apk', true)

Mobile.tap(findTestObject('Object Repository/register/android.widget.TextView - Akun'), 0)

Mobile.tap(findTestObject('Object Repository/register/android.widget.Button - Masuk'), 0)

Mobile.tap(findTestObject('Object Repository/register/android.widget.TextView - Daftar'), 0)

Mobile.setText(findTestObject('Object Repository/register/android.widget.EditText - Masukkan nama lengkap (1)'), 'iqbal', 
    0)

Mobile.setText(findTestObject('Object Repository/register/android.widget.EditText - Masukkan email'), CustomKeywords.'CustomKeyword.getRandomEmail'('random', '@gmail.com'), 
    0)

Mobile.setText(findTestObject('Object Repository/register/android.widget.EditText - Masukkan password'), '123456', 0)

Mobile.setText(findTestObject('register/android.widget.EditText - Masukkan password'), '123456', 0)

Mobile.setText(findTestObject('Object Repository/register/android.widget.EditText - Contoh 08123456789'), '0812345667', 
    0)

Mobile.setText(findTestObject('Object Repository/register/android.widget.EditText - Masukkan kota'), 'Papua', 0)

Mobile.setText(findTestObject('Object Repository/register/android.widget.EditText - Masukkan alamat'), 'jalan kemana ya', 
    0)

Mobile.tap(findTestObject('Object Repository/register/android.widget.Button - Daftar'), 0)

Mobile.closeApplication()

