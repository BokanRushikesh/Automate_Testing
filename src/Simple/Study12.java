package Simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study12 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	
	WebDriver Ankita = new ChromeDriver();
	
	Ankita.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	
	Thread.sleep(2000);
	
	
	Ankita.findElement(By.xpath("//a[contains(text(),'Al')]")).click();
	
	Ankita.navigate().back();
	
	Ankita.findElement(By.xpath("//a[text()='Learn more']")).click();
	
	Ankita.navigate().forward();
	
	Ankita.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	
	Ankita.findElement(By.xpath("//a[@id='terms-link']")).click();
	
	Ankita.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	
	Ankita.findElement(By.xpath("//a[@id='privacy-link']")).click();
	
	Ankita.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	
	Ankita.findElement(By.xpath("//a[@id='cookie-use-link']")).click();
	
	
	
	}

}
//a[text()='About Us']  in amazon
//span[contains(text(),'?')] in amazon