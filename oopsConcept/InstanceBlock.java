package oopsConcept;

public class InstanceBlock {
	public static void main(String[] args) {
		J ref = new J();
		ref.input();
		ref.show();
	}

}

class J{
	int a;
	String b;
	J(){
		a=10;
		b="Shubham";
		System.out.println(a+" "+b);
	}
	{
		a=40;
		b="Instace balock";
		System.out.println(a+" "+b);
	}
	void show(){
		System.out.println("learn");
	}
	 static void input() {
		 System.out.println("Static method");
	 }
}
