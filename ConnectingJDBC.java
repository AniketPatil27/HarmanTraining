package day4.connection;
//import java.util.*;
import java.sql.*;
public class ConnectingJDBC {

	public static void main(String[] args) {
		Connection con=null;
		Statement smt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harmandb","root","root");
			smt=con.createStatement();
			String querry="create table manager(depid int,depname varchar(255),salary int, primary key(depid))";
		    int count=smt.executeUpdate(querry);
			
		    if(count==0) 
			{
				System.out.println("Table Created");
			}
			else
			{
				System.out.println("Table Not Created");
			}
		} catch (ClassNotFoundException except) {
			System.out.println("Class Name Error " + except.getMessage());
		} catch (SQLException except) {
			System.out.println("Connection Error " + except.getMessage());
		}
		
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("\nConnection Not Sucessfully Terminated");
			}
			System.out.println("\nConnection Sucessfully Terminated");
		}
	}

}
