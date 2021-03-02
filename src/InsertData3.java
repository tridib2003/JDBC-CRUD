/*
 * Author: @tridib
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertData3 {

	public static void main(String[] args)throws Exception {
		
		final String url = "jdbc:mysql://localhost:3306/testjdbc";
		final String uname = "root";
		final String pass = "passtridib123";
		
		int studentID = 5;
		String studentName = "Yuvraj";
		
		String query = "INSERT INTO student VALUES (?, ?)";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		PreparedStatement st = con.prepareStatement(query);
		
		st.setInt(1, studentID);
		st.setString(2, studentName);
		
		try {
			int count = st.executeUpdate();
			System.out.println(count + " row(s) affected");
		}
		catch (Exception exc) {
			System.out.println(exc);
		}
		
		st.close();
		con.close();
	}

}
