package oopsConcept;

public class Encapsulation {
	public static void main(String[] args) {
		A2 ref = new A2();
		ref.setValue(200);
		System.out.println(ref.getValue());
	}
	
}
class A2{
	private int value;
	public void setValue(int x) {
		value=x;
	}
	public int getValue() {
		return value;
	}
}
