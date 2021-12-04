package max;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Utility.JdbcUtility;


public class BankDao {
	
	public String getBankAddByIFSC(String ifsc)
	{
		try {
			
			 Connection con = JdbcUtility.getconn();
			 PreparedStatement ps = con.prepareStatement(" select add from bank_master where ifsc=?");
			 ps.setString(1 ,ifsc);
               ResultSet rs = ps.executeQuery();	
               while(rs.next())
               {
            	   String ad = rs.getString("add");
            	  
            	   
            		   return ad;
            	            }
               
               
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
