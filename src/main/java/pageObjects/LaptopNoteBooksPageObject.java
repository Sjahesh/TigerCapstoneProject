package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class LaptopNoteBooksPageObject extends Base {
	public LaptopNoteBooksPageObject(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement clickOnlaptopNotebooksTab;
	public void clickOnlaptopNotebooksTab() {
		clickOnlaptopNotebooksTab.click();
	}

	@FindBy(xpath = "//a[normalize-space()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;
	public void clickOnshowAllLaptopsNoteBooks() {
		showAllLaptopsAndNotebooks.click();

	}
// Scenario 1
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement clickeOnMacBookitem;
	public void clickeOnMacBookitem() {
		clickeOnMacBookitem.click();
	}

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement clickToAddToCart;
	public void clickToAddToCart() {
		clickToAddToCart.click();

	}
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement lapTopsuccessmessage;
	public boolean laptopsuccesMessage() {
		if (lapTopsuccessmessage.isDisplayed())
			return true;
		else
			return false;
	}
	@FindBy(xpath = "//*[text()=' 1 item(s) - $602.00']")
	private WebElement SeeOneItemInItemsOption;
	public void SeeOneItemInItemsOption() {
		SeeOneItemInItemsOption.isDisplayed();
	}

	@FindBy(xpath = "//span[text()=' 1 item(s) - $602.00']")
	private WebElement ClickOnCartOption;
	public void ClickOnCartOption() {
		ClickOnCartOption.click();
	}

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement clickOnRemovetheitems;
	public void clickOnRemovetheitems() {
		clickOnRemovetheitems.click();
	}
	@FindBy(xpath = "//span[text()=' 0 item(s) - $0.00']")
	private WebElement noItemsAddtothecart;
	public void noItemsAddtothecart() {
		noItemsAddtothecart.isDisplayed();
	}
	@FindBy(xpath="(//i[@class='fa fa-exchange'])[2]")
	private WebElement compareMac;
	public void clickOnCompareMac() {
		compareMac.click();
	}
    @FindBy(xpath="(//i[@class='fa fa-exchange'])[3]")
	private WebElement compareMacAir;
	public void clickOnMacAir() {
		compareMacAir.click();
		}
	@FindBy(xpath="//a[text()='product comparison']")
	private WebElement comparisonLink;
	public void clickOnComparisonLink() {
		comparisonLink.click();
	}
	@FindBy(xpath="//table[@class='table table-bordered']")
	private WebElement comprisonChart;
	public boolean doesUserSeeProductCopmrisonChart() {
		Utils.highlightelementBackground(comprisonChart);
		if(comprisonChart.isDisplayed()) {
			return true;
		}else 
			return false;
	}
	@FindBy(xpath="(//i[@class='fa fa-heart'])[6]")
	private WebElement heartIconOnSonyVaio;
	public void clickOnHeartIconOnSony() {
		heartIconOnSonyVaio.click();
	}
	@FindBy(xpath="(//div[@class='alert alert-success alert-dismissible'])/text[1]")
	private WebElement youMust;
	@FindBy(xpath="//a[text()='login']")
	private WebElement loginInTheMessage;
	@FindBy(xpath="(//div[@class='alert alert-success alert-dismissible'])text[2]")
	private WebElement or;
	@FindBy(xpath="//a[text()='create an account']")
	private WebElement createAnAccountInTheMessage;
	@FindBy(xpath="(//div[@class='alert alert-success alert-dismissible'])/text()[3]")
	private WebElement toSave;
	@FindBy(xpath="//a[text()='Sony VAIO']")
	private WebElement sonyVaioInTheMessage;
	@FindBy(xpath="(//div[@class='alert alert-success alert-dismissible'])/text()[4]")
	private WebElement toYour;
	@FindBy(xpath="//a[text()='wish list']")
	private WebElement toWishListInTheMessage;
	@FindBy(xpath="(//div[@class='alert alert-success alert-dismissible'])/text()[5]")
	private WebElement exclamationMark;
	public String getLoginOrCreateAccountMessage() {
		String actualResult= "You Must" +loginInTheMessage.getText()+"or"+createAnAccountInTheMessage.getText()+"to save"+sonyVaioInTheMessage.getText()+"to your"+toWishListInTheMessage.getText()+"!";
		return actualResult;
	}

	@FindBy(xpath="//h4//a[text()='MacBook Pro']")
	private WebElement MacBookPro;
	public void clickOnMacBookPro() {
		MacBookPro.click();
	}
	@FindBy(xpath="//h2[text()='$2,000.00']")
	private WebElement priceTag;
	public String getPriceTag() {
		String actualPrice= priceTag.getText();
		return actualPrice;
		
	}
	
}	