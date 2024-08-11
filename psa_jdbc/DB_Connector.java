package psa_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
public class DB_Connector {
	public static Connection openConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/test_db";
		String username= "root";
		String password = "root";
		try {
			con = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void closeConnection(Connection con) {
		try {
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
