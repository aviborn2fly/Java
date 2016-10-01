class numberClass{
	void sum(int a, int b){
		System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
	}
	void sum(int a, int b, int c){
		System.out.println("The sum of "+a+" , "+b+" and "+c+" is "+(a+b+c));
	}
}
class methodOverloading{
	public static void main(String args[]){
		numberClass nc = new numberClass();
		nc.sum(10,20);
		nc.sum(20,30,40);
	}
}