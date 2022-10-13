package exceptionHanding.throwskeyword;

class  InvalidAgeException extends Exception{// call throw new  InvalidAgeException("Not eligible vote because you are not 18 +");
	
	InvalidAgeException(String msg){
		System.out.println(msg);
	}
}
public class Throw_vs_Throws_vs_TryCatch {

	public static void main(String[] args) {
		try{
			Vote(10);
		}
		catch(Exception n) {
			System.out.println(n);
		}
	}
	public static void Vote(int age) throws InvalidAgeException { //// call throw 
		if(age<18) {
			throw new  InvalidAgeException("Not eligible vote because you are not 18 +");
		}
		else {
			System.out.println("eligible vote because you age is  greater than 18+");
		}
	}

}
