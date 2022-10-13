package thiskeyword;

public class ThiskeywordProveThat {
	void show() {
		System.out.println(this);
	}
	public static void main(String[] args) {
		ThiskeywordProveThat ref= new ThiskeywordProveThat();
		System.out.println(ref);
		ref.show();
	}

}
// outout
//thiskeyword.ThiskeywordProveThat@cac736f
//thiskeyword.ThiskeywordProveThat@cac736f both are unique key
