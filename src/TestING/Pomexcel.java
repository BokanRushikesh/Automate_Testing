package TestING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomexcel {

	@FindBy(xpath = "//input[@name='firstname']")private WebElement fname;
	
	@FindBy(xpath = "//input[@name='lastname']")private WebElement lname;
	
	@FindBy(xpath = "//input[@name='reg_email__']")private WebElement mob;
	
	
	
	Pomexcel(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void Firstname(String S1) 
	{
		
		fname.sendKeys(S1);
		
		
	}
	
	public void Lastname(String S2) 
	{
		
		lname.sendKeys(S2);
		
		
	}
	
	public void Mobile(String S3) 
	{
		
		mob.sendKeys(S3);
		
		
	}
	
}








//""