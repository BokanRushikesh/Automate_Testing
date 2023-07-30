package Testing1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBlogin {

	@FindBy(xpath = "//input[@id='email']")private WebElement user;
	
	@FindBy(xpath = "//input[@id='pass']")private WebElement pass;
	
	@FindBy(xpath = "//button[@name='login']")private WebElement btn;
	
	
	
	FBlogin(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public void Username(String S1) {
		
		user.sendKeys(S1);
		
	}
	
    public void Password(String S2) {
		
		pass.sendKeys(S2);
		
	}

    public void Button() {
	
	btn.click();
	
}
	
	
}
//""