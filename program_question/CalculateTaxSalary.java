//salar<100 =no tax
//salary>200 & salary>500 = 10% tax
// salary>1000 =20% tax


package program_question;

import java.util.Scanner;

public class CalculateTaxSalary {

	public static void main(String[] args) {
		int a;
		double tax;
		System.out.println("Enter your Age ");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		if(a<100)
		{
			System.out.println("No tax your are Happy Baby");
		}
		else if(a>100 && a<500)
		{
			tax=a*0.10;
			System.out.println(a+"You pay only 10% tax " +tax);
		}
		else {
			System.out.println("Your are Rich person Give me all Salary");
		}
		

	}

}
