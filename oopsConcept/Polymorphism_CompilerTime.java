package oopsConcept;

public class Polymorphism_CompilerTime {
	void add1() {
		int a=10;
		 int b=20;
		int c=a+b;
		System.out.println(c);
	}
	int add1(int x) {
		int a =20;
		int b=30;
		int c= a+b;
		return c;
	}
	void add1(int x,double y) {
		double c= x+y;
		System.out.println(c);
	}
	void add1(int x, int y) {
		int c=x+y;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Polymorphism_CompilerTime ref = new Polymorphism_CompilerTime();
		ref.add1();
		int add1=ref.add1(100);
		ref.add1(10,10.1);
		ref.add1(10,20);
	}

}
