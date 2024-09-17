package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_demo {

	public static void main(String[] args) {
		
		ArrayList<Object> arr_list=new ArrayList<Object>();
		arr_list.add("Bhavani");
		arr_list.add(23);
		arr_list.add('a');
		arr_list.add(null);
		arr_list.add(null);
		arr_list.add(23);
		
		
		arr_list.add(4, "karan");//inserting element
		arr_list.set(3, "Not Null");// update/changing the value
		
		
		
		System.out.println(arr_list);
		System.out.println(arr_list.get(3));
		System.out.println(arr_list);
		
		System.out.println(arr_list.remove(2));
		System.out.println(arr_list);
		
		System.out.println(arr_list.size());
		
		/*for(Object arr:arr_list)
		{
			
			System.out.println(arr);
		}*/
		
		for(int i=0;i<arr_list.size();i++)
		{
			//arr_list.get(i);
			System.out.println(arr_list.get(i));
		}
		

	}

}
