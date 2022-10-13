package finalKeyword;
class H{
	void mobile() {
		System.out.println("9082361867");
	}
	void Atm() {
		System.out.println("123");
	}
}
class K extends H{
	@Override
	public void mobile() {
		System.out.println("9082361867");
	}
	//@Override
	public void Atm() {
		System.out.println("123");  //becuse its final method then its not override
	}
	
}
public class FinalMethod {
	public static void main(String[] args) {
		K ref = new K();
		ref.mobile();
		ref.Atm();
	}
}
