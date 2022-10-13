package arraymethod;

import java.util.Scanner;

public class SearchElement_Array {

	public static void main(String[] args) {
		int a[]=new int[4];
		int n;
		int count =0;
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter array Element");
		for(int i=0;i<a.length;i++) {
			a[i]=ref.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("Enter Search Item");
		n=ref.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				count++;
			}
			
			
		}
		if(count>0) 
			System.out.println("Itme found " +count+" time");
		
		else 
			System.out.println("Not fount itme");
		
	}
	

}
