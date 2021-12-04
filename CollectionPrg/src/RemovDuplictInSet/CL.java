package RemovDuplictInSet;

import java.util.Set;

public class CL {
	public static void main(String[] args) {
		Set<Emp> t = EmpTest.getEmp();
		
		for(Emp p:t)
		{
			//System.out.println(p.hashCode());
			System.out.println(p.getId()+" "+p.getName());
			
		}
	}

}
