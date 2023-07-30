package Practice1;

import java.util.Arrays;

public class Sort_Array_Ascending {
	
	public static void main(String[] args) {
		
	

	int ar[] = {12,32,34,90,87,91,88,78};
	
	
	
	Arrays.sort(ar);
	System.out.println("--------Ascending order-------");
	
	for(int i=0 ;i<=ar.length-1;i++) {
		
	
		System.out.println(ar[i]);
		
	}
	
	System.out.println("--------Descending order-------");
	
	for(int j=ar.length-1;j>=0;j--) {
		
		
		
		System.out.println(ar[j]);
		
		
		
	}
	
}
}
//""