package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {
	
	public void M2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://en-gb.facebook.com/reg/");
	   
	   driver.manage().window().maximize();
	   
	  WebElement A = driver.findElement(By.xpath("//select[@id='month']"));
	
	Select S = new Select (A);
	
	 S.selectByIndex(11);
	
	
}
    public static void main(String[] args) {
    	Dropdown2 D = new Dropdown2();
    	
    	D.M2();
	
    
    }
}
