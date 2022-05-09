// 0407 #3_3
// 주사위 게임
// 중간고사에 관한 내용
package test3;
// ★ 목적 3명의 3개의 주사위 합 ★
public class Dice {
	private int[] p;
	
	// 생성자
	public Dice(){	
		p = new int[3];
	}
	
	// 주사위를 3개 굴리고 합을 배열에 저장
	public void di_gen() {
		
		int dice1 = 0; 
		int dice2 = 0;
		int dice3 = 0;
		int dice = 0;		// 3개의 주사위 합 저장 변수
		
		// 주사위를 3개 굴리고 합을 배열에 저장
		for(int i=0;i<p.length;i++) { 
			dice1 = (int)(Math.random()*6+1);
			dice2 = (int)(Math.random()*6+1);
			dice3 = (int)(Math.random()*6+1);	
			dice = dice1+dice2+dice3;
			p[i] = dice;
		}
	}
	
	/*
	 * 가장 높은 사람이 여러명일 경우
	 * 공동 우승 등으로 처리 try catch
	 * 
	 */
	
	
	// 누가 가장 높은지 비교
	public void di_win_check() {
		int max = 0;		// 3명 중 가장 높은 합
		int pos = 0;		// 가장 높은 합을 가진 사람을 찾는 배열
		
		// 누가 가장 높은지 비교
		for(int i=0;i<p.length;i++) {
			if(max<p[i]) {
				max = p[i];
				pos = i;
			}
		}
		// 3명의 주사위 합 출력
		for(int i=0;i<p.length;i++) {
			System.out.printf(" %d번의 합: %5d\n", i+1, p[i]);
		}
		System.out.printf(" Winner %d번 합: %2d\n",pos+1,max);
	}
	
	
}
