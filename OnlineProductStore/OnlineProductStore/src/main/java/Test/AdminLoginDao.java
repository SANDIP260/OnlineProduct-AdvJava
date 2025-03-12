package Test;
import java.sql.*;
public class AdminLoginDao 
{
  public AdminBean ab=null;
  public AdminBean Login(String un,String pw)
  {
	try
	{
		Connection con=DBConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from Admin67 where uname=? and pword=?");
		ps.setString(1, un);
		ps.setString(2,pw);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			ab=new AdminBean();
			ab.setUname(rs.getString(1));
			ab.setPword(rs.getString(2));
			ab.setFname(rs.getString(3));
			ab.setLname(rs.getString(4));
			ab.setCity(rs.getString(5));
			ab.setMid(rs.getString(6));
			ab.setPhno(rs.getLong(7));
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return ab;
  }
}
