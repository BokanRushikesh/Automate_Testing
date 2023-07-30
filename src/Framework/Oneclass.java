package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Oneclass {

	@FindBy(xpath="//input[@name='firstname']")private WebElement name;
	
	@FindBy(xpath ="//input[@name='lastname']" )private WebElement lname;
	
	@FindBy(xpath="//input[@name='reg_email__']")private WebElement email;
	
	@FindBy(xpath ="//input[@name='reg_passwd__']")private WebElement pass;
	
	@FindBy(xpath = "//select[@name='birthday_day']")private WebElement day;
	
	@FindBy(xpath = "//select[@name='birthday_month']")private WebElement month;
	
	@FindBy(xpath = "//select[@name='birthday_year']")private WebElement year;
	
	@FindBy(xpath = "(//input[@name='sex'])[2]")private WebElement male;
	
	@FindBy(xpath = "//button[@name='websubmit']")private WebElement submit;
	
	
	public Oneclass(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public void firstname(String A) {
		
		name.sendKeys(A);
	}
	
	public void lastname(String B) {
		
		lname.sendKeys(B);
	}
	
	public void Email(String C) {
		
		email.sendKeys(C);
	}
	
	public void Pass(String D) {
		
		pass.sendKeys(D);
	}
	
	public void Day(String E) {
		
		Select s = new Select(day);
		
		s.selectByVisibleText(E);
	}
	
	public void Month(String F) {
		
		Select s1 = new Select(month);
		
		s1.selectByVisibleText(F);
	}
	
	public void Year(String G) {
		
		Select s2 = new Select(year);
		
		s2.selectByVisibleText(G);
	}
	
	public void Male() {
		male.click();
	}
	
	public void Btn() {
		submit.click();
	}
}
//""