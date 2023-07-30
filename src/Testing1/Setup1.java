package Testing1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Setup1 {

	@FindBy(xpath = "//input[@name='firstname']") private WebElement fname ;
	
	@FindBy(xpath = "//input[@name='lastname']") private WebElement lname ;
	
	@FindBy(xpath = "//input[@name='reg_email__']") private WebElement mob ;
	
	@FindBy(xpath = "//input[@name='reg_passwd__']") private WebElement pass ;
	
	@FindBy(xpath = "//select[@name='birthday_day']") private WebElement day;
	
	@FindBy(xpath = "//select[@name='birthday_month']") private WebElement month ;
	
	@FindBy(xpath = "//select[@name='birthday_year']") private WebElement year ;
	
	@FindBy(xpath = "(//input[@type='radio'])[2]") private WebElement mbtn ;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]") private WebElement submit ;
	
	
	Setup1(WebDriver driver){
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void firstname(String S1) {
		
		fname.sendKeys(S1);
		
	}
	
	public void lastname(String S2) {
		
		lname.sendKeys(S2);
		
	}
	
    public void mob(String S3) {
		
		mob.sendKeys(S3);
		
	}

public void pass(String S4) {
	
	pass.sendKeys(S4);
	
}

public void Day(String S5) {
	
	day.sendKeys(S5);
	
}


public void Month(String S6) {
	
	month.sendKeys(S6);
	
}

public void Year(String S7) {
	
	year.sendKeys(S7);
	
}

public void MBtn() {
	
	mbtn.click();
	
}

public void Submit() {
	
	submit.click();
	
}
	
	
	
}
//""