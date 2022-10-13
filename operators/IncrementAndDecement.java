package operators;

public class IncrementAndDecement {
	
	public static void main(String[] args) {
		int a =10;
		System.out.println("pre-post increment");
		System.out.println(a++);//post incremenyt print a =10 but actual value 11
		System.out.println(++a);//pre incremenyt a =12
		System.out.println("pre-post Decrement");
		System.out.println(a--);//post Decrement print a =12 but actual value 11
		System.out.println(--a);//pre Decrement a =10
		
}
}
