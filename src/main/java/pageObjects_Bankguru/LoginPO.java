package pageObjects_Bankguru;

import org.openqa.selenium.WebDriver;

import commons_Bankguru.BasePage;
import pageUI_Bankguru.LoginPageUI;

public class LoginPO extends BasePage {
	WebDriver driver;

	public LoginPO(WebDriver driver) {
		this.driver = driver;

	}

	public void inputUserIDTextbox(String userIDValue) {
		waitForElementVisible(driver, LoginPageUI.USER_ID_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.USER_ID_TEXTBOX, userIDValue);
	}

	public void inputPasswordTextbox(String password) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
	}

	public void clickToLoginButton() {
		waitForElementVisible(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
	}

}
