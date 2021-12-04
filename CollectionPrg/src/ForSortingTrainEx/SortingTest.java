package ForSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingTest {
  public static void main(String[] args) {
	

	List<String> list=new ArrayList<String>();
	
	list.add("raja");
	list.add("kaja");
	list.add("baja");
	list.add("jaja");
	System.out.println(list);
	
	for(String p:list)
	{
		System.out.println(p);
	}
	Collections.sort(list);
	System.out.println("-------------");
	for(String p:list)
	{
		System.out.println(p);
	}
	
	}

}