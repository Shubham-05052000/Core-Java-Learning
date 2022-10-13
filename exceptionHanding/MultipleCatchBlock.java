package exceptionHanding;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int a=10,b=10,c;
			c=a/b;
			System.out.println(c);
			
			int n[]= {10,20,30};
			System.out.println(n[9]);
			
			String Sh="shubham";
			System.out.println(Sh.toUpperCase());
		}
		catch(ArithmeticException a) {
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException d) {
			System.out.println(d);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

