package pageObjects_Bankguru;

import org.openqa.selenium.WebDriver;

import commons_Bankguru.BasePage;
import pageUI_Bankguru.RegisterPageUI;

public class RegisterPO extends BasePage {
	private WebDriver driver;

	public RegisterPO(WebDriver driver) {
		this.driver = driver;
	}

	public void inputEmailTextbox(String email) {
		waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
	}

	public void clickSubmitButton() {
		waitForElementClickable(driver, RegisterPageUI.SUBMIT_BUTTON);
		clickToElement(driver, RegisterPageUI.SUBMIT_BUTTON);
	}

	public String getUserIDText() {
		waitForElementVisible(driver, RegisterPageUI.USER_ID_VALUE);
		return getElementText(driver, RegisterPageUI.USER_ID_VALUE);
	}

	public String getPasswordText() {
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_VALUE);
		return getElementText(driver, RegisterPageUI.PASSWORD_VALUE);
	}

	// public void openLoginPage() {
	// driver.get(GlobalConstants.BANK_GURU_URL_Login);
	//
	// }

}
