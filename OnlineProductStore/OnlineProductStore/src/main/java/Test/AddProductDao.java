package Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddProductDao 
{
	 public int insertProduct(ProductBean pb)
	 {
		 int k=0;
		try
		{
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into product67 values(?,?,?,?)");
			ps.setString(1, pb.getCode());
			ps.setString(2, pb.getName());
			ps.setFloat(3, pb.getPrice());
			ps.setInt(4, pb.getQty());
			k=ps.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
	 }

}
