package multiThreading;
class F extends Thread{
	public void run() {//run is already include thread method
		String n = Thread.currentThread().getName();//thread get method syntax
		for(int i=0;i<=3;i++) {
			System.out.println(n);
		}
	}
}
public class Thread_Schedular {

	public static void main(String[] args) {
		F ref1 = new F();
		//ref.start();//by default thread-0 print
		F ref2 = new F();
		F ref3 = new F();
		//refer to CurrentThread() & getName
		ref1.setName("Thread 1");
		ref2.setName("Thread 2");
		ref3.setName("Thread 3");
		//start the thread
		ref1.start();//run is already include thread method then its satrt method works
		ref2.start();//run is already include thread method then its satrt method works
		ref3.start();//run is already include thread method then its satrt method works
		System.out.println("Main method");
		
	}

}
//output readonmly answer there are three face of answer 
//first Come First services(FCFS);
//(Sort Job First);
//Round Robin