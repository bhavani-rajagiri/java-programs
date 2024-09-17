package javaprograms;

public class CountNumberOfcharsInaString {

	public static void main(String[] args) {
		
		String string = "java and selenium";
		char ch[]=string.toCharArray();
		
		int count=0;
		
		for(int i=0;i<string.length();i++)
		{
			 if(string.charAt(i) != ' ')
			{
				count++;
			}
		}
          System.out.println(count);
	}

}
