package javaprograms;

public class ArraysExamples {

	public static void main(String[] args) {
		
		int x[] = new int[5]; // declaration
		x[0]=100;
		x[1]=200;
		x[2]=300;
		x[3]=400;
		x[4]=500;
		
		
		// reading single data
		System.out.println(x[4]);
		
		//reading multiple or all data of an array from for loop
		
		for(int i=0; i< x.length; i++)
		{
			System.out.println(x[i]);
		}
		
		
		//reading data using foreach loop or enhanced loop
		
		for(int a: x)
		{
			System.out.println("For each loop : " + a);
		}
	}
	
	
}
