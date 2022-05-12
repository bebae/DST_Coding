package test_1;
// 1 ~ n sum
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int sum=0;
		
		System.out.print("N : ");
		int n = s.nextInt();
		
		for(int i=0;i<n+1;i++) {
			sum += i;
		}
		System.out.println("sum = "+sum);

	}

}
