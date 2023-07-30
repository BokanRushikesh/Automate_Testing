package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WE5 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	
	Thread.sleep(2000);
	WebElement S = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	
	Thread.sleep(2000);
	boolean A = S.isSelected();
	Thread.sleep(2000);
	System.out.println(A);
	Thread.sleep(2000);
	S.click();
    boolean A1 = S.isSelected();
    Thread.sleep(2000);
	System.out.println(A1);
	Thread.sleep(2000);
	driver.close();
	}
	
}
