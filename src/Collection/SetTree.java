package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTree {
	public static void main(String[] args) {
		
	
	
	TreeSet T = new TreeSet(); // it is a homogeneous class 
	
	System.out.println(T.size());
	System.out.println(T.isEmpty());
	
	T.add("Raksha");
	T.add("Rajesh");
	T.add("Ram");
	T.add("Rashmika");

	
	System.out.println(T.size());
	System.out.println(T.isEmpty());
	
	System.out.println(T);
	
	System.out.println(T.contains("Rashmika"));
	

	
	System.out.println("----------iterator------------");
	Iterator itr = T.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
	
	
	

}
}
//  ""   ''