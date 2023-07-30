package Practice;

public class SuperKeyword extends Basic{

	
	public void M2() {
		
		int a = 989;
		
		System.out.println(a);
		
		System.out.println(super.a);
		
		System.out.println(super.b);
	}
	
	public static void main(String[] args) {
		
		SuperKeyword S = new SuperKeyword ();
		
		S.M2();
	}
	
	
}
