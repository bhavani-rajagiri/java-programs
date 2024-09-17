package methodsCreation;

public class DifferentwayofCreatingMethods {
	
	//variables
	
	int age;
	int house_no;
	String address;
	String dist;
	
	
	//Methods
	
	// 1) No parameters & no return value
	
	void printData() 
	{
		System.out.println("Age is : " + age);
		System.out.println("House number is : " +house_no);
        System.out.println("Address is : " +address);
		System.out.println("Dist is : " +dist);


	}
	// 2) No parameters & return value
	String noParametersAndReturnValue()
	{
		return age+ " " +house_no+ " " + address+ " " +dist;
	}
	
	// 3) Takes parameters & no return value that is "Constructor"
	 /*DifferentwayofCreatingMethods(int Age,int HouseNo,String Address,String Dist)
	{
		age=Age;
		house_no=HouseNo;
		address=Address;
		dist=Dist;
	}*/
	
	
	// 4) Takes parameters & return value
	 String takesParametersAndReturnValue(int Age,int HouseNo,String Address,String Dist)
	 {
		 return(Age+ " " + HouseNo+" "+Address+" "+Dist);
		
	 }
	 
	 
}
