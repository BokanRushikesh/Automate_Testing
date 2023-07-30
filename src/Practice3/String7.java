package Practice3;

public class String7 {

	public static void main(String[] args) {
		
    String s = "IFCS @JHFY* kshdis# 8898877";
    
    System.out.println("----------sort digit ------------");
		
	String s1 = s.replaceAll("[A-Z,a-z]", "");
	
	System.out.println(s1);
	

   String s2 = s.replaceAll("[0-9,@,#,*]", "");
   
   
   System.out.println("----------sort character ------------");
	   System.out.println(s2);
	}
}
//""