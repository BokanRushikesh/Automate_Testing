package Practice1;

import java.util.Arrays;

public class Ascending_and_Desending_Array {

	public static void main(String[]args){

		  int ar[] = {12,23,34,89,90,43,21};

		   Arrays.sort(ar);
		   
		   System.out.println("--------Ascending order-------");
		   for(int i=0 ; i<=ar.length-1;i++){
		   
		        System.out.println(ar[i]);
		   
		   }
		   
		   System.out.println("---------Desending order--------");


		    for(int j=ar.length-1;j>=0;j--){
			
			
			        System.out.println(ar[j]);
			
			    }





		}
		//""
}
