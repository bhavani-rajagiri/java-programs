package javaprograms;

public class StringMethods {

	public static void main(String[] args) {
       
		String s1 = "Welcome to Java";
		String s2 = "Welcome to Selenium";
		
		System.out.println("Length of the String is : "+ s1.length());
		
		//substring
		System.out.println("Substring of the String is present: "+ s1.contains("to"));
		System.out.println("Substring of the String is: "+ s1.substring(2, 9));
		//concat
		String s3 = s1+s2;
		System.out.println("Full sting is : "+ s3);
		
		//replace
		System.out.println("Replace W with X: "+ s1.replace("W", "X") + "  " + s2.replace("W", "X"));
		
		
		//split
		String s4="abc@123@gmail.com";
		String arr[]=s4.split("@");
		System.out.println(arr[0] +" " + " " + arr[1] +" "+"" + arr[2]);
		
		//indexOf
		System.out.println(s1.indexOf("t"));
		

	}

}
