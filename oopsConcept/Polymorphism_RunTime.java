package oopsConcept;

public class Polymorphism_RunTime {
	public static void main(String[] args) {
		Square ref = new Square();
		ref.draw();
	}
}
class shape{
	void draw(){
		System.out.println("cannot fint shape");
	}
}
class Square extends shape{
	void draw() {
		super.draw();
		System.out.println("Square");
	}
}