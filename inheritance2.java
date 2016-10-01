class a1{
	int i=10;
	
}
class a2 extends a1{
	int i=30;
void print(){
	System.out.println("Before super: "+ i +" After super: "+ super.i);
}	
}
class inheritance2{
	public static void main(String args[]){
		a2 ob = new a2();
		ob.print();
	}
}