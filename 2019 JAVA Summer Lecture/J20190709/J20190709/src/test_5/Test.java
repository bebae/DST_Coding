package test_5;
import java.util.Scanner;
// looping x~y
public class Test {

	public Test() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("X : ");
		int x = s.nextInt();
		System.out.print("Y : ");
		int y = s.nextInt();
		
		hap(x,y);		// method overloading
		hap(y);			// method
		
	}
	
	public void hap(int x, int y) {
		
		int sum = 0;
		
		for(int i=x;i<y;i++) {
			sum += i;
		}
		
		System.out.println("X    Y");
		System.out.println(x+" ~ "+y+"  sum = "+sum);
	}
	
	public void hap(int y) {
		
		int sum = 0;
		
		for(int i=1;i<y;i++) {
			sum += i;
		}
		
		System.out.println("X    Y");
		System.out.println("1 ~ "+y+"  sum = "+sum);
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
	
	}
}
