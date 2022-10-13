package string;

public class NewKeyword {

	public static void main(String[] args) {
		String a= new String("Shubham");
		System.out.println(a);//it is store heap memory
		
		String b = new String("Shubham");
		System.out.println(b);
		
		a.concat(" Shrivastav");
		System.out.println(a);//string is immutable it cannor be change print Shubham
		
		a=a.concat(" Shrivastav");//forefully change 
		System.out.println(a);
		
		a="Shrivastav";
		System.out.println(a);// its a new string

	}

}
