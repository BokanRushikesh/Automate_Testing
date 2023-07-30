package Practice;

public class Basic {

	
	int a = 23;
	
	int b = 47;
	
	
	public  void m1() {
		
		int a = 99;
		
		int b = 89;
		
		
		
		System.out.println( "local "+ a);
		
		System.out.println( "local "+b);
		
		
		System.out.println( "gobal "+ this.a);
		
		System.out.println("gobal "+this.b);
	}
	
	public static void main(String[] args) {
		
		    
		Basic A = new Basic();
		
		A.m1();
		
	}
	
}
//""