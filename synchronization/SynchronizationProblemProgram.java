package synchronization;
class Bank extends Thread{
	int bal =5000;
	int withdraw;
	Bank(int withdraw){
		this.withdraw=withdraw;
	}
	public synchronized void run() {
		String name = Thread.currentThread().getName();
		if(withdraw>=bal) {
			System.out.println(name+" your money Withdraw..Thank You.....!");
		}
		else {
			System.out.println("Sorrry Insufficent Balance...!");
		}
	}
}
public class SynchronizationProblemProgram {

	public static void main(String[] args) {
		Bank obj = new Bank(5000);
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		//setname And getname
		t1.setName("shubham");
		t2.setName("Rani");
		//this code prporely work but 2 obj create answer is wrong
		Bank obj2 = new Bank(5000);
		Thread t3 = new Thread(obj2);
		Thread t4 = new Thread(obj2);
		//setname And getname
		t3.setName("Suraj");
		t4.setName("Raniiiiii");
		//start run method thread
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//all are withdraw then using static synchronized
	}

}
