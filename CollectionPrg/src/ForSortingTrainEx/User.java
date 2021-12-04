package ForSortingTrainEx;

import java.util.Collections;
import java.util.List;

public class User {
	public static void main(String[] args) {
		TrainMaster tm = new TrainMaster();
		  List<Train> ar = tm.getData();
		  
		  for(Train p:ar)
		  {
			  System.out.println(p.getTime()+" "+p.getTrainName()+" "+p.getDistance());
		  }
		  System.out.println();
		  System.out.println("After Sorting data in Accending Order \n");
		  
		  Collections.sort(ar);
		  for(Train p:ar)
		  {
			  System.out.println(p.getTime()+" "+p.getTrainName()+" "+p.getDistance());
		  }
		  
		  
		  
		  
	}

}
