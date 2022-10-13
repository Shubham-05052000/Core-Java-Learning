package method_injava;

public class Method_snytax_Rule {
	void disp() {
		System.out.println("Learn Java Developer");
	}
	void dis() {
		System.out.println("Learn Java ");
	}
	public static void main(String[] args) {
		Method_snytax_Rule ref = new Method_snytax_Rule();
		ref.disp();
		ref.dis();
		ref.disp();//multile time print
		ref.disp();
		ref.disp();
		Method_snytax_Rule.Add();

	}
	public static void Add() {
		int a=10,b=20;
		System.out.println("sum of two number "+(a+b));
	}

}
