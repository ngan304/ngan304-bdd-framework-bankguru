package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import commons_Bankguru.DataHelper;
import commons_Bankguru.GlobalConstants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects_Bankguru.AddAccountPO;
import pageObjects_Bankguru.DepositPO;
import pageObjects_Bankguru.HomePO;
import pageObjects_Bankguru.LoginPO;
import pageObjects_Bankguru.NewCustomerPO;

public class CreateNewCustmerSteps {
	WebDriver driver;
	LoginPO loginPage;
	HomePO homePage;
	NewCustomerPO customerPage;
	AddAccountPO accountPage;
	DepositPO depositPage;
	DataHelper dataTest;
	String customerID;

	@Given("^Go to Login page$")
	public void goToLoginPage() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(GlobalConstants.BANK_GURU_URL_Login);
		loginPage = new LoginPO(driver);
		homePage = new HomePO(driver);
		customerPage = new NewCustomerPO(driver);
		accountPage = new AddAccountPO(driver);
		depositPage = new DepositPO(driver);
		dataTest = new DataHelper();

	}

	@When("^Submit valid info on login form$")
	public void submitValidInfoOnLoginForm() {

		loginPage.inputUserIDTextbox(RegisterStep.username);
		loginPage.inputPasswordTextbox(RegisterStep.password);
		loginPage.clickToLoginButton();

	}

	@When("^Open New Customer Page$")
	public void openNewCustomerPage() {
		homePage.goToNewCustormerPage();

		sleepInSecond(5);
	}

	@When("^Input Name textbox with \"([^\"]*)\"$")
	public void inputNameTextboxWith(String Name) {
		customerPage.inputNameTextbox(Name);

	}

	@When("^Select female for Genger$")
	public void selectFemaleForGenger() {
		customerPage.selectFemaleForGenger();
	}

	@When("^Input DoB textbox with \"([^\"]*)\"$")
	public void inputDoBTextboxWith(String DateOfBirth) {
		customerPage.inputDoBTextbox(DateOfBirth);
	}

	@When("^Input Address textbox with \"([^\"]*)\"$")
	public void inputAddressTextboxWith(String Address) {
		customerPage.inputAddressTextbox(Address);
	}

	@When("^Input City textbox with \"([^\"]*)\"$")
	public void inputCityTextboxWith(String City) {
		customerPage.inputCityTextbox(City);
	}

	@When("^Input State textbox with \"([^\"]*)\"$")
	public void inputStateTextboxWith(String State) {
		customerPage.inputStateTextbox(State);
	}

	@When("^Input Pin textbox with \"([^\"]*)\"$")
	public void inputPinTextboxWith(String Pin) {
		customerPage.inputPinTextbox(Pin);
	}

	@When("^Input Mobile textbox with \"([^\"]*)\"$")
	public void inputMobileTextboxWith(String Mobile) {
		customerPage.inputMobileTextbox(Mobile);
	}

	@When("^Input to Email textbox$")
	public void inputToEmailTextbox() {
		customerPage.inputEmailTextbox(dataTest.getEmailAddress());

	}

	@When("^Input Password textbox with \"([^\"]*)\"$")
	public void inputPasswordTextboxWith(String Password) {
		customerPage.inputPasswordTextbox(Password);
	}

	@When("^Click Submit button to create new Customer$")
	public void clickSubmitButtonToCreateNewCustomer() {
		customerPage.clickOnSubmitButton();

	}

	@Then("^Verify showing sucessfull message$")
	public void verifyShowingSucessfullMessage() {
		Assert.assertTrue(customerPage.isMessageDiplayed());

	}

	@When("^Get CustomerID$")
	public void getCustomerID() {
		customerID = customerPage.getCustomerID();
	}

	@When("^Click on New Account link$")
	public void clickOnNewAccountLink() {
		customerPage.clickOnNewAccountLink();
	}

	@When("^Input CustomerID$")
	public void inputCustomerID() {
		accountPage.inputCustomerID(customerID);
	}

	@When("^Input Initial deposit$")
	public void inputInitialDeposit() {
		accountPage.inputInitialDeposit("100000");
	}

	@When("^Click Submit to create New accout$")
	public void clickSubmitToCreateNewAccout() {
		accountPage.clickSubmitToCreateNewAccount();
	}

	@Then("^Verify create account successfull$")
	public void verifyCreateAccountSuccessfull() {
		Assert.assertTrue(accountPage.isMessageAccDisplayed());

	}

	@When("^Open Deposit Page$")
	public void openDepositPage() {
		accountPage.clickDepositLink();
	}

	@When("^Input Account No text box$")
	public void inputAccountNoTextBox() {
		depositPage.inputAccountNoTextBox("1212");
	}

	@When("^Input Amount textbox$")
	public void inputAmountTextbox() {
		depositPage.inputAmountTextbox("760000");
	}

	@When("^Input Description textbox$")
	public void inputDescriptionTextbox() {
		depositPage.inputDescriptionTextbox("testing");
	}

	@When("^Click on Submit button to deposit$")
	public void clickOnSubmitButtonToDeposit() {
		depositPage.clickOnSubmitButtonToDeposit();
	}

	@Then("^Verify depoist successfully$")
	public void verifyDepoistSuccessfully() {

	}

	@When("^Close page$")
	public void closePage() {
		driver.quit();
	}

	public void sleepInSecond(long timeoutInSecond) {
		try {
			Thread.sleep(timeoutInSecond * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
