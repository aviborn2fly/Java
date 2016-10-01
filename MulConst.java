//MulConst.java
class Sathya
	{
		int a,b,c;
		Sathya(int x,int y,int z)
			{
				a=x;
				b=y;
				c=z;
				System.out.println("The value of a= "+a);
				System.out.println("The value of b= "+b);
				System.out.println("The value of c= "+c);

			}
		Sathya(Sathya x1,Sathya x2)
			{
				a=x1.a*x2.a;
				b=x1.b*x2.b;
				c=x1.c*x2.c;
				System.out.println("The value of a= "+a);
				System.out.println("The value of b= "+b);
				System.out.println("The value of c= "+c);

			}
		
	}

class MulConst
	{
		public static void main(String args[])
			{
				if(args.length!=6)
				{
					System.out.println("Plz enter 6 integers...");
				}
				else
				{
					System.out.println("The first object contains.");
					System.out.println("==========================================");
					
					Sathya s1=new Sathya(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
					System.out.println("==========================================");
					System.out.println("The second object contains.");
					System.out.println("==========================================");
					
					Sathya s2=new Sathya(Integer.parseInt(args[3]),Integer.parseInt(args[4]),Integer.parseInt(args[5]));
					System.out.println("==========================================");
					System.out.println("The Resultant object contains.");
					System.out.println("==========================================");
					Sathya s3=new Sathya(s1,s2);
					
				}
			}
	}
