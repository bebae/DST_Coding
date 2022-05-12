package test_4;
import java.util.Scanner;
// looping x~y
public class Test {

	public static void main(String[] args) {
		int x, y;
		int sum = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("X : ");
		x = s.nextInt();
		System.out.print("Y : ");
		y = s.nextInt();
		
		for(int i=x;i<y;i++) {
			sum += i;
		}
		
		System.out.println("X    Y");
		System.out.println(x+" ~ "+y+"  sum = "+sum);
		
	
	}
}
