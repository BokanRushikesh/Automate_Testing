package Practice3;

public class Length_of_each_string {

	public static void main(String[]args){

		String s = "This is java program";

		String s1[] = s.split(" ");

		for(int i=0;i<=s1.length-1;i++){

		     System.out.println("Length : "+s1[i]+ " :"+s1[i].length());


		   }



		}
		//""
}
