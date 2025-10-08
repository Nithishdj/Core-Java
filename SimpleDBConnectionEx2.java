package db_connection;

//import required packages
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public class SimpleDBConnectionEx2 {
	static final String DB_URL = "jdbc:mysql://localhost:3306/dbhai";//dbhai -> schema
	static final String USER = "root";
	static final String PASS = "@Nithish003";
	static Connection conn = null;//make connection null initially
	static final String query = "select * from student";
	
	public static void main(String[] args) {
		
		System.out.println("The data retrieved from studednt database");
		try {
			//1.create connection
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			//create statement using connection
			Statement stmt = conn.createStatement();
			
			//Executing the sql query and stored the returned data in ResultSet
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("Stu_Id: "+rs.getInt("student_id"));
				System.out.println("Name: "+rs.getString("name"));
				System.out.println("Age: "+rs.getInt("age"));
				System.out.println("Email: "+rs.getString("email"));
			}
			rs.close();//closing ResultSet after while loop
	}
		catch(SQLException ex) {
			System.out.println(ex);
		}
}
}
