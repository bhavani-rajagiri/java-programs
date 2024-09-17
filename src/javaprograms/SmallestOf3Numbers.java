package javaprograms;

public class SmallestOf3Numbers {

	public static void main(String[] args) {
		
		int a=10,b=-20,c=30;
		
		if((a<b) && (a<c)) 
		{
			System.out.println("Smallest number is: "+ a);
		}
		else if((b<a) && (b<c)) 
		{
			System.out.println("Smallest number is: "+ b);
		}
		else {
			System.out.println("Smallest number is: "+ c);
		}

	}

}
