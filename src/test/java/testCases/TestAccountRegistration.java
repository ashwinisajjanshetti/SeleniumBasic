package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TestAccountRegistration {
	
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	void tearDown() {
		driver.close();
		//new line added just to check
	}
	
	@Test
	void testRegistration() {
		HomePage homepage=new HomePage(driver);
		homepage.ClickMyAccount();
		homepage.ClickRegister();
		
		AccountRegistrationPage account=new AccountRegistrationPage(driver);
		account.Firstname();
		account.LastName();
		account.Email();
		account.Mobile();
		account.Password();
		account.ConfirmPass();
		account.Policy();
		account.Continue();
	}

}
