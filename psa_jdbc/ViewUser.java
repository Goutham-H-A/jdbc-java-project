package psa_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewUser {

	public static void main(String[] args) {
		System.err.println("USERS TABLE CONTENT:");
		try {
			Connection conn = DB_Connector.openConnection();
			Statement st = conn.createStatement();
			String getAllUserQuery = "SELECT * FROM USERS";
			ResultSet rs = st.executeQuery(getAllUserQuery);
			while(rs.next()) {
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("age"));
			}
			DB_Connector.closeConnection(conn);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
