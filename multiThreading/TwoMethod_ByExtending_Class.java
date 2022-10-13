package multiThreading;
class B extends Thread{
	public void run() {//run is already include thread method
		for(int i=1;i<=5;i++) {
			System.out.println("Thread method");
		}
	}
}

public class TwoMethod_ByExtending_Class {

	public static void main(String[] args) {
		B ref = new B();
		ref.start();//run is already include thread method then its satrt method works
		for(int i=1;i<=5;i++) {
			System.out.println("Main Method");
		}

	}

}
//they perform simultaneously your output not comform

