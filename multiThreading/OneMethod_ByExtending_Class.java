package multiThreading;
class A extends Thread{
	public void run() { // run is already include thread method
		for(int i=1;i<=5;i++) {
			System.out.println("Learn Java");
		}
	}
}
public class OneMethod_ByExtending_Class {

	public static void main(String[] args) {
		A ref = new A();
		ref.start();//run is already include thread method then its satrt method works

	}

}
