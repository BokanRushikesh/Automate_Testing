package TestING;



import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SOFT {

	
	@Test
	public void M1() {
		
		SoftAssert soft = new SoftAssert();
		
		String S ="Abc";
		
		String S1 ="Abc";
		
		soft.assertEquals(S, S1);
		
		
		
		String name ="Nitin";
		
		String Lastname ="Nit";
		
		soft.assertEquals(name, Lastname);
		
		
		String School ="Deogiri";
		
		String College ="Shreyas";
		
		soft.assertNotEquals(School, College);
		
		
     	soft.assertAll();
		
		
	}
}
