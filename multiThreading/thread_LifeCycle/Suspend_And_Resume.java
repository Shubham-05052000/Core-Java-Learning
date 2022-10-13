package multiThreading.thread_LifeCycle;
class G extends Thread{
	public void run() {
		String n=Thread.currentThread().getName();//thread get method syntax
		for(int i=0;i<=3;i++) {
			System.out.println(n);
		}
	}
}
public class Suspend_And_Resume {

	public static void main(String[] args) {
		//object create
		G t1 = new G();
		G t2 = new G();
		G t3 = new G();
		//get name & setNAme
		t1.setName("Thread");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		//run
		t1.start();// beacuse run is already inculde thread method
		t2.suspend();//its stop pause 
		t2.resume();//restart thread 
		t3.start();
		
	}

}
//not works  properly output same different because its Stop t2 but not start then output show wrong 
// why its shows wrong because its "Suspend() & resume() is old verision of java thread method then its wrong output
