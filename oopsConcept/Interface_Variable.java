package oopsConcept;

public class Interface_Variable {

	public static void main(String[] args) {
		Shubham1 ref = new Shubham1();
		ref.purchare();
		System.out.println(customer.amt);//static 
	}

}
interface  customer{
	int amt=15;
	void purchare();
}
class Shubham1 implements customer{
	
	//@Override
	//int amt =6; override and interface varible is fix its not change the variable value
	public void purchare() {
		System.out.println("rajesh pay the amount "+amt+" rice ");
	}
}