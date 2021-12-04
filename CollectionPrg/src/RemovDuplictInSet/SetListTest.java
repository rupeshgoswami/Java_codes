package RemovDuplictInSet;

import java.util.*;

public class SetListTest {
	public static void main(String[] args) {
		
		List<String> l=new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("D");
		l.add("C");
		l.add("A");
		System.out.println(l);
		
		Set<String> list = new HashSet<String>(l);
		System.out.println(list);
		list.remove("A");
		System.out.println(list);
		System.out.println(list.containsAll(list));
		
		
		
		
		
	}

}
