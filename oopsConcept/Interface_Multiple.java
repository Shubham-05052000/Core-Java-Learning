package oopsConcept;

import java.util.Scanner;

public class Interface_Multiple {
	public static void main(String[] args) {
		Shubham4 r = new Shubham4();
		r.input();
		r.output();
	}

}
interface A1{
	void input();
}
interface B1{
	void output();
}
class Shubham4 implements A1,B1{
	
	int a;
	@Override
	public void input() {
		Scanner ref = new Scanner(System.in);
		System.out.println("input a number");
		a=ref.nextInt();
	}
	@Override
	public void output() {
		System.out.println("the number is enter "+a);
	}
}