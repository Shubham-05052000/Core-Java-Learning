package Recursion;

public class SumOf_FirstNaturalNumber {

	public static void main(String[] args) {
		SumOf_FirstNaturalNumber ref = new SumOf_FirstNaturalNumber();
		int a=ref.sum(10);
		System.out.println("Sum of first 10 number "+a);

	}
	int  sum(int b) {
		if(b>0) {
			return b+sum(b-1);
		}
		else {
			return 0;
		}
	}

}
