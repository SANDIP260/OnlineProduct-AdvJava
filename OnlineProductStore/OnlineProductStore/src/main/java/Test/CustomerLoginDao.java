package Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerLoginDao
{
	CustomerUserBean cub=null;
	public CustomerUserBean customerDao(long phno,String name)
	{
	try
	{
	   Connection con=DBConnection.getConnection();
	  PreparedStatement ps=con.prepareStatement("select * from customer70 where phno=? and name=?");
	  ps.setLong(1,phno);
		 ps.setString(2, name);
		 ResultSet rs=ps.executeQuery();
		 if(rs.next())
		 {
			 cub=new CustomerUserBean();
			 cub.setPhno(rs.getLong(1));
			 cub.setName(rs.getString(2));
			 cub.setMid(rs.getString(4));
			 cub.setCity(rs.getString(3));
		 }
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return cub;
	}
}
