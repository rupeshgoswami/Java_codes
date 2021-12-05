package max.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import Utility.JDBCUtility;
import max.Bean.Child;
import max.DTO.FatherDTO;

public class ParentsDAO {

	
	public boolean insertParentDetails(FatherDTO fdto,List<Child> clist )
	{
		try {
		Connection con = JDBCUtility.getCon();
		PreparedStatement ps = con.prepareStatement("insert into father  values(?,?,?,?,?,?)");
		ps.setInt(1, fdto.getFid());
		ps.setString(2, fdto.getAppno());
		ps.setString(3,fdto.getName());
		ps.setString(4, fdto.getAadhar());
		ps.setString(5, fdto.getAdd());
		ps.setString(6, fdto.getName());
		
		int i = ps.executeUpdate();
		if(i>0)
		{
			ps=con.prepareStatement("insert into chile values(?,?,?,?,?)");
			for(Child p:clist)
			{
			//ps.setInt(1,p.getEid() );
			ps.setString(2,p.getName());
			ps.setString(3,p.getGndr());
            ps.setString(4, p.getAge());
          //  ps.setString(5,);
			}
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
