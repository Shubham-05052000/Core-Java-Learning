package string;

public class String_Literal {

	public static void main(String[] args) {
		String a="Shubham";
		System.out.println(a);
		
		String b="Shubham";
		System.out.println(b);
		
		a.concat(" kumar");
		System.out.println(a);//print ankit because String is immutable it cannot be change
		
		a=a.concat(" kumar");// print ankit kumar forefully change
		System.out.println(a);

	}

}
