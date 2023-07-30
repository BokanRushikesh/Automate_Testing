package TestING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {

	@FindBy(xpath = "//input[@name='firstname']") private WebElement fname;
	
	@FindBy(xpath = "//input[@name='lastname']") private WebElement lname;
	
	@FindBy(xpath = "//input[@name='reg_email__']") private WebElement mob;
	
	@FindBy(xpath = "//input[@name='reg_passwd__']") private WebElement pass;
	
	
	Pom(WebDriver driver)
	{
		
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
	
	public void MobileNumber(String S3) 
	{
		mob.sendKeys(S3);
	}
	
	public void PassWord(String S4) 
	{
		pass.sendKeys(S4);
	}
	
	
	
}
//""