package Practice1;

public class Prime_from_Array {

	public static void main(String[]args){

		 int ar[] = {7,8,9,1,2,3,4,0};


		    for(int i=0;i<=ar.length-1;i++){
			
			   int A=0;
			   
			   int num = ar[i];
			   
			   for(int j=2;j<=num-1;j++){
			   
			         if(num%j==0){
					 
					       A = A+1;
					 
					 
					     }
			   
			          }
			       if(A==0){
				   
				   
				     System.out.println(num);
				   
				   }
			
			}




		}
		//""
}
