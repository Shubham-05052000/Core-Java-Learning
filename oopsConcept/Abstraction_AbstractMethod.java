package oopsConcept;

public class Abstraction_AbstractMethod {
	public static void main(String[] args) {
		Html ref = new Html();
		Java ref1 = new Java();
		ref.Developer();
		ref1.Developer();
		ref.Rank();
		ref1.Rank();
	}
}
abstract class Programing{
	public abstract void Rank();
	public abstract void Developer();
}
class Html extends Programing{
	@Override
	public void Developer() {
		System.out.println("time burnere lee");
	}
	@Override
	public void Rank() {
		System.out.println("4 star");
	}
}
class Java extends Programing{
	@Override
	public void Developer() {
		System.out.println("games Gosling");
	}
	@Override
	public void Rank() {
		System.out.println("5 Star");
	}
}