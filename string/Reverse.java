package string;

public class Reverse {

	public static void main(String[] args) {
		int len;
		String a="Shubham";
		String b="";
		len=a.length();
		for(int i=len-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		System.out.println(b);

	}

}
