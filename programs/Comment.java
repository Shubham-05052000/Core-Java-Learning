package programs;

public class Comment {
	int a = 10;// instance variable without object
	static int b= 20; // static instances 
	public static void main(String args[]) {
		int c = 30;// local variable change the value 
		final int D = 40;// final variable do not change the value and first word always captial
		Comment ref = new Comment();// object creating 
		System.out.println(ref.a);//ref print 
		System.out.println(b);
		System.out.println(c);
		System.out.println(D);
		
	}

}
