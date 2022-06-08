
package J20220602;
public class Dice extends Thread {
	private int[] p;
	private int i;
	private int pos;			// 가장 높은 합을 가진 사람
	
	// 생성자
	public Dice(){	
		p = new int[5];		// 고객정보
		i = 0;
		pos = 0;
	}
	
	// 주사위를 3개 굴리고 합을 배열에 저장
	public void run() {
		
		int dice1 = 0; 
		int dice2 = 0;
		int dice3 = 0;
		int dice4 = 0;
		int dice5 = 0;
		int dice_sum = 0;		// 5개의 주사위 합 저장 변수
		int max = 0;			// 3명 중 가장 높은 합
		
		

		while(true) {
			for(i=0;i<p.length;i++) { 
				dice1 = (int)(Math.random()*6+1);
				dice2 = (int)(Math.random()*6+1);
				dice3 = (int)(Math.random()*6+1);
				dice4 = (int)(Math.random()*6+1);
				dice5 = (int)(Math.random()*6+1);
				dice_sum = dice1+dice2+dice3+dice4+dice5;
				p[i] = dice_sum;
				// System.out.printf(" %d번의 결과: %d %d %d %d %d\n", i+1, dice1,dice2,dice3,dice4,dice5);
				// 너무 많이 출려됨
			}
			if (p[0] == 30 || p[1] == 30 || p[2] == 30 || p[3] == 30 || p[4] == 30) {
				break;							// 쓰레드 정지 조건
			}
			
		}
		
		// 누가 가장 높은지 비교
			for(i=0;i<p.length;i++) {
				if(max<p[i]) {
					max = p[i];
					pos = i;
				}
			}
			// 5명의 주사위 합 출력
			System.out.println("────────────────────────────────────────────");
			for(i=0;i<p.length;i++) {
				System.out.printf(" %d번의 합: %5d\n", i+1, p[i]);
			}
			System.out.printf("  Dice 최고의 우승자는 %d번 고객입니다!\n",pos+1);
			System.out.println("────────────────────────────────────────────");
	}
	
	public int get_winner() {
		return pos+1;
	}
	
	
}














