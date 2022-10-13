package thiskeyword;

public class ThisKeywordConstructor {
	
	ThisKeywordConstructor(){
		System.out.println("learn");
	}
	ThisKeywordConstructor(int a){
		this();
		System.out.println(a);
	}
	public static void main(String[] args) {
		ThisKeywordConstructor ref = new ThisKeywordConstructor(100);
	}
}
