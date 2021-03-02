/*
 * Author: @tridib
 */

// Import required packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadData {
	
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
			
			// Query
			String query = "select * from student";
			
			// Execute query 
			ResultSet rs = st.executeQuery(query);
			
			System.out.println("Roll No.     Name");
			
			// Display data from ResultSet
			while (rs.next()) {
		
//				int rollno = rs.getInt(1);
				int rollno = rs.getInt("studentID");
					
//				String name = rs.getString(2);
				String name = rs.getString("studentName");
					
				System.out.println("    " + rollno + "        " + name);
			}	
		
			// Close the connection
			st.close();
			con.close();
		
			}
			catch(Exception exc) {
				exc.printStackTrace();
			}
		
	}
}
