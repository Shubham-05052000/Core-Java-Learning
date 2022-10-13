package oopsConcept;

public class CopySecondMethod {

	public static void main(String[] args) {
		F ref = new F(100,"Shubahm");
		F ref1 =new F(ref);
	}

}
class F{
	int a;
	String b;
	
	F(int x, String y){
		a=x;
		b=y;
		System.out.println(a+" "+b);
	}
	F(F ref){
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
	
}