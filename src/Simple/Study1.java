package Simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study1 {
	public static void main(String[] args) throws InterruptedException {
		
//  System.setProperty("Rushikesh", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/"); 
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.cricbuzz.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		driver.get("https://www.mesho.com/");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.close();
	}

}
