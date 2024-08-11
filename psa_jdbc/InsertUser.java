package psa_jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = sc.next();
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		sc.close();
		try {
			Connection conn = DB_Connector.openConnection();
			String insertQuery = "INSERT INTO USERS VALUES('" + name + "','" + age + "')";
			Statement st = conn.createStatement();
			st.executeUpdate(insertQuery);
			DB_Connector.closeConnection(conn);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Succesfully Entered data: "+name+"  "+age+"");
	}

}
