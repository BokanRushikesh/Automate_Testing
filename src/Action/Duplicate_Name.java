package Action;

public class Duplicate_Name {
	
	public static void main(String[] args) {
		
		String S1[] = {"Rushi","Mukesh","Suresh","Rushi","Mukesh","Anku","Anku"};
		
		for(int i=0;i<S1.length;i++) 
		{
		
			for(int j=i+1;j<S1.length;j++) 
			{
				
				if(S1[i].equals((S1)[j])) 
				{
					System.out.println(S1[i]);
				}
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
//""