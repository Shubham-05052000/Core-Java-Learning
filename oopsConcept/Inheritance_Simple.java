package oopsConcept;

public class Inheritance_Simple extends Student{
		void disp() {
			roll =1;
			marks=90;
			name="shubham";
			System.out.println(roll+" "+marks+" "+name);
			//System.out.println(a); not access beacuse  its private class
			System.out.println(b);
		}

	public static void main(String[] args) {
		Inheritance_Simple ref = new Inheritance_Simple();
		ref.input();
		ref.disp();

	}

}
class Student{
	protected String b;
	private int a;
	int roll,marks;
	String name;
	void input() {
		b="shubham";
		a=10;
		System.out.println(a);
		System.out.println("enter a details");
		System.out.println(b);
	}
	
}