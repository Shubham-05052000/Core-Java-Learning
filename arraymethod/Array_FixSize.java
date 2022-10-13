package arraymethod;

public class Array_FixSize {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//a[5]=60;    error because array size is fix 
		//for(int i=0;i<5;i++)      i<4 its right because array Size
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		

	}

}
