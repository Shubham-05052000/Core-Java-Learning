package multiThreading.thread_LifeCycle;
class Thread1 extends Thread{
	public void run() {
		String n = Thread.currentThread().getName();
		for(int i=0;i<=3;i++) {
			System.out.println(n);//by default print// thread -0
			Thread.yield();
		}
	}
}
class Thread2 extends Thread{
	public void run() {
		String n = Thread.currentThread().getName();
		for(int i=0;i<=3;i++) {
			System.out.println(n);//by default print// thread -1
		}
	}
}
public class TwoMethod_YieldThread {

	public static void main(String[] args) {
		 Thread1 ref = new  Thread1();
		 Thread2 ref1 = new Thread2();
		 ref.start();//by default print// thread -0
		 ref1.start();//by default print// thread -1

	}

}
//not works  properly output same different because its Thraed2  its work print Thraed-0 

