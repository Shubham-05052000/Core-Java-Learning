package finalKeyword;
final class A{
	void input() {
		System.out.println("enter a input number ");
	}
}
class D extends A{
	void input() {
		System.out.println(" Final class Extends");
	}
}
class B {
	void show() {
		System.out.println("Not final");
	}
}
class C extends B{
	void show() {
		System.out.println("Extends ");
	}
}
public class FinalClass {
	public static void main(String[] args) {
		C re = new C();
		A ref = new A();
		ref.input();
		re.show();
	}
}
