package oopsConcept;

public class Inheritance_Multilevel2method {

	public static void main(String[] args) {
		su3 ref = new su3();
		ref.show();
		ref.input();
		ref.muldiv();
		ref.rem();

	}

}
class Su{
	int a;
	int b;
	void show (){
		a=10; b=20;
	} 
}
class su1  extends Su{
	void input() {
		System.out.println("addition of two number "+(a+b));
		System.out.println("substraction of two number "+(a-b));
	}
}
class su2 extends su1{
	void muldiv() {
		System.out.println("division of two number "+(a/b));
		System.out.println("multipaltion of two number "+(a*b));
	}
}
class su3 extends su2{
	void rem() {
		System.out.println("rimendira of two number "+(a%b));
		
	}
}