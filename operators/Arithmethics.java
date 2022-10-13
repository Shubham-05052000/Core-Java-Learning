package operators;

import java.util.Scanner;
public class Arithmethics {

	public static void main(String[] args) {
	Scanner ref = new Scanner(System.in);
	int a ,b;
	System.out.println("enter a two number");
	a=ref.nextInt();
	b=ref.nextInt();
	System.out.println("adding of two number "+(a+b));
	System.out.println("Substracting of two number "+(a-b));
	System.out.println("Multiple of two number "+(a*b));
	System.out.println("Division of two number "+(a/b));
	System.out.println("modules of two number "+(a%b));

	}

}
