import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Bean.ChildBean;
import Bean.FatherBean;
import Bo.ParentBO;
import Bo.ParentBOImpl;

public class CL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<ChildBean> list=new ArrayList<ChildBean>();
		System.out.println("----Enter Father Details------");
		FatherBean f = new FatherBean();
		System.out.println("Enter Father Name :");
		String n = sc.nextLine();
		f.setFname(n);
		System.out.println("Enter Address :");
		String add = sc.nextLine();
		f.setAdd(add);
		
		System.out.println("----Enter Child Details----");
		while(true)
		{
			ChildBean c = new ChildBean();
			System.out.println("Enter Child Name :");
			String cn = sc.nextLine();
			c.setCname(cn);
			System.out.println("Gender :");
			String gndr = sc.nextLine();
			c.setGendr(gndr);
			
			list.add(c);
			System.out.println("Y/N");
			String yn = sc.nextLine();
			if(yn.equalsIgnoreCase("N"))
			{
				break;
			}
			
		}
		f.setClist(list);
		
		 ParentBO  parentBO=new ParentBOImpl();
		 if(parentBO.getParentsDetails(f))
		 {
			 System.out.println("Succes");
		 }
		 else
		 {
			 System.out.println("Fail");
		 }
	}

}
