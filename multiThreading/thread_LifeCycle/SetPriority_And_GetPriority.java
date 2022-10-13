package multiThreading.thread_LifeCycle;
class L extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());// by default 5 priority
	}
}
public class SetPriority_And_GetPriority {

	public static void main(String[] args) {
		L t1 = new L();
		L t2 = new L();
		L t3 = new L();
		//Priority set 
		t1.setPriority(10);
		t2.setPriority(5);
		t3.setPriority(7);
		//t1.start();// by default 5 priority
		t1.setName("Thread 1");
		t2.setName("Thraed 2");
		t3.setName("Thread 3");
		//not comments priority
		t1.start();
		t2.start();
		t3.start();
	}

}
