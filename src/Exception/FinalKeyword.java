package Exception;

public class FinalKeyword {

	int age  =23;
	
	public  void m1() {
		
		age = 33;
		
	}
	
	public static void main(String[] args) {
		
		FinalKeyword f = new FinalKeyword();
		
		f.m1();
	}
	
}
