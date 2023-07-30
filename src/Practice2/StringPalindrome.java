package Practice2;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String S = "nayan";
		
//		int S1 = S.length();
		
		String rev = "";
		
		for(int i=S.length()-1;i>=0;i--) {
			
			rev = rev + S.charAt(i);
			
		}
		System.out.println(rev);
		
		if(S.equals(rev)) {
			
			System.out.println("Given String Is Palindrome");
		}
		else {
			System.out.println("Given String Is Not Palindrome");
		}
	}
}
//""