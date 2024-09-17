package constructors;

public class TypesOfConstructors {
	
	//Variables
	
	String name;
	String col_name;
	int sub_code;
	
	 //Constructors
	// 1. Default constructor
		TypesOfConstructors()
		{
			System.out.println("This is a Default Constructor...!!");
		}
	
	
	// 2. Parameterized constructor
		TypesOfConstructors(String Name, String Col_name, int Sub_Code)
		{
			name=Name;
			col_name=Col_name;
			sub_code=Sub_Code;
			System.out.println("This is a Parameterized Constructor...!!");
		}
		
	//Methods
	
	void printData()
	{
		System.out.println("Student Name:" +name+ "  Collage Name:"+ col_name+ "  SubjectCode:"+ sub_code);
	}

}
