package Practice;

public class String1 {

	public static void main(String[] args) {
		
		String s = "abc xyz def pqr ijk mno";
		
		String [] s1 = s.split(" ");
		
		System.out.println("-------Even index- -------");
		
		for(int i=0;i<=s1.length-1;i=i+2) {
			
			System.out.println(s1[i]);
			
			
		}
		
		System.out.println("-------Odd index---------");
		
		for(int j=1;j<=s1.length;j=j+2) {
			
			
			System.out.println(s1[j]);
			
		}
	}
}
//""