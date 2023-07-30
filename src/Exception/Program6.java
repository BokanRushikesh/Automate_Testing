package Exception;

public class Program6 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,8,9};
		
		try {
			
			System.out.println(arr[6]);
			
			System.out.println("risky code");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Arrayindex bounds Exception execute code");
		}
		
		System.out.println("End the program");
	}
}
//""