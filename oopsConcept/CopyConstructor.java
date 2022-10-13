package oopsConcept;

public class CopyConstructor {
	public static void main(String[] args) {
		E ref = new E();
		E ref1 =new E(ref);
	}

}
class E{
	int d;
	String e;
	int a;
	String b;
	E(){
		a=10;
		b="Learn Java";
		System.out.println(a+" "+b);
	}
	E(E ref){
		d=ref.a;
		e=ref.b;
		System.out.println(d+" "+e);
	}
	
}
