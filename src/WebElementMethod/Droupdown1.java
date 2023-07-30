package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Droupdown1 {
	
	public void M1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	   Thread.sleep(2000);
	   
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	   WebElement A = driver.findElement(By.xpath("//select[@id='day']"));
	   Thread.sleep(2000);
	   Select S = new Select (A);
	   Thread.sleep(2000);
	   S.selectByIndex(23); // using selectByIndex method
	
	
	
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Droupdown1 D = new Droupdown1();
		
		D.M1();
		
	}

}
