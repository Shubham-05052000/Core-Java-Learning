package decisition_making;

import java.util.Scanner;

public class if_else {
public static void main(String[] args) {
	int n;
	System.out.println("Enter a number");
	Scanner ref =new Scanner(System.in);
	n = ref.nextInt();
	if(n>=0) {
		System.out.println("postive number");
	}
	else {
		System.out.println("Negative number");
	}
}
}
