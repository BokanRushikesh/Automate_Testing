package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test1 {

	@FindBy(xpath = "//input[@name='firstname']") private WebElement name ; 
	
	@FindBy(xpath = "//input[@name='lastname']") private WebElement lname ; 
	
	@FindBy(xpath = "//input[@name='reg_email__']") private WebElement email ;
	
	@FindBy(xpath = "//input[@name='reg_passwd__']") private WebElement pass ;
	
	@FindBy(xpath = "//select[@name='birthday_day']") private WebElement Day ;
	
	@FindBy(xpath = "//select[@name='birthday_month']") private WebElement Month ;
	
	@FindBy(xpath = "//select[@name='birthday_year']") private WebElement year ;
	
	
	
	
	Test1(WebDriver driver ){
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void Firstname (String S ) {
		
		name.sendKeys(S);
		
	}
	
	public void Lastname(String S1)
	{
		
		lname.sendKeys(S1);
	}
	
	public void Email(String S2) {
		
		email.sendKeys(S2);
		
	}
	
   public void Password(String S3) {
		
		pass.sendKeys(S3);
		
	}

     public void BDay(String S4) {
	
	Day.sendKeys(S4);
	
}

     public void BMonth(String S5) {
	
	Month.sendKeys(S5);
	
}
     public void BYear(String S6) {
    		
    		year.sendKeys(S6);
    		
    	}
	
}
//""