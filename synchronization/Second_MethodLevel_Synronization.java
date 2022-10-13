package synchronization;
class Table{
	public synchronized void PrintTable(int n) {///at a time one t1 because its   synchronized method level
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
	}
}
class Thread1 extends Thread{
	Table t;// Override Table class
	Thread1(Table t){
		this.t=t;// t is object part Thread1
	}
	public void run() {
		t.PrintTable(5);
	}
}
class Thread2 extends Thread{
	Table t;// Override Tble Class 
	Thread2(Table t){ // Object Create Thread2
		this.t=t;
	}
	public void run() {
		t.PrintTable(7);
	}
}
public class Second_MethodLevel_Synronization {

	public static void main(String[] args) {
		Table r = new Table();
		Thread1 t1 = new Thread1(r);
		Thread2 t2 = new Thread2(r);
		t1.start();
		t2.start();
	}

}
