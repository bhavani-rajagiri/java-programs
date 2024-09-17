package classCreation;

public class Employees {

	
	//Variables and Methods
	
	int eid;
	int salary;
	String e_name;
	String e_dept;
	
	
	void display()
	{
		System.out.println(eid);
		System.out.println(salary);
		System.out.println(e_name);
		System.out.println(e_dept);
	}
	
	public static void main(String[] args) {

     //always objects should be created in main method
		Employees emp1=new Employees();
		emp1.eid=100;
		emp1.salary=2000;
		emp1.e_name="Bhavani";
		emp1.e_dept="HR";
		emp1.display();

		
		Employees emp2=new Employees();
		emp2.eid=101;
		emp2.salary=3000;
		emp2.e_name="karan";
		emp2.e_dept="Dev";
		emp2.display();
		
		// without creating method also we can print the data by adding print statement with "emp1.eid"
	}

}
