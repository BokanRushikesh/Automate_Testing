package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A1 {

	
	@FindBy(xpath = "//input[@id='email']")private WebElement name;
	
	@FindBy(xpath = "//input[@id='pass']")private WebElement pass;
	
	@FindBy(xpath = "//button[@type='submit']")private WebElement btn;
	
	
	
		A1(WebDriver driver ){
			
			PageFactory.initElements(driver, this);
		}
	
		
	public void Firstname(String Q) {
		
		name.sendKeys(Q);
		
	}
	
	public void Lastname(String W) {
		
		pass.sendKeys(W);
	}
	
	public void button() {
		
		btn.click();
	}
	
	
	
}
//""