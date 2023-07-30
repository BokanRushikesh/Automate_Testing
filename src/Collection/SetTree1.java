package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTree1 {
	public static void main(String[] args) {
		
		TreeSet T = new TreeSet(); // it is a homogeneous class 
		
		System.out.println(T.size());
		System.out.println(T.isEmpty());
		
		T.add(100);
		T.add(210);
		T.add(890);
		T.add(789);

		
		System.out.println(T.size());
		System.out.println(T.isEmpty());
		
		System.out.println(T);
		
		System.out.println(T.contains(890));
		
		System.out.println(T.descendingSet());
		
//		System.out.println(T.pollFirst());
		
//		System.out.println(T.pollLast());
		
		System.out.println(T.first());
		
		System.out.println(T.last());
		

		
		System.out.println("----------iterator------------");
		Iterator itr = T.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
		}
		
		
		
	}
	}


