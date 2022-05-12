package test_4;
// n = 5 ex) 6 8 0 9 8
// infinite loop  random y
// sum = 0 될 때 까지 
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int sum=0;
		int[] x;
		int y=0;
		
		System.out.print("N : ");
		int n = s.nextInt();
		x = new int[n];
		
		
		for(int i=0;i<n;i++) {
			x[i] = (int)(Math.random()*100+1);
			sum += x[i];
			System.out.print(x[i]+" ");
		}
		System.out.println(" sum = "+sum);
		
		int count=0;
		while(sum>0) {
			y = (int)(Math.random()*100+1);
			for (int i=0;i<n;i++) {
				if(x[i] == y) {
					x[i] = 0;
					count++;
				}
	
			}
			
			sum = 0;				// 중요<<<<<<<<<<<<<<<
			for (int i=0;i<n;i++) {
				sum += x[i];
				System.out.print(x[i]+" ");
				
			}
			System.out.println("sum ="+sum);
		} // whill
		System.out.println("count:"+count);
	}

}
