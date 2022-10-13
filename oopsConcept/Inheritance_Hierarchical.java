package oopsConcept;

public class Inheritance_Hierarchical {

	void end() {
		System.out.println("End of the code");
	}

}
class m1 extends Inheritance_Hierarchical {
	int a;
	int b;
	void add() {
		a=50; b=20;
		System.out.println("addition "+(a+b));
	}
}
class m2 extends Inheritance_Hierarchical{
	int a,b;
	void sub() {
		a=50; b=20;
		System.out.println("sub "+(a+b));
	}
}
class m3{
	int a,b;
	void mul() {
		a=2; b=4;
		System.out.println("sub "+(a*b));
	}
	
}
//object code
class test1{
	public static void main(String[] args) {
		m1 r1 = new m1();
		m2 r2 = new m2();
		m3 r3 = new m3();
		Inheritance_Hierarchical r4 = new Inheritance_Hierarchical();
		r1.add();
		r2.sub();
		r3.mul();
		r4.end();
	}
}