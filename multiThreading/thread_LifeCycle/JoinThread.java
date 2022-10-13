package multiThreading.thread_LifeCycle;

class F extends Thread{
	public void run() {//run is already include thread method
		String n=Thread.currentThread().getName();//thread get method syntax
		for(int i=0;i<=3;i++) {
			System.out.println(n);
		}
	}
}
public class JoinThread {

	public static void main(String[] args) {
		F t1 = new F();
		F t2 = new F();
		F t3 = new F();
		//Create three thread 
		//setname go the the getname
		t1.setName("Thread 1");
		t2.setName("thread 2");
		t3.setName("Thread 3");
		///runs thread
		t1.start();
		t2.start();		try {
			t2.join();
		}
		catch(Exception n) {
			System.out.println(n);
		}
		t3.start();//because run is alread include thread method then use to t3.start()
		
	}

}

