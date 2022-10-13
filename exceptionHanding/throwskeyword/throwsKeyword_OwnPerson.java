package exceptionHanding.throwskeyword;

public class throwsKeyword_OwnPerson {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000);//1 second for loop print 
			}
			catch( InterruptedException a) {
				System.out.println(" InterruptedException Own Created");
			}
		}

	}

}
