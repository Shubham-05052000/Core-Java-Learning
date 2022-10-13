package oopsConcept.jdkversion;

interface A1{
	default void call(){
		add(10,20);
	}
	private  void add(int x, int y) {
		System.out.println("Addition of two number "+(x+y));//private method
	}
	
	//2method 
	public static void call1(){
		add1(1,20);
	}
	private static  void add1(int x, int y) {
		System.out.println("Addition of two number "+(x+y)); //private static method 
	}
}
class A2 implements A1 {
	public void sub(int x, int y) {
		System.out.println("substraction "+(x-y));
	}
}
public class JDK19 {

	public static void main(String[] args) {
		A2 ref = new A2();
		ref.sub(200,100);
		ref.call();
		A1.call1();
		
		
		

	}

}
