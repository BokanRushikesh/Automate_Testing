package Practice2;

public class StringPalindrome2 {

	public static void main(String[] args) {
		
		String S = "raksha";
		
		String rev = "";
		
		for(int i=S.length()-1;i>=0;i--) {
			
			rev = rev + S.charAt(i);
			
		}
		
		System.out.print(rev);
		
		
		if(S.equals(rev)) {
			
			System.out.print(" - Palindrome");
		}
		
		else {
			System.out.print(" - not Palindrome");
		}
	}
}
//""