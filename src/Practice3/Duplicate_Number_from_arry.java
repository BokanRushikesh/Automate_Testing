package Practice3;

public class Duplicate_Number_from_arry {

	public static void main(String[]args){


		   int ar[] = {12,32,12,43,34,89,32};

		   for(int i=0 ; i<=ar.length-1;i++){
		   
		   
		   
		      for(int j=i+1;j<=ar.length-1;j++){
			  
			        if(ar[i]==ar[j]){
					
					System.out.println(ar[j]);
					
					   }
			   }
		   }

		  }
}
