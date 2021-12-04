package SearchingMutltiObjts;

import java.awt.List;
import java.util.ArrayList;

public class MultipleObject {
	
	ArrayList<Object>  l=new ArrayList<Object>();
	public ArrayList<Object> allEmp()
	{
		
		FacaltyClass f = new FacaltyClass();
		f.setId(9);
		f.setPhone("9006559867");
		l.add(f);
		
		
		Emp e=new Emp();
		e.setId(10);
		e.setName("Awkash");
		l.add(e);
		
		Emp e1=new Emp();
		e1.setId(11);
		e1.setName("Prakash");
		l.add(e1);
		
		Emp e2=new Emp();
		e2.setId(12);
		e2.setName("Bikash");
		l.add(e2);
		
		Emp e3=new Emp();
		e3.setId(13);
		e3.setName("Ujjwal");
		l.add(e3);
		return l;
		
		
	}

}
