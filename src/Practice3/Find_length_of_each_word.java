package Practice3;

public class Find_length_of_each_word {

	public static void main(String[] args) {
		
	String s = 	"This is java program";
		
		String S1[] = s.split(" ");
		
		for(int i=0 ; i<=S1.length-1;i++) {
			
			System.out.println("Length of word -"+S1[i]+":"+S1[i].length());
			
			   
		}
		
		
	}
}
//""