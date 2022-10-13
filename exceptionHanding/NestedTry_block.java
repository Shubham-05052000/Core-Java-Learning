package exceptionHanding;

public class NestedTry_block {
	public static void main(String[] args) {
		try {
			
			try {
				int n[]= {10,20,30};
//				System.out.println(n[9]);//stm2
				System.out.println(n[2]);//stm2
					
			}
			catch(ArrayIndexOutOfBoundsException a) {
				System.out.println(a);
			}
			//System.out.println("learn java");//stsm1
			System.out.println(10/0);//stsm1
		}
		catch(ArithmeticException b) {
			System.out.println(b);//stm3
		}
		System.out.println("coder");
		
	}
}
