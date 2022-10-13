package exceptionHanding;

public class NumberformatExecption {
	public static void main(String[] args) {
		//String str ="Shubham";//converted into interger output:String Shubham cannot be converted to interger
		String str ="7628";//output 7628
		try {
			int a = Integer.parseInt(str);
			System.out.println(a);
		}
		catch(Exception n) {
			System.out.println("String "+str+" cannot be converted to interger ");
		}
	}
}
