package RemovDuplictInSet;

public class Emp {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int hashCode() {
		
		return 0;
	}
	public boolean equals(Object obj) {
		Emp e = (Emp)obj;
		
		return name.equals(e.getName());
	}
	

}
