package step.definition;
 
import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base{
	HomePageObject homepageobject = new HomePageObject();
	

     @When("User click on Currency")
    public void user_click_on_currency() {
    	 homepageobject.clickOnCurrencyLink();
    	 logger.config(" User clicked on currency");
    	 Utils.hardWait(2000);
    	 
     }
     @When("User Chose Euro from dropdown")
    public void user_chose_euro_from_dropdown() {
    	 homepageobject.selectEuro();
    	 logger.info("User chosed Euro");
    	 Utils.hardWait(2000);

    }
    @Then("currency value should change to Euro")
   public void currency_value_should_change_to_euro() {
    	homepageobject.euroCurrencyChanged();
    	logger.info(" Currency value changed ");
    	 Utils.hardWait(2000);
    	 
    }
    @When("User click on shopping cart")
    public void user_click_on_shopping_cart() {
    	homepageobject.clickOnShoppingCartLink();
    	logger.info(" User clicked on shopping Cart");
    	 Utils.hardWait(2000);
    
    }
    @Then("message should display {string}")
    public void message_should_display(String string) {
    	homepageobject.shoppingCartMessage();
    	logger.info(" User saw success message");
    	 Utils.hardWait(2000);
    }

}
