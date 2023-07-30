package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp1 {

	@FindBy(xpath = "//input[@name='firstname']")private WebElement name;
	
	@FindBy(xpath = "//input[@name = 'lastname']")private WebElement lname;
	
	@FindBy(xpath = "//input[@name = 'reg_email__']")private WebElement email;
	
	@FindBy(xpath = "//input[@name = 'reg_passwd__']")private WebElement pass;
	
	
	SignUp1(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public void Firstname(String a) {
		
		name.sendKeys(a);
	}
	
	public void Lastname(String B) {
		
		lname.sendKeys(B);
	}
	
	public void Email(String C) {
		
		email.sendKeys(C);
	}
	
	public void Password(String D) {
		
		pass.sendKeys(D);
	}
}
//""