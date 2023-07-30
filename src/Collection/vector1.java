package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		
		
		Vector v = new Vector();
		
		System.out.println(v.size());
		
		System.out.println(v.isEmpty());
		
		System.out.println(v.capacity());
		
		v.add("ajay");
		v.add(12);
		v.add(12.34);
		v.add(null);
		v.add("ajay");
		
		System.out.println(v);
		
		System.out.println(v.indexOf(12));
		
		System.out.println(v.lastIndexOf(null));
		
		System.out.println(v.get(2));
		
		System.out.println(v.capacity());
		
		System.out.println(v.contains("ajay"));
		
		v.add(2,"swan");
		
		System.out.println(v);
		
		v.set(3, 400);
		
		System.out.println(v);
		
		System.out.println("--------use forloop----------");
		
		for(int i=0;i<=v.size()-1;i++) {
			
			System.out.println(v.get(i));
		}
		
		System.out.println("---------iterator--------");
		
		Iterator itr = v.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		System.out.println("--------list iterator-------");
		
		 ListIterator itr1 = v.listIterator();
		 
		 while(itr1.hasNext()) {
			 
			 System.out.println(itr1.next());
		 }
		 
		 System.out.println("---------Enumerator---------");
		Enumeration itr2 = v.elements();
		
		while(itr2.hasMoreElements()) {
			
			System.out.println(itr2.nextElement());
		}
	}
}
