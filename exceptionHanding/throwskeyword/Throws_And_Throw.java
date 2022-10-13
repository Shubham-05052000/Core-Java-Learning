package exceptionHanding.throwskeyword;

public class Throws_And_Throw {
	 void div(int a, int b) throws ArithmeticException{
			if(b==0) {
				throw new ArithmeticException();
			}
			else {
				int c=a/b;
				System.out.println(c);
			}
		}
		public static void main(String[] args) {
			Throws_And_Throw ref = new Throws_And_Throw();
			try {
				ref.div(10,0);
			}
			catch(Exception n) {
				System.out.println("the B value is 0 than  its not divided ");
			}
			
		}
}
