package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist2 {
	
	public static void main(String[] args) {
		ArrayList A = new ArrayList();
		
		System.out.println(A.size());
		
		System.out.println(A.isEmpty());
		
		
		A.add(12);
		A.add("Rushi");
		A.add('B');
		A.add(null);
		A.add(23.89);
		A.add("Rushi");
		
		System.out.println(A);
		
         System.out.println(A.size());
		
		System.out.println(A.isEmpty());
		
		
		
System.out.println("-----------other method-------------------");	

System.out.println(A.indexOf("Rushi"));

System.out.println(A.indexOf('B'));

System.out.println(A.get(5)); // only accept int value

System.out.println(A.lastIndexOf("Rushi"));

System.out.println(A.contains(23.89)); 

   A.add(3,"sachin");   // it is use to add new data in array
   System.out.println(A);
   
   A.set(3, "Ramesh");
   
   System.out.println(A); // it is use to replace data
   
   A.remove(4);
   
   System.out.println(A);
   
  // A.removeAll(A);
   
  // System.out.println(A);
		
   
   
   System.out.println("-----------Read data using forloop----------");
   
   for(int i=0;i<A.size()-1;i++) {
	   System.out.println(A.get(i)); // it is use to read all value at a time
   }
   
   System.out.println("--------------iterator cursor --------");
   
   Iterator itr = A.iterator();
   
   while(itr.hasNext()) {
	   System.out.println(itr.next());
   }
   
   System.out.println("--------------Listiterator cursor --------");
   ListIterator itr1 = A.listIterator();
   
   while (itr1.hasNext()) {
	   System.out.println(itr1.next());
   }
   
     Collections.reverse(A); // it is use to reverse all data 
     
     System.out.println(A);
     
     //Collections.sort(A);  
     
    // System.out.println(A);
     
     //A.clear();           it is use to remove all / clear all data
    // System.out.println(A);
   
	}
	
	
	
	
	
	

}
//   ""   ''