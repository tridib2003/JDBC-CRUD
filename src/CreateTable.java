/*
 * Author: @tridib
 */

// Import required packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateTable {
	
	// Database URL, username and password
	static final String url = "jdbc:mysql://localhost:3306/testjdbc";
	static final String uname = "root";
	static final String pass = "passtridib123";

	public static void main(String[] args)throws Exception {
		
		try {
		
			// Register JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");
		
			// Open the connection to MySQL database
			Connection con = DriverManager.getConnection(url, uname, pass);
			
			// Create the statement
			Statement st = con.createStatement();
			
			// Query to create the table
			String query = "CREATE TABLE `student` " +
					"(studentID int(11) NOT NULL, " +
					"studentName varchar(200) NOT NULL, " +
					"PRIMARY KEY (studentID))";
			
			// Execute query 
			st.executeUpdate(query);
			
			System.out.println("Table created");
			
			// Close the connection
			st.close();
			con.close();
		
			}
			catch(Exception exc) {
				exc.printStackTrace();
			}
		
	}
}
