package Action;

public class Duplicate_Number {
public static void main(String[] args) {
		
		int S1[] = {100,90,89,90,100,23,32,23,47,76};
		
		for(int i=0;i<S1.length;i++) 
		{
		
			for(int j=i+1;j<S1.length;j++) 
			{
				
				if(S1[i]==S1[j]) 
				{
					System.out.println(S1[i]);
				}
			}
			
			
		}
		
		}
	
	}
