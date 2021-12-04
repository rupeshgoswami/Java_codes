package maxi;

import java.util.Random;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.json.JSONException;
import org.json.JSONObject;

//http://localhost:8080/RestFullServerProject/aakash/rhr/moblie
//http://localhost:8080/RestFullServerProject/aakash/rhr/userDetails

@Path("/rhr")
public class RequestHandlerRest {
	@POST
	@Path("/moblie")
	public String verifymobile(String mobile)
	{
		
		System.out.println("in server :"+mobile);
		if(mobile.length()==10)
		{
		   return genrateOTP();
		}
		return "invalid mobile";
		
	
	}
	public String genrateOTP()
	{
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<=9;i++)
		{
			sb.append(new Random().nextInt(10));
		
		}
		return " "+sb.substring(5);
	}
	
	//................................///
	@POST
	@Path("/userDetails")
	public String getUserDetails()
	{
		JSONObject j = new JSONObject();
		try {
			j.put("eid","Raja");
			j.put("name", "25");
			j.put("adrs","9934213287");
			return j.toString();
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}

}
