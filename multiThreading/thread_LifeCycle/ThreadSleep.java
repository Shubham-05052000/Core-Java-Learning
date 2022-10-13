package multiThreading.thread_LifeCycle;
class E extends Thread{
	public void run() {//run is already include thread method
		try {
			for(int i=0;i<=4;i++) {
				System.out.println("learn");
				Thread.sleep(1000);//one second 
			}
		}
		catch(Exception n) {
			System.out.println(n);
		}
	}
}
public class ThreadSleep {
	public static void main(String[] args)throws InterruptedException{
		E ref = new E();
		ref.start();//run is already include thread method then its satrt method works
		for(int i=0;i<=5;i++) {
			System.out.println("Main method");
			Thread.sleep(1000);//one seconds
		}
	}

}
