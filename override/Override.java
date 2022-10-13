package override;

class A{
	void Show() {
		System.out.println("Show @override");
	}
	void input() {
		
	}
}
class B extends  A{
	//@Override
	public void Show() {
		System.out.println("Show @override");
	}
	//@Override
	public void input() {
		System.out.println("input @override");
	}
}
public class Override {
	public static void main(String[] args) {
		B ref = new B();
		ref.input();
		ref.Show();
		
	}
}
