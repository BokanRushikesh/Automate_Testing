package Testing1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {

    @FindBy(xpath = "//input[@name='firstname']") private WebElement fname ;
	
	@FindBy(xpath = "//input[@name='lastname']") private WebElement lname ;
	
	@FindBy(xpath = "//input[@name='reg_email__']") private WebElement mob ;
	
	@FindBy(xpath = "//input[@name='reg_passwd__']") private WebElement pass ;
	
	

        Pom1(WebDriver driver){
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void firstname(String S1) {
		
		fname.sendKeys(S1);
	}
	
     public void Lastname(String S2) {
		
		lname.sendKeys(S2);
	}

      public void Mobile(String S3) {
	
	   mob.sendKeys(S3);
}

      public void Password(String S4) {
	
	    pass.sendKeys(S4);
}
	
	
	
	
	
	
	
	
}
