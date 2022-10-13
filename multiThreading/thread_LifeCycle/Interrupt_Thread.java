package multiThreading.thread_LifeCycle;
class K extends Thread{
	public void run() {//run is already include thread method
		try {
			for(int i=0;i<=4;i++) {
				System.out.println("learn");
				//Thread.sleep(1000);//one second 
			}
		}
		catch(Exception n) {
			System.out.println(n);
		}
	}
}
public class Interrupt_Thread {

	public static void main(String[] args) {
		K ref = new K();
		ref.start();
		ref.interrupt();

	}

}
