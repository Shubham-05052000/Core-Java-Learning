package exceptionHanding;

public class NullPointExecption {
	public static void main(String[] args) {
		//String name ="shubham";//SHUBHAM
		String name = null; //nullpointException
		try {
			System.out.println(name.toUpperCase());
		}
		catch(Exception n) {
			System.out.println("nullpointException");
		}
	}
}
