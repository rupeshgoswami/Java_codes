package SetEXample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		Set<String> l=new HashSet<String>();
		l.add("M");
		l.add("Apple");
		l.add("p");
		l.add("Z");
		l.add("A");  //hasing algo hashcode 10
		l.add("B");   // 11 compare with first
		l.add("A"); // 10
		l.add(null); 
		l.add("D");
		l.add("E");
		l.add("C");
		//l.add(null);
		
		System.out.println(l);
		
		Iterator<String> it = l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
