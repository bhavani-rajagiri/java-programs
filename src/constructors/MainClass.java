package constructors;

public class MainClass {

	public static void main(String[] args) {
	
		
		TypesOfConstructors cons = new TypesOfConstructors();
		/*cons.name="Bhavani";
		cons.col_name="BVVS";
		cons.sub_code=23;
		cons.printData();*/
		
		TypesOfConstructors parameter_con = new TypesOfConstructors("Karan", "Basavakalyan Eng Clg", 15);
		parameter_con.printData();
	}

}
