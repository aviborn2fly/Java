//Program3.java
//updates marks of jdbctable
//driver: Type-2(Oracle oci driver)
//database: Oracle 11g


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Program3
{
	public static void main(String[] args)throws Exception
	{
		//step-1
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//step-2
		Connection con = DriverManager.getConnection("jdbc:oracle:oci:@ORCL","system","pass");
		
		//step-3
		Statement stmt = con.createStatement();
		
		//prepare command
		String cmd = "UPDATE JDBCTABLE SET MARKS=850 WHERE SID=104";
		
		//step-4
		int i = stmt.executeUpdate(cmd);
		
		//step-5
		System.out.println(i+" row updated.");
		
		//step-6
		stmt.close();
		con.close();
		System.out.println("Connection closed.");
		
	}
	
}


