package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleDBConnection {
	static final String DB_URl="jdbc:mysql://localhost:3306/db";//db-Schema name
	static final String USER="root";
	static final String PASS="@Nithish003";
	static Connection conn=null;
	//fetch the data
	static final String query="select * from employeeinfo";
	
	
	public static void main (String[] args) {
		//Open a Connection
		try
		{
			//1.Connection to DB
			conn=DriverManager.getConnection(DB_URl, USER, PASS);
		
			//2.Create a statement(conn)
			Statement stmt=conn.createStatement();
			
			//3.Execute a Query
			ResultSet rs=stmt.executeQuery(query);
			
			System.out.println("The employee details fetched from MySQL DB: ");
			
			while (rs.next())
			{
				//displaying the values
				System.out.println("Emp_ID: "+rs.getInt("EmpID"));
				System.out.println("Emp_Name: "+rs.getString("EmpName"));
				System.out.println("Age: "+rs.getInt("Age"));
				System.out.println("Emp_Gender: "+rs.getString("EmpGender"));
				System.out.println("Salary: "+rs.getInt("Salary"));
				System.out.println("-------------------------------------");
			}
			rs.close();
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
	}
}