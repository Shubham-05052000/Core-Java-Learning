package oopsConcept;

public class OverLoading {
	public static void main(String[] args) {
		H ref = new H();
		H ref1 = new H(10);
		H ref2 = new H(20.30,"Learn");
		H ref3 =new H(50,"JAVA");
		System.out.println(ref.a+" "+ref.b+" "+ref.c);
		System.out.println(ref1.a);
		System.out.println(ref2.b+" "+ref2.c);
		System.out.println(ref3.a+" "+ref3.c);
	}

}
class H{
	int a;
	Double b;
	String c;
	H(){
		a = 10;
		b =20.50;
		c ="Defulat";
	}
	H(int x){
		a=x;
	}
	H(double y,String z){
		b=y;
		c=z;
	}
	H(int x,String z){
		a=x;
		c=z;
	}
}