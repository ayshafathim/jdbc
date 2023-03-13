package UstBatch.jdbc_project;

	import java.sql.*;

	public class EmployeeTable {
	  public static void main(String[] args) {
	    // Set up database connection parameters
	    String url = "jdbc:mysql://localhost:3306/assignment2";
	    String username = "root";
	    String password = "pass@word1";

	    try {
	      // Create a connection to the database
	      Connection conn = DriverManager.getConnection(url, username, password);

	      // Create a statement object
	      Statement stmt = conn.createStatement();

	      // Execute the CREATE TABLE statement
	     /* String sql = "CREATE TABLE employee ("
	                 + "id INT NOT NULL AUTO_INCREMENT,"
	                 + "name VARCHAR(255),"
	                 + "age INT,"
	                 + "department VARCHAR(255),"
	                 + "PRIMARY KEY (id)"
	                 + ")"; */
	      
	     /* String sql ="insert into employee values(17,\"Aysha\",23,\"IT\"),"
	      		+ "(18,\"Anuja\",23,\"TESTING\"),"
	      		+ "(19,\"Meera\",23,\"HR\"),"
	      		+ "(11,\"Finla\",22,\"DEVELOPER\")";
	      stmt.executeUpdate(sql);  */

	      
	   
	      ResultSet rs=stmt.executeQuery("select * from employee"); 
	      while(rs.next())  
	    	  System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));  
	      
	      // Close the statement and connection objects
	      stmt.close();
	      conn.close();
	      
	      //System.out.println("Employee table created successfully!");
	     // System.out.println("Employee table value initiated successfully!");

	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	  }
	}




