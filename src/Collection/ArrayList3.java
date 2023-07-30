package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList3 {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.isEmpty());
		
		System.out.println(ar.size());
		
		
		
		ar.add("hi hello");
		ar.add(123);
		ar.add('A');
		ar.add(12.32f);
		ar.add(null);
		ar.add(null);
		ar.add("hi hello");
		
		System.out.println(ar.isEmpty());
		
		System.out.println(ar.size());
		
		System.out.println(ar);
		
		System.out.println(ar.indexOf('A'));
		
		System.out.println(ar.indexOf("hi hello"));
		
		System.out.println(ar.lastIndexOf("hi hello"));
		
		System.out.println(ar.get(6));
		
		System.out.println(ar.contains("hi hello"));
		
		ar.add(3,"rushi");
		System.out.println(ar);
		
		ar.set(3, "raja");
		
		System.out.println(ar);
		
		ar.remove(3);
		
		Collections.reverse(ar);
		
		System.out.println(ar);
		
//		Collections.sort(ar);
		
		System.out.println(ar);
		
	
		
		
		
		System.out.println("-------------Read data using  for loop ------------");
		
		for(int i=0;i<=ar.size()-1;i++) {
			
			System.out.println(ar.get(i));
		}
		
		System.out.println("----------use iterator---------");
		
		 Iterator itr1 = ar.iterator();
		 
		 while(itr1.hasNext()) {
			 
			 System.out.println(itr1.next());
		 }
		 
		 System.out.println("----------use list iterator--------");
		 
		ListIterator itr2 = ar.listIterator();
		
		while(itr2.hasNext()) {
			
			System.out.println(itr2.next());
		}
		
		
	}
}
//"" ''