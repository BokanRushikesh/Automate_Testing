package Practice3;

public class String5 {

	public static void main(String[] args) {
		
	String s = 	"this is java program";
		
	String [] S1  = s.split(" ")	;
	
	for(int i=0 ; i<=S1.length-1;i++) {
		
		System.out.println(S1[i].substring(0,1).toUpperCase()+S1[i].substring(1,S1[i].length()));
		
		
	}
		
		
		
		
		
	}
}
//""