package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_1 {

	
	@FindBy(xpath = "//input[@name='firstname']") private WebElement fname;
	
	@FindBy(xpath = "//input[@name='lastname']")private WebElement lname;
	
	@FindBy(xpath = "//input[@name='reg_email__']")private WebElement email;
	
	@FindBy(xpath = "//input[@name='reg_passwd__']")private WebElement pass;
	
	
	Facebook_1(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void Firstname(String Q) {
		
		fname.sendKeys(Q);
		
	}
	
	public void Lastname(String W) {
		
		lname.sendKeys(W);
	}
	
	public void Email(String E) {
		
		email.sendKeys(E);
	}
	
	public void Pass(String R) {
		
		pass.sendKeys(R);
	}
}
//""