package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleORmultupleDropDown1 {

	public void M1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	
	WebElement A = driver.findElement(By.xpath("//select[@id='day']"));
	
	  Select S = new Select(A);
	  
	  boolean s1 = S.isMultiple();
	
	   System.out.println(s1);
	
	
	}
	
	
	public static void main(String[] args) {
		
		SingleORmultupleDropDown1 D = new SingleORmultupleDropDown1();
		
		D.M1();
	
	}
	
	
	
	
	
}
