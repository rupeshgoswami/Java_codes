package SetEXample;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		Set<String> l = new LinkedHashSet<String>();
		l.add("Lion");
		l.add("Kite");
		l.add("Apple");
		l.add("Dog");
		l.add("Ball");
		l.add("Cat");
		l.add(null);
		l.add(null);
		
		l.add("Apple"); //jis format me hmlogo value input krenge usi format me milega
		
		System.out.println(l);
		 
		Iterator<String> it = l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
