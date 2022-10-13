package programs;

public class Varibale {
	static int a =10;
	void fun() {
		int b = 10;// not chamge 
		System.out.println(a+ " "+b);
		a++;
		b++;
		
	}
	public static void main(String args[]) {
		Varibale ref = new Varibale();
		ref.fun();
		ref.fun();
		ref.fun();
	}

}
