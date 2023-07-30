package Practice1;

public class Palindrome2 {

	public static void main (String []args){

		int num = 121;

		int temp = num ;

		int rev = 0;

		while(temp>0){

		int d = temp%10;

		  rev = rev*10 +d;

		  temp = temp/10;

		}

		 if(rev==num){

		      System.out.println(rev + " Palindrome");

		    }
		   else{

		      System.out.println(rev + " Not Palindrome");

		       }

        }
      }
