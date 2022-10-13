package superkeyword;

public class Superkeyword_Method {

	public static void main(String[] args) {
		B1 ref = new B1();
		ref.show();

	}

}
class A1{
	void show() {
		System.out.println("hello");
	}
}
class B1 extends A1{
	void show() {
		super.show();
		System.out.println("hello Word");
	}
	
}