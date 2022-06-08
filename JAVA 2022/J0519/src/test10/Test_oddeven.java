// 0519 #10 
// ±¸°£ÀÇ È¦Â¦ÀÇ ÇÕ

package test10;

public class Test_oddeven {
	

	public static void main(String[] args) {
		
		int odd_sum = 0;
		int even_sum = 0;
		// È¦¼ö 
		for (int i=0;i<100;i++) {
			if (i%2 == 1) {
				odd_sum += i;
			}
		}
		System.out.println("odd sum = "+odd_sum);
		for (int i=0;i<100;i++) {
			if (i%2 == 0) {
				even_sum += i;
			} 
		}
		System.out.println("even sum = "+even_sum);
	}		
}
