package Practice3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class NotificationIMP {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--disable-notification");
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("www.majhinaukri.com");
		
		driver.manage().window().maximize();
		
		
		
		//div[@class='px-1   flex flex-middle nmx-1 pb-1']
	}
}
//""