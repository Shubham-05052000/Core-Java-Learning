package operators;

public class Ternary {
	public static void main(String[] args) {
		System.out.println("ternary operator");
//		int a=10,b=30, c=40,max;
//		max=(a>b) ? (a>c? a:c):(b>c ? b:c);
//		System.out.println(max);
		
		int a=110,b=30, c=40,d=100,max;
		max=(a>b && a>c && a>d ? a:b>c && b>d ? b:c>d ? c:d);
		System.out.println(max);
}
}
