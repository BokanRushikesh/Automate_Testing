package Testing1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	@FindBy(xpath  ="//input[@placeholder='First Name']")private WebElement fname;
	
	@FindBy(xpath  ="//input[@placeholder='Last Name']")private WebElement lname;
	
	@FindBy(xpath  ="//textarea[@ng-model='Adress']")private WebElement address;
	
	@FindBy(xpath  ="//input[@ng-model='EmailAdress']")private WebElement email;
	
	@FindBy(xpath  ="//input[@ng-model='Phone']")private WebElement Phone;
	
	@FindBy(xpath  ="//input[@value='Male']")private WebElement male;
	
	@FindBy(xpath  ="//input[@value='Cricket']")private WebElement hobbie1;
	
	@FindBy(xpath  ="//input[@value='Movies']")private WebElement hobbie2;
	
	@FindBy(xpath  ="//div[@id='msdd']")private WebElement lang;
	
	@FindBy(xpath = "//ul[@style='list-style:none;max-height: 230px;overflow: scroll;']/li[1]")private WebElement lang1;
	
	@FindBy(xpath = "//ul[@style='list-style:none;max-height: 230px;overflow: scroll;']/li[2]")private WebElement lang2;
	
	@FindBy(xpath = "//ul[@style='list-style:none;max-height: 230px;overflow: scroll;']/li[3]")private WebElement lang3;
	
	@FindBy(xpath = "//ul[@style='list-style:none;max-height: 230px;overflow: scroll;']/li[4]")private WebElement lang4;
	
	@FindBy(xpath = "//ul[@style='list-style:none;max-height: 230px;overflow: scroll;']/li[5]")private WebElement lang5;
	
	@FindBy(xpath = "//ul[@style='list-style:none;max-height: 230px;overflow: scroll;']/li[6]")private WebElement lang6;
	
	@FindBy(xpath = "//ul[@style='list-style:none;max-height: 230px;overflow: scroll;']/li[7]")private WebElement lang7;
	
	@FindBy(xpath  ="//select[@id='Skills']")private WebElement skills;
	
	@FindBy(xpath  ="//span[@role='combobox']")private WebElement country;
	
	@FindBy(xpath  ="//select[@id='yearbox']")private WebElement year;
	
	@FindBy(xpath  ="//select[@placeholder='Month']")private WebElement month;
	
	@FindBy(xpath  ="//select[@id='daybox']")private WebElement day;
	
	@FindBy(xpath  ="//input[@id='firstpassword']")private WebElement pass;
	
	@FindBy(xpath  ="//input[@id='secondpassword']")private WebElement confirmpass;
	
	@FindBy(xpath  ="//button[@value='Refresh']")private WebElement Refresh;
	
	
	Demo1(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void firstname(String A) {
		
		fname.sendKeys(A);
	}
	
    public void lastname(String B) {
		
		lname.sendKeys(B);
	}

   public void Address(String C) {
	
	address.sendKeys(C);
}

   public void Email(String D) {
	
	email.sendKeys(D);
}

    public void Phoneno(String E) {
	
	Phone.sendKeys(E);
}

    public void gender() {
	
	male.click();
}

   public void Hobbie1() {
	
	hobbie1.click();
}

   public void Hobbie2() {
	
	hobbie2.click();
}
   
   public void Skill(String F) {
		
		Select s = new Select(skills);
		
		s.selectByVisibleText(F);
	}
   
   public void Year(String G) {
		
	   Select s = new Select(year);
		
		s.selectByVisibleText(G);
		
	}
   
   public void Month(String H) {
		
	   Select s = new Select(month);
		
		s.selectByVisibleText(H);
	}
   
   public void Day(String I) {
		
	   Select s = new Select(day);
		
		s.selectByVisibleText(I);
		
	}
   
   public void Password(String J) {
		
		pass.sendKeys(J);
	}
   
   public void Confirmpass(String K) {
		
	   confirmpass.sendKeys(K);
	}
   
   public void refresh() {
		
	   Refresh.click();
	   
	}
   
   public void language() {
	   
	   lang.click();
   }
   
  public void language1() {
	   
	   lang1.click();
	   
	   lang2.click();
	   
	   lang3.click();
	   
	   lang4.click();
	   
	   lang5.click();
	   
	   lang6.click();
	   
	   lang7.click();
   }
   
}
//""