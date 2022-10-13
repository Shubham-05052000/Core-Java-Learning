package exceptionHanding;

public class MultipleTryCatch {

	public static void main(String[] args) {
		try {
			int a=10,b=0,c;
			//int a=10,b=2,c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException a) {
			System.out.println("Arithmetic error");
		}
		try {
			int a[]= {10,20,30};
			System.out.println(a[5]);
			//System.out.println(a[0]);
		}
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println("Array index of bands Error");
		}

	}

}
