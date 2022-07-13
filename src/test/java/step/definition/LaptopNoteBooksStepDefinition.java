package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopNoteBooksPageObject;

public class LaptopNoteBooksStepDefinition extends Base {
	LaptopNoteBooksPageObject laptopandnoetbook = new LaptopNoteBooksPageObject();
//	Backround

	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() throws InterruptedException {
		laptopandnoetbook.clickOnlaptopNotebooksTab();
		Thread.sleep(2000);
	}

	@When("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() throws InterruptedException {
		laptopandnoetbook.clickOnshowAllLaptopsNoteBooks();
		Thread.sleep(2000);

	}
// Scenario: Add and Remove a Mac book from Cart

	@And("User click on MacBook  item")
	public void user_click_on_mac_book_item() throws InterruptedException {
		laptopandnoetbook.clickeOnMacBookitem();
		Thread.sleep(2000);
	}

	@And("User click add to Cart button for Mac Book")
	public void user_click_add_to_cart_button_for_mac_book() throws InterruptedException {
		laptopandnoetbook.clickToAddToCart();
		Thread.sleep(2000);
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) throws InterruptedException {
		Assert.assertTrue(laptopandnoetbook.laptopsuccesMessage());
		Thread.sleep(2000);

	}

	@And("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) throws InterruptedException {
		laptopandnoetbook.SeeOneItemInItemsOption();
		Thread.sleep(2000);
	}

	@And("User click on cart option")
	public void user_click_on_cart_option() throws InterruptedException {
		laptopandnoetbook.ClickOnCartOption();
		Thread.sleep(2000);
	}

	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() throws InterruptedException {
		laptopandnoetbook.clickOnRemovetheitems();
		Thread.sleep(2000);
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) throws InterruptedException {
		laptopandnoetbook.noItemsAddtothecart();
		Thread.sleep(4000);
	}

// Scenario: Product Comparison
	@And("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String string) throws InterruptedException {
		laptopandnoetbook.clickOnCompareMac();
		Thread.sleep(2000);

	}

	@And("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_MacBook_Air() throws InterruptedException {
		laptopandnoetbook.clickOnMacAir();
		Thread.sleep(2000);

	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws InterruptedException {
		laptopandnoetbook.clickOnComparisonLink();
		Thread.sleep(2000);

	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws InterruptedException {
		laptopandnoetbook.doesUserSeeProductCopmrisonChart();
		Thread.sleep(2000);
	}

	@When("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) throws InterruptedException {
		laptopandnoetbook.clickOnHeartIconOnSony();
		Thread.sleep(2000);
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) throws InterruptedException {
		laptopandnoetbook.getLoginOrCreateAccountMessage();
		Thread.sleep(2000);
	}

	@When("User click on {string} item")
	public void user_click_on_item(String string) throws InterruptedException {
		laptopandnoetbook.clickOnMacBookPro();
		Thread.sleep(2000);
	}

	@Then("User should see  {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) throws InterruptedException {
		laptopandnoetbook.getPriceTag();
		Thread.sleep(2000);
		
	}

}
