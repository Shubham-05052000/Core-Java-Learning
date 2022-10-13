package thiskeyword;

public class ThisKeywordParamerter {
	int a;
	ThisKeywordParamerter(int a){
		this.a=a;// parameter value print a=100;
	}
	void show() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		ThisKeywordParamerter ref = new ThisKeywordParamerter(100);
		ref.show();
	}
}
