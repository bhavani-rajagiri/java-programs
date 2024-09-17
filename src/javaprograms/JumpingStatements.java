package javaprograms;

public class JumpingStatements {

	public static void main(String[] args) {
		
		// this will loop infinitely
		/*int num=10;
		while(true)
		{
			System.out.println("Hello");
			if(num==10)
			{
				break;
			}
		}*/
		
		
		
		// break example
		
		/*for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				
				break;
				
			}
			System.out.println(i);
		}*/
		
		
		//Continue statement , it will skip 5 and print 1,2,3,4,6,7,8,9,10 
		
		for(int i=0;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
