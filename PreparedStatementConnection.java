
package db_connection;

//import required packages
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementConnection {
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
			
			//2.create statement using connection
			Statement stmt = conn.createStatement();
			
			String sql = "update student set name= ?, age= ?, email= ? where student_id = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "Nishanth");//update name
			
			pstmt.setInt(2, 13);//update age
			
			pstmt.setString(3, "nishanth@example.com");//update mail
			
			pstmt.setInt(4, 1);//student id
			int rs1=pstmt.executeUpdate();//dml-executeUpdate()
			if(rs1>0)
				System.out.println("row is updated");
			else
				System.out.println("row is not updated");
			//3.Executing the sql query and stored the returned data in ResultSet
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("Stu_Id: "+rs.getInt("student_id"));
				System.out.println("Name: "+rs.getString("name"));
				System.out.println("Age: "+rs.getInt("age"));
				System.out.println("Email: "+rs.getString("email"));
				System.out.println("--------------------------------");
			}
			rs.close();//closing ResultSet after while loop
	}
		catch(SQLException ex) {
			System.out.println(ex);
		}
}
}

