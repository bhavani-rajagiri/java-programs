package collections;

import java.util.HashSet;

public class HashSet_demo {

	public static void main(String[] args) {
		
		HashSet<String> hashset=new HashSet<String>();
		
		hashset.add("Bhavani");
		hashset.add("K");
		hashset.add("B");
		hashset.add("G");
		hashset.add("M");
		hashset.add("Bhavani");
		hashset.add("R");
		
		System.out.println(hashset.size());
		System.out.println(hashset);
		
		//insert new value
		hashset.add("GGGG");
		System.out.println(hashset);
		
		//retrieving value by looping
		System.out.println("retrieving value by looping : for each loop");
		for(String s:hashset)
		{
			System.out.println(s);
		}
		
		//removing an item
		System.out.println(hashset.remove("R"));
		System.out.println(hashset);
		
		System.out.println(hashset.contains("Bhavani"));

	}

}
