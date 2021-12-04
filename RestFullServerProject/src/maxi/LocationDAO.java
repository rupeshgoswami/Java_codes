package maxi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.json.JSONArray;
import org.json.JSONObject;

public class LocationDAO {
	
	public String getStateList()
	{
		 JSONArray ja = new JSONArray();
		try {
			Connection con = JDBCUtility.getCon();
			PreparedStatement ps = con.prepareStatement("select * from emp");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				JSONObject j = new JSONObject();
				j.put("eid", rs.getString(1));
				j.put("name",rs.getString(2));
				j.put("adrs",rs.getString(3));
				ja.put(j);
			}
			return ja.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
