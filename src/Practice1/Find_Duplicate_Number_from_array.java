package Practice1;

public class Find_Duplicate_Number_from_array {

	public static void main(String[]args){

		int ar[] = {12,21,33,43,33,21};

		for(int i=0;i<=ar.length-1;i++){

		     for(int j=i+1;j<=ar.length-1;j++){
			 
			        if(ar[i]==ar[j]){
					
					
					     System.out.println(ar[j]);
					
					    }
						}

		           }

		      }
}
