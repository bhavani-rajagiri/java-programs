package exceptions;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number..");
		int a=sc.nextInt();
		System.out.println("Enter second number..");
		int b=sc.nextInt();
		
	//approach 1
		
	/*try {
		int c=a/b;
		System.out.println(c);
		} 
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}*/
	
		//approach 2
	
	/*try {
		int c=a/b;
		System.out.println(c);
		} 
		catch(Exception e)
		{
			
			System.out.println(e);
		}*/
		
		//approach 3
		
		try {
		int c=a/b;
		System.out.println(c);
		} 
		catch(Exception e)
		{
			
			System.out.println(e.getMessage());
		}
		
		
   } 
}