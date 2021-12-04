package maxi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtility {
	private JDBCUtility()
	{
		
	}
	private static Connection con;
	static
	{
		try {
			
			Class.forName("org.postgresql.Driver");
con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/7jdbc","postgres","9990401346");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getCon()
	{
		return con;
		
	}
//	public static int  getCID(Connection con)
//	{
//		try {
//			PreparedStatement ps = con.prepareStatement("select max(cid) as cd from c_master");
//			ResultSet rs = ps.executeQuery();
//			while(rs.next())
//			{
//		    int cid = rs.getInt("cd");
//		    return cid+1;
//		    
//				
//			}
//		
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return 0;
//	
//		
//	}

}
