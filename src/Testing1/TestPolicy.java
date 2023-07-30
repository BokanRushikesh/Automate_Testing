package Testing1;



	
    import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	
import Configuration.ConfigurationPath;


	public class TestPolicy 
	{
		WebDriver driver;
		POMPolicy travel;
		

		
		@BeforeClass
		public void launchbrowser() 
		{
	        System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
			driver = new ChromeDriver();
			driver.get("https://www.policybazaar.com/");	
			 
		}
		
		@BeforeMethod
		public void Maximize() 
		{
			driver.manage().window().maximize();
		}
		
		@Test
		public void tc001_travelInsurance()throws InterruptedException 
		{
			
			POMPolicy travel=new POMPolicy(driver);
			Thread.sleep(2000);
			travel.clickontravelInsurance();
			Thread.sleep(2000);
			travel.destination("USA");
			Thread.sleep(2000);
			travel.selectFirstoption();
			Thread.sleep(2000);
			travel.btn1();
			Thread.sleep(2000);
			travel.Calender1("05 February, 2023");
			travel.Calender2("15 February, 2023");
			Thread.sleep(2000);
			Actions act=new Actions(driver);
			act.sendKeys(Keys.TAB).perform();
			travel.btn1();
			Thread.sleep(2000);
			travel.years("30");
			travel.btn1();
			Thread.sleep(2000);
			travel.rd();
			travel.btn1();
			Thread.sleep(2000);
			travel.mob("9876543210");
			Thread.sleep(2000);
			travel.view();
			
		}
		
		@AfterMethod
		public void refreshbrowser() 
		{
			//driver.navigate().refresh();
		}
		@AfterClass
		public void close() 
		{
			//driver.close();
		}

	}
	
	

