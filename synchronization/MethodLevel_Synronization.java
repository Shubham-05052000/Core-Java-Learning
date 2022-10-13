package synchronization;
class Bus1 implements Runnable{
	int available=2,passenger;
	Bus1(int passenger){
		this.passenger=passenger;// construction methods
	}
	public synchronized void run() {// method level synchronized they only enter one thread seat available 
		String name =Thread.currentThread().getName();
		if(available>=passenger) {
			System.out.println(name+" Reversed seat ...!");
			available=available-passenger;
		}
		else {
			System.out.println("sorry seat not available..!");
		}
	}
}
public class MethodLevel_Synronization {
	public static void main(String[] args) {
		Bus1 r =new Bus1(1);
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		//get name and setname 
		t1.setName("Shubham");
		t2.setName("Suraj");
		t3.setName("kuldeep");
		//run thread method 
		t1.start();
		t2.start();
		t3.start();
	}

}
