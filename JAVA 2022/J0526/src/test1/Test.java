// 0526 #1
// È¦¼ö Â¦¼ö ¾²·¹µå Á¶ÀÎ

package test1;

public class Test {

	public static void main(String[] args) {
		
		int odd_sum = 0;
		int even_sum = 0;
		
		for (int i=0;i<100;i++) {
			if (i%2==1) odd_sum += i;
		}
		System.out.printf("odd sum = %d\n", odd_sum);
		
		
		for (int i=0;i<100;i++) {
			if (i%2==0) even_sum += i;
		}
		System.out.printf("even sum = %d\n", even_sum);
		
		int tot_sum = odd_sum + even_sum;
		System.out.printf("tot_sum =  %d\n", tot_sum);
		
	}

}
