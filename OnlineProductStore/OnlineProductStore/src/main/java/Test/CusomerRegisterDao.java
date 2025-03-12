package Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CusomerRegisterDao
{
	public int customerdao(CustomerUserBean cub)
	{
		int k=0;
		try
		{
	Connection con = DBConnection.getConnection();
	PreparedStatement ps = con.prepareStatement("insert into customer70 values(?,?,?,?)");
	ps.setLong(1,cub.getPhno());
	ps.setString(2,cub.getName());
	ps.setString(3, cub.getCity());
	ps.setString(4, cub.getMid());
	k = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
	}
}
