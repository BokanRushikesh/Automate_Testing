package TestNgSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPOM {

	// Declaration
		@FindBy(xpath="//input[@name='firstname']") private WebElement firstname;
		
		@FindBy(xpath="//input[@name='lastname']") private WebElement lastname;

		@FindBy(xpath="//input[@name='reg_email__']") private WebElement mobNo;

		@FindBy(xpath="//input[@name='reg_passwd__']") private WebElement newPass;

		
		// Initialization
		SignUpPOM(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		// usage
		public void enterFirstName(String name) 
		{
			firstname.sendKeys(name);
		}
		
		public void enterLastName(String lName) 
		{
			lastname.sendKeys(lName);
		}
		
		public void enterMobNum(String mob) {
			mobNo.sendKeys(mob);
		}
		
		public void enterPassword(String pass) {
			newPass.sendKeys(pass);
		}
		

}
