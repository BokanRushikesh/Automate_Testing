package Framework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class Flogin2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Flogin_1 F = new Flogin_1(driver);
		
     //		 Test case 01
		
		F.enterUserId("Rajesh");
		
		F.enterPassword("shinde");
		
		F.Button();
		
		Thread.sleep(2000);
		
//		 Test case 02
		
//	
//         driver.navigate().back();
//		
//		driver.navigate().refresh();
//		
//	  F.enterUserId("satish");
//		
//		F.enterPassword("jadhav");
//		
//		F.Button();
//		
//		Thread.sleep(2000);
//		
////		 Test case 03
//		
//        driver.navigate().back();
//		
//		driver.navigate().refresh();
//		
//	  F.enterUserId("vikas");
//		
//		F.enterPassword("rathod");
//		
//		F.Button();  
//		
//		Thread.sleep(2000);
//		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.myntra.com/");
		
       
		Thread.sleep(2000);
		
//      	driver.close();
		

		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.youtube.com/");
		
//        Set<String> ids = driver.getWindowHandles();
		
//		System.out.println(ids);
		
//		driver.switchTo().window("F900CF442B4CB194D3B17BA12B447B62");
		
		driver.close();  
		
//		Thread.sleep(2000);
		
		 
		 
	}
}
//""   ''