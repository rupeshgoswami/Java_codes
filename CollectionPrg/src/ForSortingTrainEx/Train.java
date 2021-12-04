package ForSortingTrainEx;

public class Train implements Comparable<Train>
{
     int time;
     String trainName;
     int distance;
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public int compareTo(Train t) {
		if(time==t.getTime())
		{
			return 0; 
		}
		else if(time>t.getTime())
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
	
     
}
