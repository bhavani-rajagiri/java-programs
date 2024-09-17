 package javaprograms;

public class NumberPalindrome {

	public static void main(String[] args) {
		
		
		int num = 121;
		int rev=0;
		int temp=num;
		
		
		while(num!=0)
		{
		int reminder=num%10;
		rev=rev*10+reminder;
		num=num/10;
		}
		
		System.out.println("Reversed number is: " + rev);
		
		if(temp==rev)
		{
			System.out.println("Number is palindrome");
		}
		else
			System.out.println("Number is not a palindrome");
	
	}

}
