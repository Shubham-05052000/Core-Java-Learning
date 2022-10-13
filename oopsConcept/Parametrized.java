package oopsConcept;

public class Parametrized {

	public static void main(String[] args) {
		C ref = new C(100,200);
		ref.show();
		
	}

}
class C{
	int x,y;
	C(int a,int b){
		x=a;
		y=b;
	}
	void show() {
		System.out.println(x+" "+y);
	}
}
