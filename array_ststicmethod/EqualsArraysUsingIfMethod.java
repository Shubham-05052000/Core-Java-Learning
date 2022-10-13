package array_ststicmethod;

import java.util.Arrays;

public class EqualsArraysUsingIfMethod {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,30,40,50};
		if(Arrays.equals(a,b)) {
			System.out.println("Both Are equals");
		}
		else {
			System.out.println("not equals ");
		}

	}

}
