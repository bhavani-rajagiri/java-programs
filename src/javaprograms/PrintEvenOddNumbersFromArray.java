package javaprograms;



public class PrintEvenOddNumbersFromArray 
{

	
	public static void main(String[] args) 
	{


		
		int array[]= {2,4,6,77,88,9,34,53,2};
		int num;
		int length_of_array=array.length;
		int even_nums=0, odd_nums=0;
		System.out.println("Length of an array is :"+ length_of_array);
		
		for(int i=0;i<=length_of_array-1;i++) 
		{
			num=array[i];
			if(num%2==0)
			{
				
				System.out.println(num+" :"+"Number is even" );
				//even_nums++;
			}
			else
				System.out.println( num+" :"+ "Number is odd");
			    //odd_nums++;
			   
		}
		
		System.out.println(even_nums );
		System.out.println(odd_nums);

		
	}

}
