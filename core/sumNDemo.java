//sumNDemo
class sumN
{
	int n;
	int s=0;
	void set(int x)
	{
		n=x;
	}
	void add()
	{
		if(n<=1)
		{
			System.out.println(n+" is -ve, enter +ve value.");
		}
		else
		{
			for(int i=1; i<=n; i++)
			{
				s=s+i;
			}
			System.out.println("The sum of natural number upto "+n+" is "+s);
		}//else
	}//add()
}//sumN

class sumNDemo
{
	public static void main(String[] args)
	{
		if(args.length!=1)
		{
			System.out.println("Please enter one value.");
		}
		else
		{
			int x1 = Integer.parseInt(args[0]);
			sumN ob = new sumN();
			ob.set(x1);
			ob.add();
		}//else
	}//main
}//sumNDemo

