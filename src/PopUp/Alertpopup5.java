package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class Alertpopup5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt  = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(opt);
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		String data = driver.switchTo().alert().getText();
		System.out.println(data);
		
//		driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
		
	}
}
//""