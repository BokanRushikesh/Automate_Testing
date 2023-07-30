package Simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study7 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();		
		System.out.println("https://www.facebook.com/");	

		
		
	
		driver.close();
		
		
		
		
		
		
		
	}

}
