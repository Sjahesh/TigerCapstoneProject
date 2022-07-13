package step.definition;


import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*; // star means import all initission from that package
import pageObjects.RetailPageObject;
import utilities.Utils;

public class RetailStepDefinition extends Base {
	
	RetailPageObject retailstepdefinition = new  RetailPageObject();
	
	@Given("User is on Retail website")
	public void User_is_on_Retail_website() {
	
	}
	@And("User click  on MyAccount")
	public void User_click_on_MyAccount() {
		retailstepdefinition.clickOnMyAccountButton();
		logger.info("My Account button was clicked successfully");
	}
	
	@When("User click on Login")
	public void user_click_on_login() {
		retailstepdefinition.clickOnLoginLink();
		logger.info("Login button was clicked successfully");
	}
	@And("User enter username 'userName' and password 'password'")
	public void User_enter_username_userName_and_password_password() {
		retailstepdefinition.enterEmail("shoaibjahesh111@gmail.com");
		retailstepdefinition.enterPassword("123123");
		logger.info("Email and Password were entered successfully");
	}
	@And ("User click on Login button")
	public void User_click_on_Login_button() throws InterruptedException {
		retailstepdefinition.clickOnLoginButton();
		logger.info("Login button was clicked successfully");
		Thread.sleep(2000);
	}
	@Then("User should be logged in to MyAccount dashboard")
	public void User_should_be_logged_in_to_MyAccount_dashboard() throws InterruptedException {
		String expectedText = "My Account";
		String actualText = retailstepdefinition.getTextAfterLogin();
		Assert.assertEquals(expectedText,actualText );
		logger.info(" My Account text was verified successfully ");
		Thread.sleep(2000);
	}
	@When("User click on 'Register for an Affiliate Account'link")
	public void user_click_on_register_for_an_affiliate_account_link() throws InterruptedException {
		retailstepdefinition.clickOnRegisterForAnAffiliateAcc();
		logger.info("'Register for an Affiliate Account'link was clicked successfully");
		Thread.sleep(2000);
	}

	@And("User fill affiliate form with below information")
	public void User_fill_affiliate_form_with_below_information(DataTable dataTable) throws InterruptedException {
	List<Map<String, String>> affiliate = dataTable.asMaps(String.class, String.class);
	retailstepdefinition.enterCompanyName(affiliate.get(0).get("company"));
	retailstepdefinition.enterWebSite(affiliate.get(0).get("website"));
	retailstepdefinition.enterTaxID(affiliate.get(0).get("taxID"));
    retailstepdefinition.clickOnPaymentMethod(affiliate.get(0).get("paymentMethod"));
    retailstepdefinition.enterChequePay(affiliate.get(0).get("cheque payee name"));
    logger.info("Company name was entered successfully");
    Thread.sleep(2000);
	
	}
	@And("User check on About us check box")
	public void User_check_on_About_us_check_box () {
		retailstepdefinition.checkAgreeButton();
		logger.info(" Agree button was checked successfully");
	}
	@And("User click on Continue button")
	public void User_click_on_Continue_button() {
		retailstepdefinition.clickOnContinueButton();
		logger.info(" Continue button was clicked successfully");
	}
	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		
	}
	@When("User click on 'Edit your affiliate information'link")
	public void User_click_on_Edit_your_affiliate_information_link() {
		retailstepdefinition.clickOnEditAffiliateInfo();
		logger.info(" Edit your affiliate information link was clicked successfully");
	}
	@And("user click on Bank Transfer radio button")
	public void user_click_on_Bank_Transfer_radio_button() {
		retailstepdefinition.clickOnBankTrasfer();
		logger.info(" Bank transfer radio button was clicked successfully");
	}
	@And("User fill Bank information with below information")
	public void User_fill_Bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> editAffiliate = dataTable.asMaps(String.class, String.class);
		retailstepdefinition.enterBankName(editAffiliate.get(0).get("bankName"));
		retailstepdefinition.enterBranchNumber(editAffiliate.get(0).get("abaNumber"));
		retailstepdefinition.enterSwiftCode(editAffiliate.get(0).get("swiftCode"));
		retailstepdefinition.enterAccountName(editAffiliate.get(0).get("accountName"));
		retailstepdefinition.enterAccountNumber(editAffiliate.get(0).get("accountNumber"));
		logger.info("Bank information was enterd successfully");
	}
	@When("User click on 'Edit your account information' link")
	public void User_click_on_Edit_your_account_information_link() throws InterruptedException {
		retailstepdefinition.clickOnEditInfomation();
		logger.info("user clicked on edit account info" );
		Thread.sleep(2000);
	}
	@And("User modify below information")
	public void User_modify_below_information(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> editInfomation = dataTable.asMaps(String.class, String.class);
		retailstepdefinition.firstName(editInfomation.get(0).get("firstname"));
		retailstepdefinition.lastName(editInfomation.get(0).get("lastName"));
		retailstepdefinition.emailAddress(editInfomation.get(0).get("email"));
		retailstepdefinition.telephoneField(editInfomation.get(0).get("telephone"));
		logger.info("Success: Your account has been successfully updated.");
		Thread.sleep(2000);
	}
	@And("User click on continue button")
	public void User_click_on_continue_button() throws InterruptedException {
		retailstepdefinition.continueClickButton();
		logger.info("User click on continue button was clicked successfully");
		Thread.sleep(2000);
	}
//	@Then("User should see a message {string}")
//    public void user_should_see_a_message(String string) {
//        String expectedMessage = "Success: Your account has been successfully updated.";
//        String actualMessage = retailstepdefinition.getsuccessMessage();
//        Assert.assertEquals(expectedMessage, actualMessage);
//        logger.info("User see a message: Success: Your account has been successfully updated.");
//        Utils.takeScreenshotForStep();
//    }
//	
}
