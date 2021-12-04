package maxi;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/state")
public class LocationRestService {
	@POST
	@Path("getData")
	public String getStateMaster()
	{
		LocationDAO locationDAO=new LocationDAO();
		String job = locationDAO.getStateList();
		return job;
	}
	

}
