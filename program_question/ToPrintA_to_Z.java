package program_question;
//A B C D E...........Z to print 
public class ToPrintA_to_Z {
	public static void main(String[] args) {
		System.out.println("Captial alphabate");
		for(char i='A';i<='Z';i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println("small alphabate");
		for(char i='a';i<='z';i++) {
			System.out.print(i+ " ");
		}
	}

}
