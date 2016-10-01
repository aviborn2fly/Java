//IntfProg1.java
import java.util.Scanner;
interface AOP
{
	interface Sum  //nested interface
	{
		void add();
	}
	interface Sub	//nested interface
	{
		void sub();
	}
}

class IntSum implements AOP.Sum		//implementation of nested interface.
{
	int a,b;
	public void add()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("Please enter 2 values:");
		a=Integer.parseInt(s1.nextLine());
		b=Integer.parseInt(s1.nextLine());
		System.out.println("Sum of the numbers is= "+(a+b));
		System.out.println("==================================================");
		
	}
	
}
class IntSub implements AOP.Sub			//implementation of nested interface.
{
	int a,b;
	public void sub()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("Please enter 2 values:");
		a=Integer.parseInt(s1.nextLine());
		b=Integer.parseInt(s1.nextLine());
		System.out.println("Difference of the numbers is= "+(a-b));
		System.out.println("==================================================");
	}
}
class IntfProg1 
{
	public static void main(String args[])
	{
		System.out.println("==================================================");
		System.out.println("w.r.t. AOP.Sum-IN-DOC-IntSum-Dynamic binding.");
		AOP.Sum s1=new IntSum();		//In direct object creation.
		s1.add();
		System.out.println("w.r.t. AOP.Sub-IN-DOC-IntSub-Dynamic binding.");
		AOP.Sub s2=new IntSub();		//In direct object creation.
		s2.sub();
		
	}
}