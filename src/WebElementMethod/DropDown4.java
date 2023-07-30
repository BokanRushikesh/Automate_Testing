package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown4 {
	public void M2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://en-gb.facebook.com/reg/");
	    
	    WebElement A = driver.findElement(By.xpath("//select [@id='month']"));
	
	    Select S = new Select (A);
	    
	    S.selectByValue("10"); // here only type only digit value in double quote
	
	}
		
   public static void main(String[] args) {
	   DropDown4 D = new DropDown4();
	   D.M2();
}

}
