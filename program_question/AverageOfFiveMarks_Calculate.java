package program_question;

import java.util.Scanner;

public class AverageOfFiveMarks_Calculate {

	public static void main(String[] args) {
		int a,b,c,d,e;
		System.out.println("Enter the Five Subject Marks");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		b=ref.nextInt();
		c=ref.nextInt();
		d=ref.nextInt();
		e=ref.nextInt();
		int sum=a+b+c+d+e;
		System.out.println("Your Total Marks is "+sum);
		double avg=sum/5.0; //double is point value because average return point(.) value than use double
		System.out.println("The Avarage of five value Subjectn " +avg);
		
	}

}
