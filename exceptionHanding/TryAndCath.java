package exceptionHanding;

public class TryAndCath {

	public static void main(String[] args) {
		//String str="shubham";//  Error 
		String str="123"; //not erreor
		try {
			int a = Integer.parseInt(str);
			System.out.println(a);
			
		}
		catch(NumberFormatException n) {
			System.out.println("NumberFormatException");
		}
		System.out.println("String number Exception");

	}

}
