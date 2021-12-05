package Utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtility {
	static Connection con;
	static
	{
		try {
			
			Class.forName("org.postgresql.Driver");
 con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/College1","postgres","awkash");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getCon()
	{
		return con;
		
	}

}
