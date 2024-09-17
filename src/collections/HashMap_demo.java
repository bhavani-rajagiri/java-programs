package collections;

import java.util.HashMap;

public class HashMap_demo {

	public static void main(String[] args) {
		
		HashMap<Integer, String>hashmap=new HashMap<Integer, String>();
		hashmap.put(101, "Bhavani");
		hashmap.put(102, "Karan");
		hashmap.put(103, "Sachin");
		hashmap.put(104, "Rani");
		hashmap.put(105, "Sumit");
		hashmap.put(101, "Bhavani");
		hashmap.put(106, "Sachin");
		
		System.out.println(hashmap);//removes duplicate key while printing
		
		//print only keys
		System.out.println("Print only key values :" + hashmap.keySet());
		//print only values
		System.out.println("Print only key values :" + hashmap.values());
		
		
		

	}

}
