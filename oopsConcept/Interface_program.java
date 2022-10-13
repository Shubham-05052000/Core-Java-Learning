package oopsConcept;

import java.util.Scanner;

public class Interface_program {
	public static void main(String[] args) {
		Shubham r= new  Shubham();
		r.input();
		r.output();
	}

}
interface Client{
	void input();
	void output();
}
class Shubham implements Client{
	String name;
	double Salary;
	public void input() {
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter your name");
		name=ref.nextLine();
		System.out.println("Enter your Salary");
		Salary=ref.nextDouble();
	}
	public void output() {
		System.out.println("your name is "+name);
		System.out.println("your Salary is "+Salary);
	}
}