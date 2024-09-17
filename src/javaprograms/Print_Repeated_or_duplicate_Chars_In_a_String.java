package javaprograms;

public class Print_Repeated_or_duplicate_Chars_In_a_String {

	
	public static void main(String[] args) {
		
		String str = "w3schools";
		  int cnt = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]);
		     cnt++;
		    // break;
				
			}
			
		}
		
		//System.out.println(count_rep_chars);
		  }
	}
		
	}


