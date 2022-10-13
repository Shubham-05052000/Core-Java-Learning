package oopsConcept;

import java.sql.Ref;

public class Construction {

	public static void main(String[] args) {
		B ref = new B();
		ref.show();
	}

}
class B{
	int a;
	String b;
	B(){
		b="Shubham";
		a=10;
	}
	
	void show() {
		System.out.println(a+" "+b);
	}
}
