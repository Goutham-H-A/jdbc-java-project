package psa_jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username to edit age:");
		String name = sc.next();
		System.err.println("Enter New Age:");
		int age = sc.nextInt();
		sc.close();
		try {
			Connection conn = DB_Connector.openConnection();
			Statement st = conn.createStatement();
			String updateQuery = "UPDATE USERS SET AGE='"+age+"' WHERE NAME='"+name+"'";
			st.executeUpdate(updateQuery);
			DB_Connector.closeConnection(conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
