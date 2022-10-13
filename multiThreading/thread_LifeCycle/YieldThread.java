package multiThreading.thread_LifeCycle;
class H extends Thread{
	public void run() {
		String n=Thread.currentThread().getName();//thread get method syntax
		for(int i=0;i<=3;i++) {
			System.out.println(n);
		}
	}
}
public class YieldThread {

	public static void main(String[] args) {
		//Object create
		H t1 = new H();
		H t2 = new H();
		H t3 = new H();
		//getName & setName
		t1.setName("Thread");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		//run thread
		t1.start();
		t2.yield();
		t3.start();

	}

}
//t2.yield() its stop work that allow anothe thread to perform
//there are two method 
