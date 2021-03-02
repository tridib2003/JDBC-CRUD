/*
 * Author: @tridib
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertData {
	
	// Database URL, username and password
	static final String url = "jdbc:mysql://localhost:3306/testjdbc";
	static final String uname = "root";
	static final String pass = "passtridib123";

	public static void main(String[] args)throws Exception {
		
		// Register JDBC Driver
		Class.forName("com.mysql.jdbc.Driver");
		
		// Open the connection to MySQL database
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		// Create the statement
		Statement st = con.createStatement();
		
		// Query to insert records into the table
		String query = "INSERT INTO student VALUES (1, 'Sourav'), (2, 'Sachin'), (3, 'Rahul')";

		try {
			// Execute query
			int count = st.executeUpdate(query);
			
			// Display no. of rows affected
			System.out.println(count + " row(s) affected");
		}
		catch (Exception exc) {
			System.out.println(exc);
		}
		
		// Close the connection
		st.close();
		con.close();
	}

}
