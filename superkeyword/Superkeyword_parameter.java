package superkeyword;

public class Superkeyword_parameter {

	public static void main(String[] args) {
		B3 ref = new B3();

	}

}
class A2{
	A2(int a){
		System.out.println("hello"+a);
	}
}

class B3 extends A2{
	B3() {
		super(100);
		System.out.println("hello words");
	}
}