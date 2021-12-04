package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import DTO.ChildDTO;
import DTO.FatherDTO;
import max.JDBCUtility;

public class ParentsDAO {
	
	public boolean insertParentsDetails(FatherDTO fatherDTO,List<ChildDTO> clist)
	{
		Connection con = JDBCUtility.getCon();
		try {
			con.setAutoCommit(false);
			int cd = JDBCUtility.getCID(con);
			int cdd = JDBCUtility.getCID(con);
			PreparedStatement ps = con.prepareStatement("insert into f_master values (?,?,?)");
			ps.setInt(1,  cdd);
			ps.setString(2, fatherDTO.getFname());
			ps.setString(3, fatherDTO.getAdd());
			
			int i = ps.executeUpdate();
			if(i!=0)
			{
				ps=con.prepareStatement("insert into c_master values (?,?,?,?) ");
				for(ChildDTO p:clist)
				{
				ps.setInt(1, ++cd);
				ps.setString(2,p.getCname());
				ps.setString(3,p.getGendr() );
				ps.setInt(4,cdd);
				ps.addBatch();
				}
				 int[] j=ps.executeBatch();
				 if(j.length!=0)
				 {
					 con.commit();
					 return true;
				 }
			}
			
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		e.printStackTrace();
	
			
		}
		
		return false;
		
	}

}
