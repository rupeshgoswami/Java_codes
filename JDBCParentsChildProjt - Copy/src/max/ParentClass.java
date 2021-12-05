package max;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import max.BO.ParentsBO;
import max.Bean.Child;
import max.Bean.Father;

public class ParentClass {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Father f = new Father();
		List<Child> l=new ArrayList<Child>();
		System.out.println("Enter Father Name :");
		f.setName(sc.nextLine());
		System.out.println("Enter Father AadharNo. :");
		f.setAadhar(sc.nextLine());
		System.out.println("Enter Father Address :");
		f.setAdd(sc.nextLine());
		
		System.out.println("Child details ");
		while(true)
		{
			 Child c = new Child();
			 System.out.println("Enter 1st child Name :");
			 c.setName(sc.nextLine());
			 System.out.println("Enter child Gender :");
			c.setGndr(sc.nextLine());
			System.out.println("Enter child age");
			c.setAge(sc.nextLine());
			
			System.out.println("DO U want more child Y/N :");
			String yn = sc.nextLine();
			l.add(c);
			if(yn.equalsIgnoreCase("N"))
			{
				break;
			}
			}
		ParentsBO parentsBO=new ParentsBO();
		parentsBO.getParentData(f, l);
		
		

	}

}
