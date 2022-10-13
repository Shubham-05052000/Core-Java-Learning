//area of circle =pi*r*r and value of pi=3.14
package program_question;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		int r;
		double area;
		System.out.println("Enter a radius");
		Scanner ref = new Scanner(System.in);
		r=ref.nextInt();
		area=3.14*r*r;
		System.out.println("The Area of Circle is "+area);

	}

}
