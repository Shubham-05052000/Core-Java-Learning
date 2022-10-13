package exceptionHanding;

public class NestedFinally_Block {

	public static void main(String[] args) {
		try {
			String a=null;
			//String a = "shubham";
			System.out.println(a.toUpperCase());//stm1
		}
		catch(NullPointerException a) {
			System.out.println("NullPointerException");//stm2
		}
		finally {
			System.out.println("Finally block");//stm3
			try {
				//System.out.println(10/2);//stm4
				System.out.println(10/0);
			}
			catch(ArithmeticException b){
				System.out.println("ArithmeticException");//stm5
			}
			finally {
				System.out.println("lear java ");//stm6
			}
		}
		System.out.println("End of program ");//stm7

	}

}

//Case 1 = no array   
//out put==
//SHUBHAM
//Finally block
//5
//lear java 
//End of program

//case 2= stm4 error
//SHUBHAM
//Finally block
//ArithmeticException
//lear java 
//End of program 

//case 3= stm1 and stm 4 error 
//NullPointerException
//Finally block
//ArithmeticException
//lear java 
//End of program 

