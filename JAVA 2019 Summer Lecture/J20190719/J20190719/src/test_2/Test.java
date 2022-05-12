package test_2;

//Generic <T> List
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {

		ArrayList<String> p = new ArrayList<String>();
		p.add("hellow");
		p.add("1212");
		p.add("000");
		p.add("test");
		
		System.out.println(p.get(0));
		System.out.println(p.size());
//		System.out.println(p.remove(0));
		System.out.println(p.size());
//		System.out.println(p.remove("000"));
		System.out.println(p.size());
		System.out.println(p.contains("000"));
		
		
		
		
	}


}
