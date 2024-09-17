package javaprograms;

import java.util.Arrays;

public class MutablevsImmutable {

	public static void main(String[] args) {
		
		//Mutable - Can be changed 
		
		int a[] = {20,26,37,46,10,25};
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);// mutable
		System.out.println(Arrays.toString(a));
		
		
		//Im-mutable
		
		String s = "Bhavani";
		System.out.println(s);
		s.concat("Rajagiri");//Im-mutable value can not be changed
		System.out.println(s);

	}

}
