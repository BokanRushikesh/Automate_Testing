package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown5 {
	public void M1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/reg/");
		
		 WebElement A = driver.findElement(By.xpath("//select [@id='year']"));
		
		Select S = new Select (A);
		
		S.selectByValue("1997");
		
		driver.quit();
		
	}
		public static void main(String[] args) {
			DropDown5 D = new DropDown5();
			
			D.M1();
			
		}


}
