package polymorphism;

public class OverloadingMethodDemmo {
	
	int x;
	int y;
	
	void add() 
	{
		System.out.println(x+y);
		}
	
   void add(int a, int b) 
   {
	   System.out.println(a+b);
	   
		}
   void add(int a, double b)
   {
	   System.out.println(a+b);
	   }
   double add(double a, double b, double c) 
   {
	    return(a+b+c);
	   }
   }
