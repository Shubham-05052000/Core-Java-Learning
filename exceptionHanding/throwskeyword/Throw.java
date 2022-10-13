package exceptionHanding.throwskeyword;

public class Throw {
	 void div(int a, int b){
		if(b==0) {
			throw new ArithmeticException();
		}
		else {
			int c=a/b;
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		Throw ref = new Throw();
		ref.div(10,0);
	}

}
