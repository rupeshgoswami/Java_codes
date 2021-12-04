package ForSortingTrainEx;

import java.util.ArrayList;
import java.util.List;

public class TrainMaster {
	List<Train> l=new ArrayList<Train>();
	public List<Train> getData()
	{
		Train t = new Train();
		t.setTime(4);
		t.setTrainName("AwdhAasam Exp");
		t.setDistance(750);
		l.add(t);
		
		Train t1 = new Train();
		t1.setTime(2);
		t1.setTrainName("GomtiNagar Exp");
		t1.setDistance(1150);
		l.add(t1);
		
		Train t2 = new Train();
		t2.setTime(3);
		t2.setTrainName("Bhag Exp");
		t2.setDistance(850);
		l.add(t2);
		return l;
	}

}
