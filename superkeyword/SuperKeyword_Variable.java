package superkeyword;

public class SuperKeyword_Variable {

	public static void main(String[] args) {
		B ref = new B();
		ref.show();

	}

}
class A{
	int a=10;
	
}
class B extends A{
	int a =20;
	void show() {
		System.out.println(super.a);
		System.out.println(a);
		
	}
}