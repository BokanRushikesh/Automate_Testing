package Practice3;

public class String9 {

	public static void main(String[] args) {
		
		String s = "abc xyz def pqr ijk mno";
		
		String[] s1 = s.split(" ");
		
		System.out.println("print even numbers");
		
		for(int i=0 ; i<s1.length;i=i+2) {
			
			System.out.println(s1[i]);
		}
		
		System.out.println("print odd numbers");
		
		for(int j=1;j<=s1.length;j=j+2) {
			
			System.out.println(s1[j]);
			
		}
		
	}
}
//""