package Exception;

public class Prog6 {

	public static void main(String[] args) {
		
		int ar[] = {2,3,4,1,8,9};
		
		try {
			
		
		System.out.println(ar[6]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Program Execute");
		}
		
		System.out.println("End Program");
	}
}
//""