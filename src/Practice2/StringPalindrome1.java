package Practice2;

public class StringPalindrome1 {

	public static void main(String[] args) {
		
		String S = "nayan";
		String rev = "";
		
		for(int i=S.length()-1;i>=0;i--) {
			
			rev = rev+S.charAt(i);
			
		}
		
		System.out.println(rev);
		
		if(S.equals(rev)) {
			
			System.out.println("palindrome");
			
		}
		
		else {
			
			System.out.println("not");
		}
	}
}
//""