package oopsConcept;

public class Class_Object {
	public static void main(String[] args) {
		A ref = new A();
		ref.show();
	}

}
class A{
	int a;
	String b;
	A(){
		
	}
	
	void show() {
		System.out.println(a+" "+b);
	}
}
