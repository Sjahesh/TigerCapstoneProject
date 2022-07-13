package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopPageObject;
import utilities.Utils;


public class DesktopStepDefinition extends Base{
	DesktopPageObject desktopPage = new DesktopPageObject();
	// syntax @Tag("exact words of step from scenario")
	// public void nameOfTheMethod(){}
	
	@When("User click on Desktops tab")
	public void User_click_on_Desktops_tab() {	
		desktopPage.moveOnDesktopsTab();
		logger.info("User clicked on desktops tab");
		Utils.hardWait(2000);
	}
	@And("User click on Show all desktops")
	public void UserClickOnShowAllDesktops() {
		desktopPage.clickOnShowAllDesktops();
		logger.info("User clicked on Show all Desktops");
		
	}
    @Then("User should see all items are present in Desktop page")
    public void user_should_see_all_items_are_present_in_desktop_page() {
    	List<WebElement> desktopsElement = desktopPage.desktopsItems();
    	for(WebElement element:desktopsElement) {
    	Assert.assertTrue(element.isDisplayed());
    	logger.info(element.getAttribute("title")+ "is present ");
    	Utils.hardWait(2000);
    	}
    	
    }
    @And("User click  ADD TO CART option on HP LP3065item")
    public void User_click_ADD_TO_CART_option_on_HP_LP3065item() {
    	desktopPage.clickOnHPLP3065Item();
    	logger.info("User clicked Add to cart option");
    	
    }
	@When("User select quantity {string}")
	public void user_select_quantity(String quantityValue) throws InterruptedException {
		desktopPage.selectQuantity(quantityValue);
		logger.info("user enter quantity " + quantityValue);
		Thread.sleep(2000);
	}
    @And("User click add to Cart button")
    public void User_click_add_to_Cart_button() {
    	desktopPage.clickOnAddToCartButton();
    	logger.info("User clicked on add to cart button");
    	
    }

    @When("User click  ADD TO CART option on Canon EOS 5Ditem")
    public void user_click_add_to_cart_option_on_canon_eos_5ditem() {  
    	desktopPage.clickOnCanonAddToCard();
   
    }
    @When("User select color from dropdown Red")
    public void user_select_color_from_dropdown_red() {
    	desktopPage.selectColor();
		logger.info("User select color from dropdown Red");
    }
	@Then("User should see a message1 {string}")
	public void user_should_see_a_message1(String expectedmessageValue) throws InterruptedException {

		Assert.assertTrue(desktopPage.successMessage());
		Thread.sleep(2000);

	}

    @When("User click on Canon EOS 5D item")
    public void user_click_on_canon_eos_5d_item() throws InterruptedException {
    	desktopPage.clickOnCanonAddToCard();
    	logger.info(" User clicked on canon item");
    	Thread.sleep(2000);
    }
    @When("User click on write a review link")
    public void user_click_on_write_a_review_link() throws InterruptedException {
    	desktopPage.clickOnRiteReview();
    	logger.info(" User clicked on write review link");
    	Thread.sleep(2000);

    }
    @When("user fill the review information with below information")
    public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
    	List<Map<String, String>> infoList = dataTable.asMaps(String.class, String.class);
		desktopPage.fullNameField(infoList.get(0).get("youname"));
		desktopPage.reviewField(infoList.get(0).get("reviewtext"));
		desktopPage.selectRatingRadioButton();
		Thread.sleep(2000);
    

    }
    @When("User click on Continue {string}")
    public void user_click_on_continue(String string) throws InterruptedException {
    	desktopPage.clickOnRviewContinueButton();
    	logger.info(" User clicked on continue button");
    	Thread.sleep(2000);

      
    }
    @Then("User should see a message with {string}")
    public void user_should_see_a_message(String expectedmessageValue) throws InterruptedException {
    	logger.info("User Saw success message");
		desktopPage.reviewmessage();
		Thread.sleep(2000);
        
    }


//    @Then("User should see a message {String}")
//    public void User_should_see_a_message() throws InterruptedException{
//    	desktopPage.reviewmessage();
//    	logger.info("user can see review message");
//    	Thread.sleep(2000);
//    	
//    	
 //   }

}
