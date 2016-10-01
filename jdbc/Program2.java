/** 
*Program2.java
*This program inserts a row into table student
*Driver: Type-1(JDBC-ODBC Bridge)
*Database: Oracle 11g
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

class Program2
{
	public static void main(String[] args)throws Exception
	{
		//step-1
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("Driver class loaded.");
		
		//step-2
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","pass");
		System.out.println("Connection created.");
		
		//step-3
		Statement stmt=con.createStatement();
		System.out.println("Statement object created.");
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter SNO.:");
		int SID = s.nextInt();
		System.out.println("Enter Student Name:");
		String SNAME = s.next();
		System.out.println("Enter marks:");
		int MARKS = s.nextInt();
		System.out.println("Input command taken.");
		
		String cmd = "INSERT INTO JDBCTABLE values("+SID+", '"+SNAME+"' ,  "+MARKS+");";
		
		
		//step-4
		int i=stmt.executeUpdate(cmd);
		
		
		//step-5
		System.out.println(i+" row inserted.");
		
		//step-6
		stmt.close();
		con.close();
		System.out.println("Connection is closed.");
		
	}//main
}//Program2

