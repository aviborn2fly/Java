class box{
	double width, length, height;
	
	box(){
		System.out.println("Constructor has started.");
		width=2;
		length=3;
		height=10;
	}
	
	double volume(){
		return width*height*length;
	}
}

class constructor{
	public static void main(String args[]){
		
		System.out.println("Into the main class.");
		box ob = new box();
		double vol= ob.volume();
		System.out.println("The volume is = " + vol);
	}
	
}