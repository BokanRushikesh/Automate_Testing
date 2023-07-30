package Collection;

import java.util.ArrayList;

public class Arraylist1 {
	
	public static void main(String[] args) {
		
		ArrayList A = new ArrayList();
		System.out.println(A.isEmpty());
		
		System.out.println(A.size());
		
		A.add  ("asd"); //[0]
		A.add(30);      //[1]
		A.add('W');     //[2]
		A.add("asd");   //[3]
		
      System.out.println(A);
		
		System.out.println(A.isEmpty());
		
		System.out.println(A.size());
		
		System.out.println(A.indexOf(30));
		
		System.out.println(A.get(1));
		
		System.out.println(A.indexOf("asd"));
		
		System.out.println(A.get(0));
		
		System.out.println(A.contains("asd"));
		
		System.out.println(A.contains("Asd"));
		
		System.out.println(A.lastIndexOf("asd"));
		
		A.add(3,"R"); // Add value insted of this number
		
		System.out.println(A);
		
		A.set(4, "Ram"); // replace value by another value
		
		System.out.println(A);
		
		A.add(5,"tyagi");
		
		System.out.println(A);
		
		A.set(5, "rajesh");
		
		System.out.println(A);
		
		A.remove(2); // it is use to remove\delete specific element 
		
		System.out.println(A);
		
		A.removeAll(A);
		
		System.out.println(A); // use to remove all
		
		
		
		
//		String S= "asdf";
//		
//		String S1 =new String ("asdffre");
	
//	String S2= "india is my country";
//	
//	String S3 [] = S2.split(" ");
//
//	for(int i=S3.length-1;i>=0;i--) {
//      
//		
//		String Str = S3[i]+" ";
//		
//		System.out.print(Str);
//	
//	
//}
//	String S = "Rushikesh ";
//	
//	for(int i=S.length()-1;i>=0;i--) {
//	
//	System.out.print(S.charAt(i));
//	
//	}

}
}