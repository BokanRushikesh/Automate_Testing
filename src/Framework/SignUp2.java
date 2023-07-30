package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class SignUp2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		SignUp1 S = new SignUp1(driver);
		
//		Tc 01
		S.Firstname("Rushikesh");
		
		S.Lastname("Bokan");
		
		S.Email("asdfg");
		
		S.Password("ikjhul");
		
//		Tc 02
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
        S.Firstname("Raju");
		
		S.Lastname("shrivastav");
		
		S.Email("asdfg");
		
		S.Password("lkjhg");
		
		Thread.sleep(1000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
	}
}
//""