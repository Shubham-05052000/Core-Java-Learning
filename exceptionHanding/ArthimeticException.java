package exceptionHanding;
	
public class ArthimeticException {
	public static void main(String[] args) {
		System.out.println("method strat");
		int a=10; int b=0; int c;
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(Exception n) {
			System.out.println("ArthimeticException");
		}
		System.out.println("method end");
	}
	
}
