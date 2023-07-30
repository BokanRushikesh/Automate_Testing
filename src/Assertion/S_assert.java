package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class S_assert {

	@Test
	public void m1() {
		
		SoftAssert soft = new SoftAssert();
		
		String S = "Wakanda forever";
		
		String S1 = "Wakanda forever";
		
		soft.assertEquals(S, S1);
		
		soft.assertAll();
	}
     @Test
        public void m2() {
    	 
    	 SoftAssert soft = new SoftAssert();
		String A = "Thanos";
		
		String A1 = "Thanos";
	
		soft.assertNotEquals(A, A1);
		
		soft.assertAll();
        }
		@Test
		public void m3() {
			
		SoftAssert soft = new SoftAssert();
		String B = null;
		
		soft.assertNull(B);
	
		soft.assertAll();
	}
		@Test
		public void m4() {
			
			SoftAssert  soft  = new SoftAssert();
			
			String C = null;
			
			soft.assertNotNull(C);
			
			soft.assertAll();
		}
		
		@Test
		public void m5() {
			
			SoftAssert  soft  = new SoftAssert();
			
			boolean b = true;
			
			soft.assertTrue(b);
		}
		
		@Test
		public void m6() {
			
			SoftAssert  soft  = new SoftAssert();
			
			boolean v = false;
			
			soft.assertFalse(v);
		}
		
		
}

//""