package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetHash {
	
	public static void main(String[] args) {
		
		HashSet H = new HashSet();
		
		System.out.println(H.size());
		System.out.println(H.isEmpty());
		
		H.add("shankar");
		H.add(21);
		H.add(21);
		H.add(21);
		H.add('A');
		H.add(98.90);
		H.add(null);
		H.add(null);
		H.add(null);
		H.add("shankar");
		H.add(21);
		H.add('A');
		H.add(98.90);
		H.add(null);
		
		System.out.println(H);
		
		System.out.println(H.size());
		System.out.println(H.isEmpty());
		
		System.out.println(H.contains(null));
		
		H.remove(null);
		System.out.println(H);
		
	System.out.println("-----------iterator-----------");
		
		 Iterator itr = H.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
			 
		 }
		 System.out.println("-----------only iterator is used in HashSet-----------");
		 
		
		
		
		
	}
	
	
	
	
	

}
//  ""  ''