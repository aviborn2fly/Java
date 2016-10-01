class a1{
	int i,j;
	void set(int x,int y){
		i=x;
		j=y;
	}
}
class a2 extends a1{
	int total;
	void sum(){
		total=i+j;
	}
	
}
class inheritance{
	public static void main(String args[]){
		System.out.println("Sum using inheritance of classes.");
		a2 ob = new a2();
		ob.set(10,20);
		ob.sum();
		System.out.println("The sum of " + ob.i +" and "+ob.j+" = "+ob.total);
}
}