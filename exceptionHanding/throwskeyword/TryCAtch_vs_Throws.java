package exceptionHanding.throwskeyword;

public class TryCAtch_vs_Throws{
	public static void Wait()  throws InterruptedException {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);//one second print for loop 
		}
	}
//	public static void main(String[] args) throws InterruptedException{
//		Wait();           ----------------------------------------------------------------------not use try only use throws method ------------
//	}
	
	
	public static void main(String[] args) {
		try {
			Wait();
			System.out.println(10/0); //-------------------------------------------------------use try and throws
		}
		catch(Exception n) {
			System.out.println("Execption Handling...!");
		}
	}
}
