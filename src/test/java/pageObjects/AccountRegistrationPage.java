package pageObjects;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 @FindBy(xpath="//input[@id='input-firstname']")
	 WebElement txtFname;
	 
	 @FindBy (xpath="//input[@id='input-lastname']")
	 WebElement txtLname;
	 @FindBy(xpath="//input[@id='input-email']")
	 WebElement txtEmail;
	 
	 @FindBy(xpath="//input[@id='input-telephone']")
	 WebElement txtMpbile;
	 
	 @FindBy(xpath="//input[@id='input-password']")
	 WebElement txtPassword ;
	 
	 @FindBy(xpath="//input[@id='input-confirm']")
	 WebElement txtConfirmPassword ;
	 
	 @FindBy(xpath = "//input[@name='agree']")
	 WebElement buttonpolicy;
	
	 @FindBy(xpath = "//input[@value='Continue']")
	 WebElement textContinue;
	 
	 @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	 WebElement confirmess;
	 
	 public void Firstname() {
		 txtFname.sendKeys("Ashwini");
		
	}
	 public void LastName()
	 {
		 txtLname.sendKeys("Sajjanshetty");
	 }
	 public void Email()
	 {
		 txtEmail.sendKeys("ashwinisajjanshetty@gmail.com");
	 }
	 public void Mobile()
	 {
		 txtMpbile.sendKeys("7715932137");
	 }
	 public void Password() {
		 txtPassword.sendKeys("Ashwini@123");
		
	}
	public void ConfirmPass() {
		txtConfirmPassword.sendKeys("Ashwini@123");
		
	}
	public void Policy() {
		buttonpolicy.click();
	}
	public void Continue()
	{
		textContinue.click();
	}

	public String getconfirmationm() {
		return confirmess.getText();
		
	}
}
