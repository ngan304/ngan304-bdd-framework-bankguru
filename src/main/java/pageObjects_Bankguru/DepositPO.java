package pageObjects_Bankguru;

import org.openqa.selenium.WebDriver;

import commons_Bankguru.BasePage;
import pageUI_Bankguru.DepositUI;

public class DepositPO extends BasePage {
	WebDriver driver;

	public DepositPO(WebDriver driver) {
		this.driver = driver;
	}

	public void inputAccountNoTextBox(String accountNo) {
		waitForElementVisible(driver, DepositUI.ACCOUNT_NO_TEXTBOX);
		sendkeyToElement(driver, DepositUI.ACCOUNT_NO_TEXTBOX, accountNo);
	}

	public void inputAmountTextbox(String amount) {
		waitForElementVisible(driver, DepositUI.AMOUNT_TEXTBOX);
		sendkeyToElement(driver, DepositUI.AMOUNT_TEXTBOX, amount);

	}

	public void inputDescriptionTextbox(String description) {
		waitForElementVisible(driver, DepositUI.DESCRIPTION_TEXTBOX);
		sendkeyToElement(driver, DepositUI.DESCRIPTION_TEXTBOX, description);

	}

	public void clickOnSubmitButtonToDeposit() {
		waitForElementClickable(driver, DepositUI.SUBMIT_BUTTON_DEPOSIT);
		clickToElement(driver, DepositUI.SUBMIT_BUTTON_DEPOSIT);
	}

}
