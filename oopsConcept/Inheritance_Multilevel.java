package oopsConcept;

public class Inheritance_Multilevel extends sub3 {
	void rem() {
		System.out.println("addition of two number "+(a%b));
	}
	public static void main(String[] args) {
		Inheritance_Multilevel ref = new Inheritance_Multilevel();
		ref.show();
		ref.input();
		ref.muldiv();
		ref.rem();
	}

}
class Sub1{
	int a;
	int b;
	void show (){
		a=10; b=20;
	}
}
class sub2  extends Sub1{
	void input() {
		System.out.println("addition of two number "+(a+b));
		System.out.println("substraction of two number "+(a-b));
	}
}
class sub3 extends sub2{
	void muldiv() {
		System.out.println("division of two number "+(a/b));
		System.out.println("multipaltion of two number "+(a*b));
	}
}