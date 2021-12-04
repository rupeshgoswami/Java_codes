package SearchingMutltiObjts;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		 MultipleObject list = new MultipleObject();
		 ArrayList<Object> p = list.allEmp();
		 
		 for(Object d:p)
		 {
			 if(d instanceof Emp)
			 {
				Emp e = (Emp)d;
				System.out.println(e.getId()+" "+e.getName());
			 }
			 else if(d instanceof FacaltyClass)
			 {
				FacaltyClass f = (FacaltyClass)d;
				System.out.println(f.getId()+" "+f.getPhone());
			 }
			 
		 }
	}

}
