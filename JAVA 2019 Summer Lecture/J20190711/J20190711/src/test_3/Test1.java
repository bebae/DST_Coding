package test_3;
// n개 sum ex) 5 8 9 10 1
// random var.
import java.util.Scanner;
public class Test1 {
	
	private int x;
	
	public Test1() {		// 생성자 필드 초기화
		this.x = (int)(Math.random()*10+1);
		System.out.print(this.x+" ");
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		System.out.print("N : ");
		int n = s.nextInt();
		
		Test1[] t = new Test1[n];
		for(int i=0;i<n;i++) {
			t[i] = new Test1();
		}
		
		int sum=0;
		for(int i=0;i<n;i++) {
			sum += t[i].x;
		}
		System.out.println("\nsum = "+sum);

	}

}
