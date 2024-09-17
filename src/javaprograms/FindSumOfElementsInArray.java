package javaprograms;

public class FindSumOfElementsInArray {

	public static void main(String[] args) {
		
		int a[]= {2,3,5,7,8};
		
		int length_array = a.length;
		int sum=0;
		
		System.out.println("Length of array is : " + length_array);
		
		for(int i=0; i<=length_array -1;i++)
		{
			int num=a[i];
			sum=num+sum;
		}
		System.out.println(sum);

	}

}
