package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Public1 {

	@FindBy(xpath = "//input[@name='email']")private WebElement name;
	
	@FindBy(xpath = "//input[@name='pass']") private WebElement pass;
	
	@FindBy(xpath = "//button[@name='login']")private WebElement btn;
	
	
	
	Public1(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void Firstname(String A) {
		
		name.sendKeys(A);
	}
	
	public void Lastname(String B) {
		
		pass.sendKeys(B);
	}
	
	public void Button() {
		
		btn.click();
	}
	
	
}
//""