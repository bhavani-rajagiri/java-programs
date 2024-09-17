package staticAndNonstatic;

public class StaticAndNonstaticExmp {
	
	static String name = "Karan";
	String address ="Banglore Vijayanagar";
	
	
	static void print() {
		System.out.println("This is static Method..");
	}
	
	 void printmsg() {
		System.out.println("This is non-static Method..");
	}
	
	 void printAll()
	 {
		 System.out.println(name);
		 System.out.println(address);
		 print();
		 printmsg();
	 }
	 
	/* public static void main(String[] args) {
		 System.out.println(name);
	 }*/

}
