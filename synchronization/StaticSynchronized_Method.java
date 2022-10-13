package synchronization;
class Bank1 extends Thread{
	static int bal=5000;
	static int withdraw;
	Bank1(int withdraw){
		this.withdraw=withdraw;
	}
	public static synchronized void pass() {
		String name = Thread.currentThread().getName();
		if(withdraw>=bal) {
			System.out.println(name+" your money Withdraw..Thank You.....!");
		}
		else {
			System.out.println("Sorrry Insufficent Balance...!");
		}
	}
	public void run() {
		pass();// override 
	}
}
public class StaticSynchronized_Method {

	public static void main(String[] args) {
		Bank1 obj = new Bank1(5000);
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		//setname And getname
		t1.setName("shubham");
		t2.setName("Rani");
		//Work properly because using static synchronized 
		Bank1 obj2 = new Bank1(5000);
		Thread t3 = new Thread(obj2);
		Thread t4 = new Thread(obj2);
		//setname And getname
		t3.setName("Suraj");
		t4.setName("Raniiiiii");
		//start run method thread
		t1.start();
		t2.start();
	}

}
