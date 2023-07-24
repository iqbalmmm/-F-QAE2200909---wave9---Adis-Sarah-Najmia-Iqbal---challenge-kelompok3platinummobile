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

WebUI.callTestCase(findTestCase('Common - QA-Audyna/Start Application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Login/Click account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Login/Button masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Login/Input email'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Login/Input password'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Login/Button masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/QA-Audyna/Add Items - Audyna/Click Button for Add a New Product'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('QA-Audyna/Add Items - Audyna/android.widget.EditText - Nama Produk (2)'), '', 0)

Mobile.setText(findTestObject('QA-Audyna/Add Items - Audyna/android.widget.EditText - Rp 0,00 (1)'), '', 0)

WebUI.callTestCase(findTestCase('Pages/QA-Audyna/Add Items - Audyna/Select Category'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/QA-Audyna/Add Items - Audyna/Input Location Product'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/QA-Audyna/Add Items - Audyna/Click Button for Publish'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Pages/QA-Audyna/Add Items - Audyna/Input Description Product'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Pages/QA-Audyna/Add Items - Audyna/Add Image Product'), [:], FailureHandling.OPTIONAL)

Mobile.closeApplication()

