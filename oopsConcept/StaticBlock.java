package oopsConcept;

public class StaticBlock {
	{
		System.out.println("instance Block");
	}
	static{
		System.out.println("Static block");
	}
	StaticBlock(){
		System.out.println("default block");
	}
	

	public static void main(String[] args) {
		StaticBlock ref = new StaticBlock();

	}

}
