package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class List {
	
	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		
		System.out.println(li.size());
		System.out.println(li.isEmpty());
		
		li.add("Raksha");
		li.add(12.78);
		li.add('H');
		li.add(89);
		li.add("Raksha");
		li.add(12.78);
		li.add('H');
		li.add(89);
		li.add(null);
		li.add("Diksha");
		li.add(39.98);
		
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.isEmpty());
		
		System.out.println(li.indexOf(null));
		//System.out.println(li.clone());  it is use to print similar data
		
		System.out.println(li.lastIndexOf("Raksha"));
		
		System.out.println(li.contains("Raksha"));
		
		System.out.println(li.get(1));
		
		li.add(0,"Ragini");
		
		li.set(1, 1000);
		
		li.remove(1);
		
		System.out.println(li);
		
		
		System.out.println("-------Linked list New Method ----------------");
		
		li.addFirst("Virat");
		
		li.addLast("Babar Azam");
		
		System.out.println(li);
		
		
		System.out.println(li.getFirst());
		
		System.out.println(li.getLast());
		
		li.removeFirst();
		li.removeLast();
		
		System.out.println(li);
		
		System.out.println("----------forloop-----------");
		
		for(int i=0;i<li.size()-1;i++) {
			System.out.println(li.get(i));
		}
		
		System.out.println("---------------iterator----------------");
		 
		Iterator itr = li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
	}
		System.out.println("---------------Listiterator----------------");
	
	         ListIterator itr1 = li.listIterator();
	         
	         while(itr1.hasNext()) {
	        	 System.out.println(itr1.next());
	         }
	         
	         System.out.println("---------------enumerator is not support----------------");
	
	      
	
	}

}
//  ""  ''