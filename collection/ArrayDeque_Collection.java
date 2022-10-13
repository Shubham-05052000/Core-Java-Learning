package collection;

import java.util.ArrayDeque;

public class ArrayDeque_Collection {

	public static void main(String[] args) {
		ArrayDeque<String> Name= new ArrayDeque<>();
		//insert data
		Name.push("Shubham");
		Name.push("suraj");
		Name.push("karan");
		System.out.println(Name);
		//last one remove 
		Name.pop();
		System.out.println(Name);
		System.out.println("FIFO (last in first out)");
	}

}
