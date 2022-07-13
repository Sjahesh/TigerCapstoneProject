package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	public HomePageObject() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[text()='Currency']")
	private WebElement currencyLink;
	public void clickOnCurrencyLink() {
		currencyLink.click();
	}
	
	@FindBy(xpath="//button[@name='EUR']")
	private WebElement euroCurrency;
	public void selectEuro() {
		euroCurrency.click();
	}
	@FindBy(xpath="//button[@class='btn btn-link dropdown-toggle']")
	private WebElement euroCurrencyChanged;
	public void euroCurrencyChanged() {
		euroCurrencyChanged.isDisplayed();
	}
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	private WebElement shoppingCart;
	public void clickOnShoppingCartLink() {
		shoppingCart.click();
	}
	
	@FindBy(xpath="//li//p[text()='Your shopping cart is empty!']")
	private WebElement shoppingCartMessage;
	public void shoppingCartMessage() {
		shoppingCartMessage.isDisplayed();
	}

}
