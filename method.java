class numberClass{
	void sum(int a, int b){
		System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
	}
}
class method{
	public static void main(String args[]){
		numberClass nc = new numberClass();
		nc.sum(10,20);
		nc.sum(30,40);
	}
}