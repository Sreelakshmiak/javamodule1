package Exception;
import java.sql.*;
public class ExceptionDemo4 {
	static void method() throws SQLException
	{
		throw new SQLException("CONNECTION FAILED...");
	}

	public static void main(String[] args) throws SQLException {
		
		
		
		method();
		
		
		
		
		
//		
//		try {
//			method();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		
//		}
		
	}

}
