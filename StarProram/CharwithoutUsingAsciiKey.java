package StarProram;

public class CharwithoutUsingAsciiKey {

	public static void main(String[] args) {
		char i,j;
		for(i='A';i<='E';i++) {//65=A,66=B,67=C this is Acii Value
			for(j='A';j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}

	}

}
