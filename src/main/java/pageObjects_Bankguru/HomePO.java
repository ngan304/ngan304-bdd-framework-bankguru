package pageObjects_Bankguru;

import org.openqa.selenium.WebDriver;

import commons_Bankguru.BasePage;
import pageUI_Bankguru.HomePageUI;

public class HomePO extends BasePage {
	WebDriver driver;

	public HomePO(WebDriver driver) {
		this.driver = driver;
	}

	public void goToNewCustormerPage() {
		waitForElementVisible(driver, HomePageUI.NEW_CUSTOMER_LINK);
		clickToElement(driver, HomePageUI.NEW_CUSTOMER_LINK);

	}

}
