package javaprograms;

public class CountNumberOfEvenOddDigitsinaNumber {

	public static void main(String[] args) {
		
		int num = 1111;
		int count_even=0;
		int count_odd=0;
		int count=0;
		
		while(num>0)
		{
			
			int rem=num%10;//reminder we get
			
			if(rem%2==0) 
			{
				count_even++;
			}
			else {
				count_odd++;
			} 
			num=num/10;
		}
		 
		
		System.out.println("Total number of even digits are: " + count_even);
		System.out.println("Total number of odd digits are: " + count_odd);

	}

}
