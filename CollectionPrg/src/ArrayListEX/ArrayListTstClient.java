package ArrayListEX;

import java.util.Iterator;
import java.util.List;

public class ArrayListTstClient {
	public static void main(String[] args) {
		ArrayListTest l = new ArrayListTest();
		List<String> n = l.getData();
		
		System.out.println(n);
		System.out.println("Total size "+n.size());
	
		System.out.println("***Fatch vlaue by for loop***");
		for(int i=0;i<n.size();)
		{
			System.out.println(n.get(i));
			//n.remove(i); for lop se value remove krne pr shifting hoti
			i++;                       //so remove nii kr skte
		}
		
		System.out.println("after"+n.size());
		
		System.out.println("**Fatch by for each**");
		for(String q:n)
		{
			System.out.println(q);
		}
		
		
		System.out.println("**Fatch by Iterator**");
		Iterator<String> it = n.iterator();
		while(it.hasNext())
		{
			String p = it.next();
			System.out.println(p);
			//it.remove( );--------iterator se value remove kr skte h
			//System.out.println(it.next());
		}
		System.out.println("after"+n.size());
	
	}

}
