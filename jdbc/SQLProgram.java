//SQLProgram.java
//takes sql command from user and executes it
//driver: Type-4 (Oracle thin driver)
//database: Oracle 11g

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

class SQLProgram
{
	public static void main(String[] args) throws Exception {
		
		//step-1
		
		//create scanner object
		Scanner s1= new Scanner(System.in);
		System.out.print("Enter the system id:");
		String sid= s1.nextLine();
		
		String url="jdbc:oracle:thin:@localhost:1521:"+sid;
		
		System.out.print("Enter the username:");
		String user= s1.nextLine();
		
		
		System.out.print("Enter password:");
		String pwd=s1.nextLine();
		
		//step-2: 
		Connection con = DriverManager.getConnection(url,user,pwd);
		
	
		//step-3
		Statement stmt = con.createStatement();
		
		System.out.println("=====================================");
		System.out.println("Connected to:");
		System.out.println("Oracle Database.");
		System.out.println("=====================================");
		
		String cmd="garbage";
		
	
		
		while(cmd!="quit")
		{
		//create scanner object
	
		System.out.print("SQL> ");
		cmd = s1.nextLine();
		
		if(cmd!="exit"){
			
		System.out.println("=====================================");
		
		//step-4,5 Execute command and display result.
		boolean flag = stmt.execute(cmd);
		
		if(flag==true)
		{
			ResultSet rs = stmt.getResultSet();
			while(rs.next())
			{
				System.out.println(" | "+rs.getString(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | ");
				
			}
			rs.close();
		}
		else
		{
			int i=stmt.getUpdateCount();
			System.out.println(i+" row effected.");
		
		}
		}
		else{
			System.out.println("Exiting....");
			break;
		}
		}
		
		//step-6
		stmt.close();
		con.close();
		
		
	}
	
}
