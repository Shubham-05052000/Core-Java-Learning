package method_injava;

import java.util.Scanner;

public class UseOf_Method {
	int a,b,sum,sub,mul,div,modules;
	public static void main(String[] args) {
		UseOf_Method r=new UseOf_Method();
		r.input();
		r.process();
		r.output();
	}
	void input() {
		System.out.println("enter a two number");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		b=ref.nextInt();
	}
	void process() {
		sum=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		modules=a%b;
	}
	void output() {
		System.out.println("sum "+sum);
		System.out.println("substration "+sub);
		System.out.println("multiplication "+mul);
		System.out.println("division "+div);
		System.out.println("remainder "+modules);
	}
}
