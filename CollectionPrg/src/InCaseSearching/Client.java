package InCaseSearching;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		 MultipleObject list = new MultipleObject();
		 ArrayList<Emp> p = list.allEmp();
		 
		 System.out.println("All Employee Data :");
		 for(Emp d:p)
		 {
			 System.out.println(d.getId()+" "+d.getName());
		 }
	}

}
