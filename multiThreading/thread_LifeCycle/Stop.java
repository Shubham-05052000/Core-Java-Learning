package multiThreading.thread_LifeCycle;
class I extends Thread{
	public void run() {
		String n = Thread.currentThread().getName();
		for(int i=0;i<=3;i++) {
			System.out.println(n);//by default print// thread -0
			Thread.yield();
		}
	}
}
public class Stop {

	public static void main(String[] args) {
		//Object create
		I t1 = new I();
		I t2 = new I();
		I t3 = new I();
		//getName & setName
		t1.setName("Thread");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		//run thread
		t1.start();
		//t2.stop();//t2 is terminate its not perform
		t2.start();
		t3.start();
		t2.stop();//its perform only one time then its terminate because t2start then t2stop
	}

}
//not works  properly output same different because its t2 perform only one time then its terminate because t2start then t2stop