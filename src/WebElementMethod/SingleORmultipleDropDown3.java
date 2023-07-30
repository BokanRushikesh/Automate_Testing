package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleORmultipleDropDown3 {
	
	public void M1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/reg/");
	
	WebElement A = driver.findElement(By.xpath("//select[@id='year']"));
	
	Select S = new Select(A);
	
	boolean Z = S.isMultiple();
	
	System.out.println(Z);
	
	}
   public static void main(String[] args) {
	
	   SingleORmultipleDropDown3 V = new SingleORmultipleDropDown3();
	   
	   V.M1();
	   
}
}
