package Testing1;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class POMPolicy
	{
		@FindBy(xpath="//i[@class='icon-bg homeIconsBg icon-bg-new ti']")private WebElement icon;
		@FindBy(xpath="//input[@id='country']")private WebElement dest;
		@FindBy(xpath="//ul[@class=\"search-list\"]/li")private WebElement firstopt;
		@FindBy(xpath="//button[text()='Next']")private WebElement dnext;
		@FindBy(xpath="(//input[@type=\"text\"])[1]")private WebElement From;
		@FindBy(xpath="(//input[@type=\"text\"])[2]")private WebElement To;
		//@FindBy(xpath="//button[@class=\"travel_main_cta\"]")private WebElement cnext;
		@FindBy(xpath="//select[@id='feet']")private WebElement age;
		//@FindBy(xpath="//button[@class=\"travel_main_cta\"]")private WebElement anext;
		@FindBy(xpath="(//input[@type='radio'])[1]")private WebElement radio;
		@FindBy(xpath="//input[@id=\"mobileNumber\"]")private WebElement mobile;
		@FindBy(xpath="//button[text()='View plans']")private WebElement plans;
		
		//Constructor
		
		public POMPolicy(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Methods
		public void clickontravelInsurance() 
		{
		icon.click();
		}
		public void destination(String s1) 
		{
			dest.sendKeys(s1);
		}
		public void selectFirstoption() 
		{
			firstopt.click();
		}
		
	    public void btn1() 
	    {
	    	dnext.click();
		}
	    public void Calender1(String s2) 
		{
	    	
	       From.sendKeys(s2);
	    }
	    public void Calender2(String s3) 
	   	{
	          To.sendKeys(s3);
	    }
	   
//	    public void btn2() 
//	    {
//	    	cnext.click();
//		}
	    public void years(String s4) 
	   	{
	          Select s1=new Select(age);
	          s1.selectByValue(s4);
	    }
	    
	    public void rd() 
	    {
	    	radio.click();
	    }
	    public void mob(String s5) 
	    {
	    	mobile.sendKeys(s5);
	    }
	    
	    public void view() 
	    {
	    	plans.click();
		}
	    	

	}
	
	
	

