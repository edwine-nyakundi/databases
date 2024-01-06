// Java Program to Illustrate Setting Up of JDBC

// Importing SQL database
import java.sql.*;

// Main class to illustrate demo of JDBC
class GFG {

	// Main driver method
	public static void main(String[] args) throws Exception
	{

		// Loading and registering drivers
		// Optional from JDBC version 4.0
		Class.forName("oracle.jdbc.OracleDriver");

		// Step 2:Establishing a connection
		Connection con = DriverManager(
			"jdbc:oracle:thin:@localhost:1521:XE",
			"username", "password");

		// Step 3: Creating statement
		Statement st = con.createStatement();

		// Step 4: Executing the query and storing the
		// result
		ResultSet rs = st.executeQuery(
			"select * from Students where Marks >= 70");

		// Step 5: Processing the results
		while (rs.next()) {
			System.out.println(rs.getString("students"));
			System.out.println(rs.getInt("marks"));
		}

		// Step 6: Closing the connections
		// using close() method to release memory resources 
		con.close();
	
	// Display message for successful execution of program
	System.out.println("Steps in Setting Up of JDBC");
	}
}
