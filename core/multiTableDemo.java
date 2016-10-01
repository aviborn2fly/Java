//multiTableDemo.java
class multiTable
{
	int n;
	void set(int x)
	{
		n=x;
	}
	void multiply()
	{
		if(n<=0)
		{
			System.out.println(n+"is -ve, enter +ve value.");
		}
		else
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(n+" * "+i+" = "+(n*i));
			}
		}//else
	}//multiply()
}//multiTable()


class multiTableDemo
{
	public static void main(String[] args)
	{
		if(args.length!=1)
		{
			System.out.println("Plz enter one value.");
		}
		else
		{
			int x1=Integer.parseInt(args[0]);
			multiTable ob = new multiTable();
			ob.set(x1);
			ob.multiply();
		}
	}
}