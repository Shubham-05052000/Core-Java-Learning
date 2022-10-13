package exceptionHanding;

public class TryCAtchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("learn java"); //stm 1
			//int a=10, b=2,c;
			int a=10, b=0,c;
			c=a/b;
			System.out.println(c); //stm2 
			System.out.println("like java"); //stm3
		}
		catch(NullPointerException n) {
			System.out.println(n); //stm4
		}
		finally {
			System.out.println("study java");
			//System.out.println(10/0);//stm5
		}
		System.out.println("shsre"); //stm6
	}

}
