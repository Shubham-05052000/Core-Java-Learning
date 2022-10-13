package thiskeyword;

public class ThisKeywordConstruction2Method {
	ThisKeywordConstruction2Method(){
		this(10);
	}
	ThisKeywordConstruction2Method(int a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		ThisKeywordConstruction2Method ref = new ThisKeywordConstruction2Method();
	}
}
