package test_2;
// n°³ sum ex) 5 8 9 10 1
// random var.
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int sum=0;
		int[] x;
		
		System.out.print("N : ");
		int n = s.nextInt();
		x = new int[n];
		
		
		for(int i=0;i<n;i++) {
			x[i] = (int)(Math.random()*10+1);
			sum += x[i];
			System.out.print(x[i]+" ");
		}
		System.out.println("\nsum = "+sum);

	}

}
