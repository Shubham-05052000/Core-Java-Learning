package multiThreading;

class D implements Runnable{
	public void run() {//run is already include thread method
		for(int i=0;i<=5;i++) {
			System.out.println("learn java");
			//Thread.sleep(1000);//one seconds 
		}
	}
}
public class ByImplementing_Runnable_Interface {

	public static void main(String[] args) {
		D ref = new D();
		Thread t = new Thread(ref);
		t.start();//run is already include thread method then its satrt method works
		for(int i=0;i<=5;i++) {
			System.out.println("main method"); 
		}
		

	}

}
