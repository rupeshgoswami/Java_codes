package AssigTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Unique {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("D");
		list.add("D");
		list.add("C");
		list.add("H");
		list.add("Y");
		list.add("K");
		list.add("K");
		list.add("M");
		list.add("H");
		list.add("T");
		System.out.println("Total "+list);
		
		 Set<String> hs=new HashSet<String>();
		 hs.addAll(list);
		// List<String> l=new ArrayList<String>(hs);
		 //System.out.println(l);
		 for(String a:list)
		 {
			 if(hs.add(a)==false)
			 {
				 System.out.println("Duplicates :"+a);
			 }
		 }
		 
		 
		 
		
	}

}
