package RemovDuplictInSet;

import java.util.*;

public class EmpTest {
	
	public static Set<Emp> getEmp()
	{
	Set<Emp> l=new HashSet<Emp>();
	Emp e=new Emp();
	e.setId(10);
	e.setName("Awkash");
	l.add(e);
	

	
	Emp e3=new Emp();
	e3.setId(14);
	e3.setName("Bikash");
	l.add(e3);
	
	Emp e1=new Emp();
	e1.setId(10);
	e1.setName("Awkash");
	l.add(e1);
	
	Emp e2=new Emp();
	e2.setId(12);
	e2.setName("Prakash");
	l.add(e2);
	
	return l;
	
	
	
	
	
	
	
	
	}

}
