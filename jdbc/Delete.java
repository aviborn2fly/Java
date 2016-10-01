//Delete.java
//deletes a record from student
//driver: Type-4 (Oracle thin driver)
//database: Oracle 11g


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

class Delete
{
	public static void main(String[] args) throws Exception
	{
		//step-1
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//step-2
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
		
		//step-3
		Statement stmt = con.createStatement();
		
		//create scanner object
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student id: ");
		int sid=s.nextInt();
		
		//prepare command
		String cmd = "DELETE FROM STUDENT WHERE SID="+sid;
		
		//step-4
		int i= stmt.executeUpdate(cmd);
		
		//step-5
		System.out.println(i+" row deleted.");
		
		//step-6
		stmt.close();
		con.close();
		
		
	}
}