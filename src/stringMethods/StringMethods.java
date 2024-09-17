package stringMethods;

public class StringMethods {

	public static void main(String[] args) {
		
		String value = "Welcome to Java and selenium";
		System.out.println(value.charAt(3));
		
		//Substring
		System.out.println(value.substring(2, 9));
		
		//replace existing  char with new char
		System.out.println(value.replace('a', 'X'));
		
		//remove white space
		System.out.println(value.replaceAll("\\s", ""));
		
		//remove delimeters like @, .
		String s = "abcd@gmail.com";
		String array[] = s.split("@");
		System.out.println(array[0]);
		System.out.println(array[1]);
	
		
		

	}

}
