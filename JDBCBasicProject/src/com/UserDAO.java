package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
	
	public boolean insertData(int id,String name,String add)
	{
		Connection con = JDBCUtility.getCon();
	                try {
	PreparedStatement ps = con.prepareStatement("insert into emp values (?,?,?)");
	                     ps.setInt(1, id);
	                     ps.setString(2,name);
	                     ps.setString(3,add);
	                   int i = ps.executeUpdate();
	                   if(i!=0)
	                   {
	                	  return true;
	                   }
	                   
	
					} catch (SQLException e) {
						e.printStackTrace();
					}
					return false;
	}

}
