package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import commons_Bankguru.DataHelper;
import commons_Bankguru.GlobalConstants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects_Bankguru.RegisterPO;

public class RegisterStep {
	WebDriver driver;
	static String username, password;
	RegisterPO registerPage;
	DataHelper dataTest;

	@Given("^Open register page$")
	public void openRegisterPage() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(GlobalConstants.BANK_GURU_URL_REGISTER);
		registerPage = new RegisterPO(driver);
		dataTest = new DataHelper();

	}

	@When("^Input Email textbox$")
	public void inputEmailTextbox() {
		registerPage.inputEmailTextbox(dataTest.getEmailAddress());
	}

	@When("^Click Submit button$")
	public void clickSubmitButton() {
		registerPage.clickSubmitButton();
	}

	@When("^Get User and Password infor$")
	public void getUserAndPasswordInfor() {
		username = registerPage.getUserIDText();
		password = registerPage.getPasswordText();
	}

	@When("^Close Page$")
	public void closePage() {
		driver.quit();
	}
}
