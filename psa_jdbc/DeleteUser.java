package psa_jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username to delete:");
		String name = sc.next();
		sc.close();
		try {
			Connection conn = DB_Connector.openConnection();
			Statement st = conn.createStatement();
			String deleteQuery = "DELETE FROM USERS WHERE NAME='"+name+"'";
			st.executeUpdate(deleteQuery);
			DB_Connector.closeConnection(conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("deleted item is "+name+"");

	}

}
