package javaprograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter String.....");
		String name = scan.next();
		
		String rev = "";
		
		for(int i =name.length()-1; i>=0;i--)
		{
			rev=rev+name.charAt(i);
			}
          System.out.println(rev);
          
          if(rev.equals(name))
          {
        	  System.out.println(name + "-" +"String is Palindrome..");
          }
          else
        	  System.out.println(name +" - " +  "String is not a Palindrome..");
	}
	

}
