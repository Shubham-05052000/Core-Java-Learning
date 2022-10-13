package synchronization;
class msg{
	public void show(String name) {
//		;;;;;;;;;; /// 100 Line Of Code (LOF)
		System.out.println("shubham");
		 synchronized(this) {
			 for(int i=1;i<=3;i++) {
				 System.out.println("How are you "+name);
			 }
		 }
		 ;;;;;;/// 100 Line Of Code (LOF)
	}
}
//thread class 
class OutThread extends Thread{
	msg m; //override msg class
	String name;
	OutThread(msg m, String name){// Object create class msg m and String name
		this.m=m;
		this.name=name;
	}
	public void run() {
		m.show(name);
	}
}
// main class 
public class BlockLevelSynchronization {
	public static void main(String[] args) {
		msg m = new msg();
		OutThread t1 = new OutThread(m,"shubham");
		OutThread t2 = new OutThread(m,"suraj");
		t1.start();
		t2.start();
	}

}
