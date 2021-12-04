package SetEXample;

import java.util.*;

public class TreeSetTest {
	public static void main(String[] args) {
		
		TreeSet<String> l = new TreeSet<String>();
		l.add("A");
		l.add("H");
		l.add("B");
		l.add("G");
		l.add("C");
		
		System.out.println(l);
		//NavigableSet<String> t = l.descendingSet();   // for desensig order data in only Treset
		TreeSet<String> t = ((TreeSet<String>)l.descendingSet());
		System.out.println(t);
		
		Iterator<String> it = l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
