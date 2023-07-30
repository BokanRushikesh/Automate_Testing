package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.cricbuzz.com/premium-subscription/user/login");
	
	boolean B = driver.findElement(By.xpath("(//button[@type='button'])[1]")).isEnabled();
	System.out.println(B);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='email'] ")).sendKeys("rushikesh");
	
	
	boolean A = driver.findElement(By.xpath("(//button[@type='button'])[1]")).isEnabled();

	System.out.println(A);
	
	}

}
