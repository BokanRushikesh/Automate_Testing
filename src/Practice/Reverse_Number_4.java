package Practice;

import java.util.Scanner;

public class Reverse_Number_4 {

	 public static void main(String[]args){

         Scanner S = new Scanner(System.in);
		    int num = S.nextInt();

		    int rev = 0 ;


		   while(num>0){

		             int d = num%10;

		              rev = rev *10 +d;

		               num = num/10;

		          }

		          System.out.println(rev);


		    }
}
