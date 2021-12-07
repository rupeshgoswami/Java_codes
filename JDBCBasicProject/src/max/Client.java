package max;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Client {
	public static void main(String[] args) {
		 int id=3;
		 String name="Bikash"; String add="GopalGanj";
		 try {
			Connection mon = JDBCUtility.getCon();
                         PreparedStatement ps = mon.prepareStatement("insert into emp values(?,?,?)");
                         ps.setInt(1, id);
                         ps.setString(2,name);
                         ps.setString(3, add);
                         int i = ps.executeUpdate();
                         if(i!=0)
                        	 System.out.println( "Success inserted data");
                         else
                        	System.out.println( "data not inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
