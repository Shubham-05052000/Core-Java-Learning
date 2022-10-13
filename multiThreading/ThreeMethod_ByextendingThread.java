package multiThreading;
class C extends Thread{
	public void run() {//run is already include thread method
		try {
			for(int i=0;i<=5;i++) {
				System.out.println("learn java");
				Thread.sleep(1000);//one seconds 
			}
		}
		catch(InterruptedException n) {
			System.out.println(n);
		}
	}
}
public class ThreeMethod_ByextendingThread {

	public static void main(String[] args)throws InterruptedException
 {
		C ref = new C();
		ref.start();//run is already include thread method then its satrt method works
		for(int i=0;i<=5;i++) {
			System.out.println("main method");
			Thread.sleep(1000);//one seconds //.sleep include then exception Handing Perform both method thread and main method
		}
		
	}

}
