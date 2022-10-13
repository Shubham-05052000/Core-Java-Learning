package collection;

import java.util.Stack;

public class Stack_Collection {

	public static void main(String[] args) {
		Stack<String> Name= new Stack<>();
		//insert data
		Name.push("Shubham");
		Name.push("suraj");
		Name.push("karan");
		System.out.println(Name);
		//last one remove 
		Name.pop();
		System.out.println(Name);
		System.out.println("LIFO (last in first out)");
	}

}
