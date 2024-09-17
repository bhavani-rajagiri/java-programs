package javaprograms;

public class whileLoopProgram {

	public static void main(String[] args) {
		// print 1 to 10
		
		int i =1;
		
		
		// print 1 to 10 numbers
		while(i<=10) {
			
			System.out.println(i);
			i++;
		}

		
		// print Hello word 10 times
		int x =1;
          while(x<=10) {
			
			System.out.println("Hello");
			x++;
          }
          
       // print even number between 1 to 10
  		int y =2;
            while(y<=10) {
  			
  			System.out.println("Even numbers are :"+ y);
  			y=y+2;
            }
            
            
         // print even number between 1 to 10 using if 
      		int w =1;
                while(w<=10) {
      			
                	if(w%2==0) {
      			         System.out.println(w);
                	}
      		         w++;
                }
                
                
                
           // print even and odd numbers between 1 to 10 using if 
                

          	int n =1;
          while(n<=10) {
      			
              if(n%2==0) 
              {
      			System.out.println("Even numbers is :"+ n);
               }
                	
              else 
              {
                 System.out.println("odd numbers is :"+ n);
                		
               }
      		      n++;
                
         }      
          
          //print 10 to 1
          
          int xx =10;
          while(xx>0) 
          {
        	  
        	  System.out.println(xx);
        	  xx--;

          }
	}

}
