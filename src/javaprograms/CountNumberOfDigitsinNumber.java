package javaprograms;



public class CountNumberOfDigitsinNumber {

	public static void main(String[] args) {
		 
		int num = 584;
		int count =0;
		
		while(num!=0)
		{
		
			num=num/10;
			count++;
		}
		
		
			System.out.println(count);	
		

	}

}
