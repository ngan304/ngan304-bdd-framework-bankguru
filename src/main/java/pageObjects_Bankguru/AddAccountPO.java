package pageObjects_Bankguru;

import org.openqa.selenium.WebDriver;

import commons_Bankguru.BasePage;
import pageUI_Bankguru.AccountPageUI;

public class AddAccountPO extends BasePage {
	WebDriver driver;

	public AddAccountPO(WebDriver driver) {
		this.driver = driver;
	}

	public void inputCustomerID(String customerID) {
		waitForElementVisible(driver, AccountPageUI.CUSTOMER_ID_TEXTBOX);
		sendkeyToElement(driver, AccountPageUI.CUSTOMER_ID_TEXTBOX, customerID);
	}

	public void inputInitialDeposit(String deposit) {
		waitForElementVisible(driver, AccountPageUI.INITITAL_DEPOSIT_TEXTBOX);
		sendkeyToElement(driver, AccountPageUI.INITITAL_DEPOSIT_TEXTBOX, deposit);

	}

	public void clickSubmitToCreateNewAccount() {
		waitForElementClickable(driver, AccountPageUI.SUBMIT_ACC_BUTTON);
		clickToElement(driver, AccountPageUI.SUBMIT_ACC_BUTTON);
	}

	public boolean isMessageAccDisplayed() {
		waitForElementVisible(driver, AccountPageUI.SUCCESS_MESSAGE_ACC);
		return isElementDisplayed(driver, AccountPageUI.SUCCESS_MESSAGE_ACC);
	}

	public void clickDepositLink() {
		waitForElementClickable(driver, AccountPageUI.DEPOSIT_LINK);
		clickToElement(driver, AccountPageUI.DEPOSIT_LINK);

	}

}
