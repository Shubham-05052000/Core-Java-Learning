package StarProram;

public class I_j_k_Star {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=5;i++) {
			for(j=1;j<5;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
