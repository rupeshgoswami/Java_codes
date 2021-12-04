package LinkedListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Apple");   //0 index
		list.add("Ball");    //1
		list.add("Cat");     //2
		list.add(0,"Ant");    //3
		list.add("Dog");      //4
		
		//System.out.println(list);
		
		list.addFirst("A for Apple");
		
		list.addLast("D for Dog");
		
		
		
		for(String l:list)
		{
			System.out.println(l);
		}
	}

}
