package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashLinkedSet {

	public static void main(String[] args) {
		
		LinkedHashSet L = new LinkedHashSet();
		
		System.out.println(L.size());
		System.out.println(L.isEmpty());
		
		L.add("shankar");
		L.add(21);
		L.add(21);
		L.add(21);
		L.add('A');
		L.add(98.90);
		L.add(null);
		L.add(null);
		L.add(null);
		L.add("shankar");
		L.add(21);
		L.add('A');
		L.add(98.90);
		L.add(null);
		
		System.out.println(L);
		
		System.out.println(L.size());
		System.out.println(L.isEmpty());
		
		System.out.println(L.contains(null));
		
		L.remove(null);
		System.out.println(L);
		
		System.out.println("----------iterator---------------");
		
		Iterator itr = L.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
	}
	
	
}
//     ""   ''