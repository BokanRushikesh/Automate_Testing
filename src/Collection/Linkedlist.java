package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		
		l.add("swing");
		l.add(23);
		l.add(null);
		l.add(23);
		l.add("swing");
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		
		l.add(2,"won");
		
		System.out.println(l);
		
		l.set(2, "dream11");
		
		System.out.println(l);
		
		System.out.println(l.indexOf("dream11"));
		
		System.out.println(l.lastIndexOf("swing"));
		
		System.out.println(l.get(4));
		
		System.out.println("----------advanced methods--------");
		
		l.addFirst("Rushi");
		l.addLast("balaji");
		
		System.out.println(l);
		
		
		
		System.out.println(l.getLast());
		System.out.println(l.getFirst());
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println(l);
		
		System.out.println("---------forloop--------");
		
		for(int i=0;i<=l.size()-1;i++) {
			
			System.out.println(l.get(i));
		}
		
		System.out.println("---------iterator---------");
		
		Iterator itr = l.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		System.out.println("---------list iterator--------");
		
		ListIterator itr1 = l.listIterator();
		while(itr1.hasNext()) {
			
			System.out.println(itr1.next());
		}
		
		System.out.println("----------enumerator---------");
		
		
	}
}
