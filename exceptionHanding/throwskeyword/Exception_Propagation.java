package exceptionHanding.throwskeyword;

public class Exception_Propagation {
	public static void main(String[] args) {
		
		try {
			m2();
		}
		catch(Exception a) {
		System.out.println(a);
		}
			
		//m1();
	}
	public static void m1() {
//		try {
//			m2();
//		}
//		catch(Exception a) {
//		System.out.println(a);
//		}
		
		m2();
		
	}
	public static void m2() {
//		try {
//			System.out.println(10/0);
//		}
//	catch(Exception a) {
//		System.out.println(a);
//	}
		System.out.println(10/0);
	}
	
}


//note any one method can use the tryCatch block ,eg main(), m1(), m2().