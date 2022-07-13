package pageObjects_Bankguru;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons_Bankguru.BasePage;
import pageUI_Bankguru.NewCustomerPageUI;

public class NewCustomerPO extends BasePage {
	WebDriver driver;
	JavascriptExecutor executor;

	public NewCustomerPO(WebDriver driver) {
		this.driver = driver;
		executor = (JavascriptExecutor) driver;
	}

	public void inputNameTextbox(String name) {
		waitForElementVisible(driver, NewCustomerPageUI.CUSTOMER_NAME);
		sendkeyToElement(driver, NewCustomerPageUI.CUSTOMER_NAME, name);

	}

	public void selectFemaleForGenger() {
		waitForElementVisible(driver, NewCustomerPageUI.GENDER_FEMALE);
		clickToElement(driver, NewCustomerPageUI.GENDER_FEMALE);

	}

	public void inputDoBTextbox(String dob) {
		waitForElementVisible(driver, NewCustomerPageUI.DOB);
		WebElement element = driver.findElement(By.id("dob"));
		element.sendKeys(dob);
	}

	public void inputCityTextbox(String city) {
		waitForElementVisible(driver, NewCustomerPageUI.CITY_TEXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.CITY_TEXTBOX, city);

	}

	public void inputAddressTextbox(String address) {
		waitForElementVisible(driver, NewCustomerPageUI.ADDRESS_TEXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.ADDRESS_TEXTBOX, address);

	}

	public void inputStateTextbox(String state) {
		waitForElementVisible(driver, NewCustomerPageUI.STATE_TEXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.STATE_TEXTBOX, state);

	}

	public void inputPinTextbox(String pin) {
		waitForElementVisible(driver, NewCustomerPageUI.PIN_TEXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.PIN_TEXTBOX, pin);

	}

	public void inputMobileTextbox(String mobile) {
		waitForElementVisible(driver, NewCustomerPageUI.MOBILE_TEXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.MOBILE_TEXTBOX, mobile);

	}

	public void inputEmailTextbox(String email) {
		waitForElementVisible(driver, NewCustomerPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.EMAIL_TEXTBOX, email);

	}

	public void inputPasswordTextbox(String password) {
		waitForElementVisible(driver, NewCustomerPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.PASSWORD_TEXTBOX, password);

	}

	public void clickOnSubmitButton() {
		waitForElementVisible(driver, NewCustomerPageUI.SUBMIT_BUTTON);
		clickToElement(driver, NewCustomerPageUI.SUBMIT_BUTTON);
	}

	public boolean isMessageDiplayed() {
		waitForElementVisible(driver, NewCustomerPageUI.SUSSESS_MESSAGE);
		return isElementDisplayed(driver, NewCustomerPageUI.SUSSESS_MESSAGE);
	}

	public String getCustomerID() {
		waitForElementVisible(driver, NewCustomerPageUI.CUSTOMER_ID);
		return getElementText(driver, NewCustomerPageUI.CUSTOMER_ID);

	}

	public void clickOnNewAccountLink() {
		waitForElementClickable(driver, NewCustomerPageUI.NEW_ACCOUNT_LINK);
		clickToElement(driver, NewCustomerPageUI.NEW_ACCOUNT_LINK);
	}

}
