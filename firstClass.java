class object{
	int a=10;
	int b=20;
	int sum;
	int sub=b-a;
}

class firstClass{
	public static void main(String args[]){
		object nc = new object();
		System.out.println("a = "+ nc.a);
		System.out.println("b = "+ nc.b);
		nc.sum = nc.a + nc.b;
		System.out.println("sum of a and b = "+ nc.sum);
		System.out.println("subtraction = "+ nc.sub);
		
	}
	
}