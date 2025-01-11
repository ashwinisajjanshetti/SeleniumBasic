package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath ="//span[text()='My Account']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement lnkRegister;
	
	public void ClickMyAccount() {
		lnkMyAccount.click();
	}
	public void ClickRegister() {
		lnkRegister.click();
		
	}
}
