package Practice;

public class ArmStrong3 {
	 public static void main(String[]args){

		  int num = 153;

		  int i = 0;

		  int j;


		  while(num>0){

		         j=num%10;
		 
		         i = j*j*j+i;

		         num = num/10;

		     }

		   System.out.println(i);


		}
}
