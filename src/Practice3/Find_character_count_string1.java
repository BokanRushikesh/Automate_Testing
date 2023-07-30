package Practice3;

public class Find_character_count_string1 {

	public static void main(String[] args) {
		
		String s = "java selenium with automation";
		
		int count = 0;  // count string 
		
		   s = s.replace(" ", "");  // replase soace to no space
		
		for(int i=0;i<=s.length()-1;i++) {
			
			count++;
			
			
			
		}
		System.out.println(count);
		
		
		
	}
}
//""