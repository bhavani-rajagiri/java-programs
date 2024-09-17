package javaprograms;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		try (Scanner scan1 = new Scanner(System.in)) {
			System.out.println("Enter first number ...");
			
			int x=scan1.nextInt();
			
			try (Scanner scan2 = new Scanner(System.in)) {
				System.out.println("Enter second number ...");
				int y=scan2.nextInt();
				
				try (Scanner scan3 = new Scanner(System.in)) {
					System.out.println("Enter third number ...");
					int z=scan3.nextInt();
					
					
					if((x>y) && (x>z)) {
						System.out.println("x is greater number ..."+ x);
						
					}

					else if((y>x) && (y>z)) {
						System.out.println("y is greater number ..."+ y);
						
					}
					else {
						System.out.println("z is greater number ..."+ z);
					}
				}
			}
		}
		

	}

}
