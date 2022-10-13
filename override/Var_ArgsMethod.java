package override;

public class Var_ArgsMethod {
	void Add(int ...a) { //... var-args
		int sum=0;
		for(int x:a) {
			sum=sum+x;
		}
		System.out.println("Adding number "+ sum);
	}
	public static void main(String[] args) {
		Var_ArgsMethod ref = new Var_ArgsMethod();
		ref.Add();
		ref.Add(10,20);
		ref.Add(10,20,30);
		ref.Add(10,30,40,50);
	}
}
