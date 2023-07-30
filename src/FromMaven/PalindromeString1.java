package FromMaven;

public class PalindromeString1 {

	public static void main(String[] args) {
		
		String S = "madaM";
		
		String rev = "";
		
		for(int i=S.length()-1;i>=0;i--) {
			
			rev = rev+S.charAt(i);
		}
		
		if(S.equals(rev)) {
			
			System.out.println(rev+" :palindrome string");
		}
		
		else {
			
			System.out.println(rev +" :not palindrome string");
		}
	}
}
