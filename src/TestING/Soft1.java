package TestING;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft1 {

	@Test
	public void M1() {
		
		SoftAssert soft = new SoftAssert();
		
	String S = 	"Ajay";
	
	String S1 = "Sachin";
		
	soft.assertEquals(S, S1);
	
	
        String Z = 	"Ajay";
	
	    String Z1 = "Ajay";
		
	    soft.assertEquals(Z, Z1);
	
	
       String X = 	"Ajay";
	
	   String X1 = "Sachin";
		
	soft.assertNotEquals(X, X1);
	
	
	
      String R = 	"Ajay";
	
	  String R1 = "Sachin";
		
	soft.assertNull(R);
	
	soft.assertNotNull(R1);
		
		soft.assertAll();
	}
}
//""