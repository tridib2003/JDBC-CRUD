/*
 * Author: @tridib
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertData2 {

	public static void main(String[] args)throws Exception {
		
		final String url = "jdbc:mysql://localhost:3306/testjdbc";
		final String uname = "root";
		final String pass = "passtridib123";
		
		int studentID = 4;
		String studentName = "Sehwag";
		
		String query = "INSERT INTO student VALUES (" + studentID + ",'" + studentName + "')";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		Statement st = con.createStatement();
		
		try {
			int count = st.executeUpdate(query);
			System.out.println(count + " row(s) affected");
		}
		catch (Exception exc) {
			System.out.println(exc);
		}
		
		st.close();
		con.close();
	}

}
