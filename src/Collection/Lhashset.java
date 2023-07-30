package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Lhashset {

	public static void main(String[] args) {
		
		LinkedHashSet l = new LinkedHashSet();
		
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		
		l.add("vikram");
		l.add(12);
		l.add(null);
		l.add(12);
		l.add("harsh");
		l.add(null);
		
		System.out.println(l);
		
		l.add("thsd");
		System.out.println(l);
		
		System.out.println(l.contains(12));
		
		Iterator itr = l.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		
		}
		
		
	}
}
