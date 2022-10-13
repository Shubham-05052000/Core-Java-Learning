package synchronization;
class Bus implements Runnable{
	int available=1,passenger;
	Bus(int passenger){
		this.passenger=passenger;// construction methods
	}
	public void run() {
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
public class MultithreadingWithout_Synronization {

	public static void main(String[] args) {
		Bus r =new Bus(1);
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
// all three are travel in the bus .. but bus seat only one how can travel 3 person answer is wrong
// these problem solve to included synchronization 
// there are two type of synchronization 

