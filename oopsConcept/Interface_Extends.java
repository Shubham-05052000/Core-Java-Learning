package oopsConcept;

interface Suraj{
	void add2();
}
interface Raj extends Suraj{
	void subs();
}
class Shubha1 implements Raj{
	public void add2() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("addition "+c);
	}
	public void subs() {
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println("addition "+c);
	}
}
public class Interface_Extends {
	public static void main(String[] args) {
		Shubha1 ref = new Shubha1();
		ref.add2();
		ref.subs();
	}
}
