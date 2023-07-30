package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Face_Login {

	
	@FindBy(xpath = "//input[@name='email']")private WebElement login;
	
	@FindBy(xpath = "//input[@name='pass']")private WebElement pass;
	
	@FindBy(xpath = "//button[@name='login']")private WebElement btn;
	
	
	
	Face_Login(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void m1(String fname) {
		
		login.sendKeys(fname);
		
	}
	
	public void m2(String lname) {
		
		pass.sendKeys(lname);
	}
	
	public void m3() {
		
		btn.click();
	}
	
	
	
	
}
//""