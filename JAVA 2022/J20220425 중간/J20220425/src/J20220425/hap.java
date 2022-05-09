package J20220425;
import java.util.Scanner;

public class hap {
	
	public void t_hap() {
		Scanner sc = new Scanner(System.in);
		String Jul = "─────────────────────────────────────────";
		
		int x = 0;
		int y = 0;
		int e_hap = 0;
		int o_hap = 0;
 		
		
		
		System.out.print("X를 입력하세요 :");
		x = sc.nextInt();
		System.out.print("Y를 입력하세요 :");
		y = sc.nextInt();
		
		if(x > y) {
			for(int i=y; i<x+1;i++) {
				if(i%2==0) {
					e_hap += i;
				} else {
					o_hap += i;
				}
			} 
		} else {
			for(int i=x; i<y+1;i++) {
				if(i%2==0) {
					e_hap += i;
				} else {
					o_hap += i;
				}
			} 
		}
		
		
		
		
		// 출력
		System.out.printf("\n %s \n", Jul);
		System.out.printf("  %d 부터 %d까지 홀수의 합은 : %d입니다.\n",x,y,o_hap);
		System.out.printf("  %d 부터 %d까지 짝수의 합은 : %d입니다.\n",x,y,e_hap);
		System.out.printf(" %s \n", Jul);
		
	}
}
