package javaprograms;

public class ReverseString {

	public static void main(String[] args) {
		
		
		//Approach 1
		String name = "Bhavani Rajagiri";
		String rev = "";
		
		for (int i=name.length()-1; i>=0; i--)
		{
			rev=rev+name.charAt(i);
			
		}
		
		System.out.println(rev);
		
		
		
		//Approach 2
		
			String s = "Karanraj";
			String rev1="";
			
			
			char a[]=s.toCharArray(); //convert string to charr array
			
			for(int j=a.length-1;j>=0;j--)
			{
				rev1=rev1+a[j];
			}
			System.out.println(rev1);
			
			
		//Approach 3
			
			StringBuffer sb = new StringBuffer("Welcome");
			System.out.println(sb.reverse());
			
       //Approach 4
			
			StringBuilder sd = new StringBuilder("Welcome");
			System.out.println(sd.reverse());
	}

	
}
