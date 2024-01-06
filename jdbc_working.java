// Java Program to Illustrate Working Of JDBC
// with Above Query in Database

// Importing required classes
import java.io.*;
import java.util.*;

// Main class
// JDBC demo class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Declaring and initializing arguments that
		// needed to be passed later in getConnection()
		String url = "jdbc:mysql://localhost/test";
		String uname = "root";
		String pass = "";

		// Query from the database taken
		// Custom query taken to illustrate
		String query
			= "select username from Student where id=7";

		// Loading and registering drivers
		Class.forName("com.mysqljdbc.Driver");

		// Creating an connection object by
		// getConnection() method which is static method and
		// returns the instance of Connection class

		// This method takes 3 parameters as defined above
		Connection con
			= DriverManager.getConnection(url, uname, pass);

		Statement st = con.createStatement();

		// It returns a tabular structure so we need
		// ResultSet as it stores chunk of data into
		// structures
		ResultSet rs = st.executeQuery(query);

		// Now we are having our data in object of ResultSet
		// which is no more tabular

		// Note:
		// Fetching the above data by storing it as a String
		// Here pointer is lagging with data for which we
		// use next() method to
		// take it to next record
		rs.next();

		// Here we are fetching username column data
		String name = rs.getString("username");

		// Lastly print the data
		System.out.println(name);

		// It is good practice to close the connection
		// using close() method

		// Closing the statement first
		st.close();
	
		// Now close the connection also
		con.close();
	}
}
