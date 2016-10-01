class array{
public static void main(String args[]){
int arr[] = new int[5];
for(int x=0; x<arr.length; x++){
	arr[x]=x;
}
for (int element:arr){
	System.out.println(element);
}
}
}