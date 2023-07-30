package Collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vcollection {
		public static void main(String[] args) {
			Vector V = new Vector();
			
			System.out.println(V.size());
			System.out.println(V.isEmpty());
			
			V.add("Raksha");
			V.add(12.78);
			V.add('H');
			V.add(89);
			V.add("Raksha");
			V.add(12.78);
			V.add('H');
			V.add(89);
			V.add(null);
			V.add("Diksha");
			V.add(39.98);
			
			System.out.println(V);
			
			System.out.println(V.size());
			System.out.println(V.isEmpty());
			
			System.out.println(V.capacity()); // to check Array capacity
			
			System.out.println(V.indexOf(null));
			
			System.out.println(V.lastIndexOf('H'));
			
			System.out.println(V.get(0));
			
			System.out.println(V.contains("Raksha"));
			
			V.add(2,21.78);
			
			V.set(3, 888);
			
			V.remove(1);
			
			//V.removeAll(V);
			
			System.out.println(V);
			
			System.out.println("----------------for loop---------------");
			
			for(int i=0;i<V.size()-1;i++) {
				System.out.println(V.get(i));
			}
			System.out.println("----------------Iterator---------------");
			
			Iterator itr = V.iterator();
		while(itr.hasNext())	{
			System.out.println(itr.next());
		}
		
		System.out.println("----------------ListIterator---------------");
			
			ListIterator itr1  = V.listIterator();
			
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			System.out.println("----------------enumeration---------------");
			
			Enumeration E = V.elements();
			
			while(E.hasMoreElements()) {
				System.out.println(E.nextElement());
			}
			
			Collections.reverse(V);
			System.out.println(V);
			
			//Collections .sort(V);
			//System.out.println(V);
			
			V.clear();
			System.out.println();
			
		}


}
// ""  ''