package max;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewCL {
	public static void main (String[] args)
	{
		int id=1;
		try {
			Connection con = JDBCUtility.getCon();
			PreparedStatement ps = con.prepareStatement("select * from emp where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				int eid = rs.getInt(1);
				String n = rs.getString(2);
				String ad = rs.getString(3);
				System.out.println(eid+" "+n+" "+ad);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
