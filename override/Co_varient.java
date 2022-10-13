package override;
class A1{
	A1 Show() {
		System.out.println("learn Java");
		return this;
	}
}
class B1 extends A1{
	//@Override
	B1 Show() {
		super.Show();
		System.out.println("plese study its ");
		return new B1();
	}
}
public class Co_varient {
	public static void main(String[] args) {
		B1 ref = new B1();
		ref.Show();
	}
}
