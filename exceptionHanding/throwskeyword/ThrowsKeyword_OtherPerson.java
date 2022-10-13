package exceptionHanding.throwskeyword;

public class ThrowsKeyword_OtherPerson {

	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);//1 second for loop print 
		}

	}

}
