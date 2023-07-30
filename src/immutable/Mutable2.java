package immutable;

public class Mutable2 {

	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("this is awsome");
		
		System.out.println(buffer);
		
		System.out.println(buffer.append(" bcz i won"));
		
		System.out.println(buffer.append(" dream11"));
	}
}
