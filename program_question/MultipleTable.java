//logic input 6
//6*1=
//6*2=
//...

package program_question;

import java.util.Scanner;

public class MultipleTable {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter your Age ");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		for(int i=1;i<=10;i++) {
			//a=a*i; convert into print next line
			System.out.println(a+"*"+i+"="+a*i);
		}
	}

}
