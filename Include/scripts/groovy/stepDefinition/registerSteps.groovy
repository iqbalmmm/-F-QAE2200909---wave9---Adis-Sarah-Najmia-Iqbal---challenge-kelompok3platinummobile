package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class registerSteps {
	@Given("user start application and navigate to url {string}")
	public void user_start_application_and_navigate_to_url(String string) {
		Mobile.startApplication('C:\\Users\\Iqbal\\Downloads\\app-release-second-hand-gcp.apk', true)
	}

	@When("user click account")
	public void user_click_account() {
		Mobile.tap(findTestObject('Object Repository/register/android.widget.TextView - Akun'), 0)
	}

	@When("user click masuk")
	public void user_click_masuk() {
		Mobile.tap(findTestObject('Object Repository/register/android.widget.Button - Masuk'), 0)
	}

	@When("user click daftar in register page")
	public void user_click_daftar_in_register_page() {
		Mobile.tap(findTestObject('Object Repository/register/android.widget.TextView - Daftar'), 0)
	}

	@Then("user insert name")
	public void user_insert_name() {
		Mobile.setText(findTestObject('Object Repository/register/android.widget.EditText - Masukkan nama lengkap (1)'), 'iqbal', 0)
	}

	@Then("user not insert name")
	public void user_not_insert_name() {
		Mobile.setText(findTestObject('Object Repository/register/android.widget.EditText - Masukkan nama lengkap (1)'),'', 0)
	}

	@Then("user insert email")
	public void user_insert_email() {
		Mobile.setText(findTestObject('Object Repository/register/android.widget.EditText - Masukkan email'), CustomKeywords.'CustomKeyword.getRandomEmail'('random', '@gmail.com'), 0)
	}

	@Then("user not insert email")
	public void user_not_insert_email() {
		Mobile.setText(findTestObject('Object Repository/register/android.widget.EditText - Masukkan email'), '', 0)
	}
	@Then("user insert password")
	public void user_insert_password() {
		Mobile.setText(findTestObject('Object Repository/register/android.widget.EditText - Masukkan password'), '123456', 0)
	}

	@Then("user insert phone number")
	public void user_insert_phone_number() {
		Mobile.setText(findTestObject('Object Repository/register/android.widget.EditText - Contoh 08123456789'), '0812345667',  0)
	}

	@Then("user insert city")
	public void user_insert_city() {
		Mobile.setText(findTestObject('Object Repository/register/android.widget.EditText - Masukkan kota'), 'Papua', 0)
	}

	@Then("user insert address")
	public void user_insert_address() {
		Mobile.setText(findTestObject('Object Repository/register/android.widget.EditText - Masukkan alamat'), 'jalan kemana ya',   0)
	}

	@Then("user click daftar")
	public void user_click_daftar() {
		Mobile.tap(findTestObject('Object Repository/register/android.widget.Button - Daftar'), 0)
	}
}