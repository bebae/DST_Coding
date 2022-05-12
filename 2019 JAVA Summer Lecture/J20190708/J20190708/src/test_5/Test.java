package test_5;
// two integer compare
import java.util.Scanner;

public class Test {

	
	
	public static void main(String[] args){
		// local var.
		Scanner s = new Scanner(System.in);
		
		System.out.print("input a(1~10) : ");
		int a = s.nextInt();
		
		System.out.print("input b(1~10) : ");
		int b = s.nextInt();
		
		if(a==b)
			System.out.println("A and B the same as");
		else if(a>b)
			System.out.println("A="+a+" > B="+b);
		else 
			System.out.println("A="+a+" < B="+b);
	}
}
