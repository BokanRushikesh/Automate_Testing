package Find_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class Amazon_Link {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Damazon%2Bsign%26i%3Delectronics%26adgrpid%3D59527504272%26ext_vrnc%3Dhi%26gclid%3DCjwKCAiA-dCcBhBQEiwAeWidtZxgxIYtPs5Run2KVlmoicU3hHgps4aSZlEmPNthHMc9zaTKceVIKhoC_2MQAvD_BwE%26hvadid%3D597352931660%26hvdev%3Dc%26hvlocphy%3D9303957%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D10298324489365872500%26hvtargid%3Dkwd-365111317397%26hydadcr%3D19941_2255885%26tag%3Dgooginhydr1-21%26ref%3Dnav_signin&prevRID=YPPH13F7NDMSSAH395TS&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		driver.manage().window().maximize();
		
		List<WebElement> input = driver.findElements(By.xpath("//a"));
		
		System.out.println(input.size());
		
		for(int i=0;i<=input.size()-1;i++) {
			
			System.out.println(input.get(i).getText());
			
		}
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
//""