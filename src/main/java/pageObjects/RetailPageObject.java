package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {//in pageObject class we don't want access class directlly instead we store them in Private
	//then we can get access through public class.
	
	public RetailPageObject() { 
		PageFactory.initElements(driver, this );// Page factory is a class in selenium if we need the elements it will call them for us.
	}// First we store UI elements Second we write action method.
	@FindBy(xpath = "//a[text()='Retail Website']")
	private WebElement  retailWebsiteText; // 
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;
	@FindBy(xpath = "//li//li//a[text()='Login']")
	private WebElement loginLink;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailAddressField;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordField;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountPage;
	@FindBy(xpath ="//a[text()='Register for an affiliate account']")
	private WebElement myAffillateAccount;
	@FindBy (xpath = "//input[@name='company']")
	private WebElement companyField;
	@FindBy(xpath ="//input[@name='website']")
	private WebElement webSiteField;
	@FindBy(xpath ="//input[@name='tax']")
	private WebElement taxIDField;
	@FindBy(xpath ="//input[@value='cheque']")
	private WebElement paymentMethodField;
	@FindBy(xpath = "//input[@name='cheque']")
	private WebElement chequePayField;
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement agreeButtonLink;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateInfo;
	@FindBy(xpath ="//input[@value='bank']")
	private WebElement bankTransfer;
	@FindBy(xpath = "//input[@name='bank_name']")
	private WebElement bankNameField;
	@FindBy(xpath = "//input[@name='bank_branch_number']")
	private WebElement bankBranchNumberField;
	@FindBy(xpath = "//input[@name='bank_swift_code']")
	private WebElement swiftCode;
	@FindBy(xpath ="//input[@name='bank_account_name']" )
	private WebElement accountName;
	@FindBy(xpath= "//input[@name='bank_account_number']")
	private WebElement accountNumber;
	@FindBy(xpath= "//input[@value='Continue']")
	private WebElement continueBttn;
	@FindBy(xpath="//a[text()='Edit your account information']")
	private WebElement editInfo;
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameField;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameField;
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailAddress;
	@FindBy(xpath="//input[@name='telephone']")
	private WebElement telephoneField;
	@FindBy(xpath= "//input[@value='Continue']")
	private WebElement continueClickButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
// Below are called action methods:
   public String getTextretailWebsiteText() {
	   String textFromUI = retailWebsiteText.getText();	
	   return textFromUI;
   }
   public void clickOnMyAccountButton() {
	   myAccountButton.click();
   }
   public void clickOnLoginLink() {
	   loginLink.click();   
   }
   public void enterEmail(String userName) {
	   emailAddressField.sendKeys(userName);
   }
   public void enterPassword(String password) {
	   passwordField.sendKeys(password);
   }
   public void clickOnLoginButton() {
	   loginButton.click();
   }
   public String getTextAfterLogin() {
	   String myAccountText= myAccountPage.getText();
	   return myAccountText;
   }
   public void clickOnRegisterForAnAffiliateAcc() {
	   myAffillateAccount.click();
   }
   public void enterCompanyName(String companyName) {
	   companyField.sendKeys("TekSchool");
   }
   public void enterWebSite(String websiteName ) {
	   webSiteField.sendKeys("www.tekschool.com");
   }
   public void enterTaxID(String taxID) {
       taxIDField.sendKeys("123456");
   }
   public void clickOnPaymentMethod(String string) {
	   paymentMethodField.click();
   }
   public void enterChequePay(String ChequeName) {
	   chequePayField.sendKeys("Hjahesh");
   }
   public void checkAgreeButton() {
	   agreeButtonLink.click();
   }
   public void clickOnContinueButton() {
	   continueButton.click();
   }
   public void clickOnEditAffiliateInfo() {
	   editAffiliateInfo.click();
   }
   public void clickOnBankTrasfer() {
	   bankTransfer.click();
   }
   public void enterBankName(String bankName) {
	   bankNameField.sendKeys("US Bank");
   }
   public void enterBranchNumber(String branchNumber) {
       bankBranchNumberField.sendKeys("Riverdale");
   }
   public void enterSwiftCode(String swift) {
	   swiftCode.sendKeys("0707");
   }
   public void enterAccountName(String account) {
	   accountName.clear();
	   accountName.sendKeys("Hjahesh");
   }
   public void enterAccountNumber(String accNumber) {
	   accountNumber.clear();
        accountNumber.sendKeys("786786");
   }
   public void clickOnContinueBttn() {
	   continueBttn.click();  
   }
   public void clickOnEditInfomation() {
	   editInfo.click();
   }
   public void firstName(String firstName) {
	   firstNameField.clear();
	   firstNameField.sendKeys("Jahesh");
   }
   public void lastName(String lastName) {
	   lastNameField.clear();
	   lastNameField.sendKeys("Shoaib");
   }
   public void emailAddress(String emailAdd) {
	   emailAddress.clear();
	   emailAddress.sendKeys("shoaibjahesh111@gmail.com");
   }
   public void telephoneField(String phoneNumber) {
	   telephoneField.clear();
	   telephoneField.sendKeys("123123");
   }
   public void continueClickButton() {
	   continueClickButton.click();
   }
   public String getsuccessMessage() {
       String successMessageInfo = successMessage.getText();
       return successMessageInfo;
   }

}