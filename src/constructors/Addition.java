package constructors;

public class Addition {
	
	//variables
	
	int x;
	int y;
	
	//Constructor
	Addition()
	{
		x=10;
		y=20;
	}
	
	Addition(int xx, int yy)
	{
		x=xx;
		y=yy;
	}
	
	//Method
	
	int sum()
	{
		 return x+y;
		
	}
	
	/*void sum()
	{
		 System.out.println( x+y);
		
	}*/

}
