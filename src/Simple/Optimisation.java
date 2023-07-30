package Simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Optimisation {
	
	public void M1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		 WebElement A = driver.findElement(By.xpath("(//input [@type = 'radio'])[2]"));
		
		 Thread.sleep(2000);
		 
	     boolean sts =  A.isSelected();
	     
	     System.out.println(sts);
	      
	      Thread.sleep(2000);
	      
	      A.click();
	      
	      Thread.sleep(2000);
	      
	    boolean sts1 =  A.isSelected();
	    
	    System.out.println(sts1);
	      
	      A.click();
	      
	      driver.quit();
	
	}
	public static void main(String[] args) throws InterruptedException {
		
		Optimisation Q = new Optimisation();
		
		Q.M1();
	
	   
	}
	
	
	
	
	

}
