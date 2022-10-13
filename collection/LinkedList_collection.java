package collection;

import java.util.LinkedList;

public class LinkedList_collection {

	public static void main(String[] args) {
		LinkedList<String> Name = new LinkedList<>();
		// insert Data 
		Name.add("Shubham");
		Name.add("Suraj");
		Name.add("Kuldeep");
		System.out.println(Name);
		//first plase add data 
		Name.addFirst("Afatb");
		System.out.println(Name);
		// Add Last place data 
		Name.addLast("Arun");
		System.out.println(Name);
		///for each loop
		for(String str:Name) {
			System.out.println(str);
			}
		//manual add the data 
		Name.add(1,"Vikas");
		System.out.println(Name);
		//Remove use empty by default first one is remove 
		Name.remove();
		System.out.println(Name);
		System.out.println("manual remove to use remove(2)");
		Name.remove(2);
		System.out.println(Name);
		System.out.println("Last one remove use Lastremove() ");
		Name.removeLast();
		System.out.println(Name);
	}

}
///
