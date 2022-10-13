package collection;
import java.util.ArrayList;
public class Array {
	public static void main(String[] args) {
		ArrayList<String> Name = new ArrayList<String>();
		Name.add("shubham");
		Name.add("Suraj");/// all three are insert recorderb
		Name.add("Kuldeep");
		System.out.println(Name);
		//beninning
		Name.add("Aftab");// add benning postion of array
		System.out.println(Name);
		//manual add data
		Name.add(0,"Shrivastav");  //manual add the postion 0 postion Shrivastav
		System.out.println(Name);
		// Remove Data manual
		Name.remove(1);    // remove manual postion 1 postion remove 
		System.out.println(Name);
		//Replace
		Name.set(0, "Shubham");     // replace data using set 0 shrivastav replase shubham
		System.out.println(Name);
		///only Zero postion data shows 
		System.out.println(Name.get(0));
		Name.clear();            // Array clear not delete aarrays are empty 
		System.out.println(Name);
		
	}

}
