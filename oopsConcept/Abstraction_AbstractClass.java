package oopsConcept;

public class Abstraction_AbstractClass {
	public static void main(String[] args) {
		Dog ref = new  Dog();
		tiger ref1 = new tiger();
		ref.sound();
		ref1.sound();
	}
}
abstract class Animals{
//	Animals(){
//		System.out.println("All are barking");//default 
//	}
	public abstract void sound();
}
class Dog extends Animals{
//	Dog(){
//		super();//default use 
//	}
	public void sound() {
		System.out.println("Dog is baracking");
	}
}
class tiger extends Animals{
//	tiger(){
//		super(); //default use 
//	}
	public void sound() {
		System.out.println("Tiger is baraiking");
	}
}