package Practice1;

public class StarPattern4 {

	public static void main(String[] args) {
		
		for(int i=1;i<=8;i++) {
			
			for(int j=1;j<=8;j++) {
				
				if(i>=2 && j>=2 && i<=7 && j<=7) {
					
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}
//""