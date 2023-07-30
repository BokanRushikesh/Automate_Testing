package Practice3;

public class Find_Duplicate_Number_from_Array {

	public static void main(String[]args){


		  int ar[] = {30,12,30,78,98,90,12};

		    for(int i=0 ; i<=ar.length-1;i++){
			
			
			     for(int j=i+1; j<=ar.length-1;j++){
				 
				   if(ar[i]==ar[j]){
				   
				        System.out.println("Dupliocate Number: "+ar[j] );
				   
				       }
				 
			}
			
			   
			}

		  }
	
}
//""