package Practice3;

public class Find_character_count_string4 {

	public static void main(String[] args) {
		
		String s = "java selenium with automation";
		
		int count = 0;
		
		for(int i=0;i<=s.length()-1;i++) {
			
			if(s.charAt(i)=='a' || s.charAt(i)=='m') {
				
				count++;
				 
			}
			
			  
		}
		System.out.println(count);
		
	}
}
//""  ''