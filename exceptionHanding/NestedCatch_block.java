package exceptionHanding;

public class NestedCatch_block {
	public static void main(String[] args) {
		try {
//			System.out.println(10/10);//no error
			System.out.println(10/0);//stsament 1 error
			System.out.println("learn code ");
		}
		catch(ArithmeticException a) {
			System.out.println("o is not divided by any number");
			try {
				//String Arr="S";//no eeror
				String Arr=null;// statment 3
				System.out.println(Arr.toLowerCase());
			}
			catch(NullPointerException b) {
				System.out.println("null pointer error");
			}
		}
		System.out.println("program End");
	}
}
