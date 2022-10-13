package oopsConcept;

public class PrivateConstructor {
	int a;
	String b;
	Double c;
	private PrivateConstructor() {
		a=10;
		b="shubham";
		c=10.76;
		System.out.println(a+" "+b+" "+c);
	}
	public static void main(String[] args) {
		PrivateConstructor ref = new PrivateConstructor();

	}

}
//note only one class declared private class 