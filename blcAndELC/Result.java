package blcAndELC;

public class Result {
	public static void main(String[] args) {
		int n=10;
		int m=20;
		int s=n+m;
		System.out.println(s);
		First ref = new First();
		ref.input();
		ref.show();
		
		System.out.println(s);
		Second re = new Second();
		re.input();
		re.show();
		
	}
}
