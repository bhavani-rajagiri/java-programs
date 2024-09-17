package javaprograms;

import java.util.Scanner;

public class PositiveOrNegetiveNumber {

	public static void main(String[] args) {
		
		//int num = -3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number from keyboard.....");
		int num=scan.nextInt();
		
		
		if(num>0)
		{
			System.out.println("Number is Positive");
		}
		else
		{
			System.out.println("Number is Negetive");
		}

	}

}
