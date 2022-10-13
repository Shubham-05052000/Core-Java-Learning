package oopsConcept;

public class Interface_Method {
	public static void main(String[] args) {
		Shubham3 r=new Shubham3();
		r.Developer();
		r.webdesgin();
	}

}
interface Client1{
	void webdesgin();
	void Developer();
}
abstract class Kuldeep1 implements Client1{
	//@Override
	
	public void webdesgin() {
		System.out.println("one button,two button, three button");
	}
}
//kuldeep is create only webdesign its not created Developer then its use extend kulpeen and kuldeep half of the work was  complete shubham
class Shubham3 extends Kuldeep1{
	@Override
	public void Developer() {
		System.out.println("html,css,javascript");
	}
}