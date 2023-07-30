package Collection;

import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		
		System.out.println(t.size());
		System.out.println(t.isEmpty());
		
		t.add("ashok");
		t.add("hi hello");
		t.add("ashok");
		t.add("buy");
		t.add("vijay");
		
		System.out.println(t.size());
		System.out.println(t.isEmpty());
		
		System.out.println(t);
		
		System.out.println(t.first());
		System.out.println(t.last());
		
		
	
		
	
	}
}
