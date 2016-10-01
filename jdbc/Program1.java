/**
* Program1.java
* This program creates a table : JDBCTABLE
* Columns: SID, SNAME, MARKS
* Driver: Type-1(JDBC_ODBC Bridge)
* Database: Oracle 11g
*/


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


class Program1
{
	public static void main(String[] args) throws Exception
	{
		//Step-1: Load driver class
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("Driver is loaded.");
		
		//Step-2: Open connection
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","scott","pass");
		System.out.println("Connection is opened.");
		
		//Step-3: Create statement object
		Statement stmt = con.createStatement();
		System.out.println("Statement object created.");
		
		//prepare command
		String cmd = "CREATE TABLE JDBCTABLE(SID NUMBER(5) PRIMARY KEY, SNAME VARCHAR2(20), MARKS NUMBER(5))";
		
		//Step-4: execute command
		int i = stmt.executeUpdate(cmd);
		
		//Step-5: Print result
		System.out.println("Table is created.");
		
		//Step-6: Close connection
		stmt.close();
		con.close();
		System.out.println("Connection is closed.");
		
		
	}
	

}