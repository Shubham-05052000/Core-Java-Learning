package multiThreading.thread_LifeCycle;
class J extends Thread{
	public void run() {
		System.out.println("isAlile thraed");
	}
}
public class IsAlive {

	public static void main(String[] args) {
		J t1= new J();
		J t2 = new J();
		System.out.println(t1.isAlive());
		t1.start();
		t2.start();
		System.out.println(t2.isAlive());

	}

}
