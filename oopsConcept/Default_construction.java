package oopsConcept;

public class Default_construction {

	public static void main(String[] args) {
			D ref = new D();
			ref.show();
		}

	}
	class D{
		int a;
		String b;
		D(){
//			b="Shubham";//default value of int and string
//			a=10;
		}
		
		void show() {
			System.out.println(a+" "+b);
		}
	}
