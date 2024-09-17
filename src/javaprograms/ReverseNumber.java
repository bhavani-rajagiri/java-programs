package javaprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number to reverse...");
		int num =  scan.nextInt();
		
		
		int rev=0;
		
		while(num!=0) 
		{
			int reminder=num%10;//reminder
			rev=rev*10+reminder;
			num=num/10; //
		}
		System.out.println("Reversed number is: " + rev);
	}

}
