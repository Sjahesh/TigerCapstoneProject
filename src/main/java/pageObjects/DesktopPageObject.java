package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class DesktopPageObject extends Base{
// syntax for storing UI Element in POM class using PageFactory implementation @FindBy("")
	public DesktopPageObject() { // contstructor is special method to initilizing the object.
		PageFactory.initElements(driver, this); // dirver is responsible to locate our WebElements and excute it.
	}
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(tagName= "img")
	private List<WebElement>items; //sence they are 14 we should store them in List<>. driver.findElements
	
	@FindBy(xpath= "//button[contains(@onclick, \"cart.add('47', '1');\")]")
	private WebElement hpLP3065;
	
	@FindBy(xpath ="//input[@id='input-quantity']")
	private WebElement quantityInput;
	
	@FindBy(id="button-cart")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement HPLPsuccessmessage;
	
	@FindBy(xpath ="//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[1]//span[1]")
	private WebElement addCanonToCart;
	
	@FindBy(xpath = "//select[@id='input-option226']//child::option[@value='15']")
	private WebElement dropdownRed;
	
	@FindBy(xpath= "//input[@id='input-quantity']")
	private WebElement canonQuantity;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement addCanonCart;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	@FindBy(xpath="//a[text()='Write a review']")
	private WebElement writeReviews;
	
	@FindBy(xpath="//input[@id='input-name']")
	private WebElement yourNameField;
	
	@FindBy(xpath="//textarea[@id='input-review']")
	private WebElement yourReviewsField;
	
	@FindBy(xpath = "//input[@name='rating' and @value='5']")
	private WebElement ratingRadionButton;
	
	@FindBy(xpath="//button[@id='button-review']")
	private WebElement reviewContinueBttn;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement reviewmessage;
	
	public void moveOnDesktopsTab() {
		Utils.moveMouseOverElement(desktops);
	}
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	public List<WebElement>desktopsItems(){
		List<WebElement>itemsDesk = items;
		return itemsDesk;
	}
	public void clickOnHPLP3065Item() {
		hpLP3065.click();
		
	}
		public void selectColor() {
			dropdownRed.click();
	}

	public void selectQuantity(String input) {
		canonQuantity.clear();
		canonQuantity.sendKeys(input);
	}
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
	public boolean successMessage() {
		if (HPLPsuccessmessage.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnCanonAddToCard() {
		addCanonToCart.click();
	}
	public void clickOnRiteReview() {
		writeReviews.click();
	}
	public void fullNameField(String string) {
		yourNameField.clear();
		yourNameField.sendKeys("Jahesh Shoaib");
	}
	public void reviewField(String string) {
		yourReviewsField.sendKeys("i really like it recommended");
	}
	public void selectRatingRadioButton() {
		ratingRadionButton.click();
	}
	public void clickOnRviewContinueButton() {
		reviewContinueBttn.click();
	}
	public boolean canonSuccessMessage() {
		if (successMessage.isDisplayed())
			return true;
		else
			return false;

	
//	public String successMessage() {
//		String actualResult="Success: You have added HPLPsuccessmessage to your shopping cart!";
//		return actualResult;
//	}
	}
		public void reviewmessage() {
			reviewmessage.isDisplayed();
		}
	}

