//Program5.java
//takes sql command from user and executes it
//driver: Type-4 (Oracle thin driver)
//database: Oracle 11g

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

class Program5
{
	public static void main(String[] args) throws Exception
	{
		//step-1
		
		//step-2
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","pass");
		
		//step-3
		Statement stmt = con.createStatement();
		
		//create scanner object
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the SQL command: ");
		String cmd = s.nextLine();
		
		//step-4,5 Execute command and display result.
		boolean flag = stmt.execute(cmd);
		
		if(flag==true)
		{
			ResultSet rs = stmt.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
				
			}
			rs.close();
		}
		else
		{
			int i=stmt.getUpdateCount();
			System.out.println(i+" row effected.");
		}
		
		//step-6
		stmt.close();
		con.close();
		
		
	}
	
}
