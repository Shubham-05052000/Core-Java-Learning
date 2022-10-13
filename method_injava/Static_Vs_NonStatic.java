package method_injava;
public class Static_Vs_NonStatic {
	int a=10;//its use instance but not use Statics
	static int b=20;//it is use Ststics And instance
	public static void main(String[] args) {
		Static_Vs_NonStatic ref = new Static_Vs_NonStatic();
		ref.Disp();
		Static_Vs_NonStatic.Show();

	}
	static void Show() {
		System.out.println("Static Variable  "+b);
		//System.out.println("Show "+a);  not use because a is instance 
	}
	void Disp() {
		System.out.println("Instance method "+a+" "+b);
	}

}
