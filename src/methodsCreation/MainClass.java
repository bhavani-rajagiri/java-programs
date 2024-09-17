package methodsCreation;

public class MainClass {

	public static void main(String[] args) {
		
		/*DifferentwayofCreatingMethods cm1=new DifferentwayofCreatingMethods();
		cm1.age = 23;
		cm1.house_no = 123;
		cm1.address ="#1, 1st G cross Benglore";
		cm1.dist="Benglore";
		cm1.printData(); // 1st approach
		
		
		
		DifferentwayofCreatingMethods cm2=new DifferentwayofCreatingMethods();
		cm2.age = 25;
		cm2.house_no = 153;
		cm2.address ="#1, 2st G cross Benglore";
		cm2.dist="Benglore Urban";
		cm2.printData();
		String value =cm2.noParametersAndReturnValue(); // 2nd approach
		System.out.println(value);*/
		
		//DifferentwayofCreatingMethods cm3=new DifferentwayofCreatingMethods(26,234,"5th G cross Banglore", "Kolar");
		//cm3.printData(); // 3rd approach
		
		DifferentwayofCreatingMethods cm4=new DifferentwayofCreatingMethods();
	    String values=	cm4.takesParametersAndReturnValue(35, 456, "Banglore", "Dharwad");
		System.out.println(values);
	}

}
