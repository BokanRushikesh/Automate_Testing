package Simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	
	    WebDriver driver = new ChromeDriver();
	    
	   // driver.manage().window().minimize();
	    driver.manage().window().getPosition();
	    
	    //driver.manage().window().maximize(); // to maximize window
	    
	    driver.get("https://www.youtube.com/"); // To open an application 
	                                            // using (driver.get) method
	    
	
	
	}

}
