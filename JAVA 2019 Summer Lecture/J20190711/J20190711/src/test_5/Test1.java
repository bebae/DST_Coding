package test_5;
// n�� sum ex) 5 8 9 10 1
// random var.
import java.util.Scanner;
public class Test1 {
	
	private int x;			// member var. data feild ĸ��(��ȣ)
	
	public Test1() {		// ������ �ʵ� �ʱ�ȭ
		this.x = (int)(Math.random()*30+70);
		System.out.print(this.x+" ");
	}
	public int get() {
		return this.x;
	}
	public void reset() {
		this.x = 0;
	}
	
	public void Win() {
		
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
			sum += t[i].get();
		}
		System.out.println("\nsum = "+sum);

		int count=0;		// clear count
		while(sum > 0) {
			int y = (int)(Math.random()*100+1);		// lucky number
			for(int i=0;i<n;i++) {
				if(t[i].get()==y) {		// t[i].x �񺸾���
					t[i].reset();
					count++;
				}
			}
			
			sum = 0;					// �߿�<<<<<<<<<<<<<<<<<<
			int sum2=0;					// ���� sum���� �� ����� sum�� ������ ������� �ʴ´�!
			for(int i=0;i<n;i++) {
				sum += t[i].get();
			
				System.out.print(t[i].get()+" ");
			}
			sum2=sum;
			System.out.println(" sum = "+sum);
		}
		System.out.println("count : "+count);
	}

}
