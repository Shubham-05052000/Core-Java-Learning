package operators;

public class Logical {
public static void main(String[] args) {
	//And operators
	System.out.println("Logical and");
	System.out.println((10<20) && (10>5));//if both true ans true
	System.out.println((10<20) && (10<5));//if any one false ans false 
	System.out.println((10>20) && (10>5));//if both false ans false
	System.out.println("Logical OR");
	System.out.println((10<20) || (10>5));//if both true ans True
	System.out.println((10<20) || (10<5));//if any one true ans True 
	System.out.println((10>20) || (10<5));//if both false ans false
	System.out.println("Logical Not");
	System.out.println(!(10<20));//false
	System.out.println(!(10>20));//True
	
}
}
