package Simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study14 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	
	
	WebDriver dew = new ChromeDriver();
	
	dew.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	
	Thread.sleep(2000);
	
	boolean B = dew.findElement(By.xpath("(//input [@type = 'radio'])[2]")).isSelected();
	
	System.out.println(B);
	Thread.sleep(2000);
	
	dew.findElement(By.xpath("(//input [@type = 'radio'])[2]")).click();
	
	Thread.sleep(2000);
	boolean B1 = dew.findElement(By.xpath("(//input [@type = 'radio'])[2]")).isSelected();
	
	System.out.println(B1);
	
	}
		

		


}
