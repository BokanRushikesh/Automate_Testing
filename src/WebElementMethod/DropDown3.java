package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown3 {
	public void M1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	  
	WebDriver driver = new ChromeDriver ();
	
	driver.get("https://en-gb.facebook.com/reg/");
	
	WebElement A = driver.findElement(By.xpath("//select [@id='day']"));
	
	Select S = new Select (A);
	
	S.selectByValue("1");
	
	}
   public static void main(String[] args) {
	
	   DropDown3 D = new DropDown3();
	   
	   D.M1();
   
   }
}
