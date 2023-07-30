package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetprog {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		
		h.add("sachin");
		h.add(23);
		h.add(null);
		h.add(32);
		h.add("sachin");
		h.add(null);
		
		System.out.println(h);
		
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		
		System.out.println("----------iterator-----------");
		  Iterator itr = h.iterator();
		  
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
		  
		  System.out.println("----------for loop---------");
		  
		  for(int i=0;i<=h.size()-1;i++) {
			  
			  System.out.println(i);
		  }
		  
	}
}
