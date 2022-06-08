
package J20220602;
import java.util.Scanner;

public class Luck extends Thread {

	private int[] luck_no;	// 당첨 번호 배열
	private int count;	// 상품 갯수 
	private int guest_num;	// 고객 수
	
	// 생성자
	public Luck() {
		Scanner sc = new Scanner(System.in);
		count = 0;
		guest_num = 0;
		
		// 상품의 갯수 입력
		System.out.print("상품개수 입력 : ");
		count = sc.nextInt();			// 상품 갯수 저장
		luck_no = new int[count];		// 갯수만큼 배열
		
	}
		// 당첨 번호 생성 메소드
	public void run() {
		int max = 0;		// 당첨 숫자 중 가장 큰 수
		int lotto = 0;		// 뽑은 번호
		boolean ok = false;	// 당첨 여부
		guest_num = 0;		// 고객 수
		
		// 상품 갯수만큼 당첨숫자 지정
		System.out.print("당첨 번호 : ");
		for(int i=0;i<luck_no.length;i++) {
			luck_no[i] = (int)(Math.random()*100+1);
			if(max < luck_no[i]) max = luck_no[i];	//당첨 숫자 중 가장 큰 수를 저장
			System.out.printf("%d, ", luck_no[i]);
		}
		System.out.println("");	
		

	// 당첨자 체크
		// 추첨
		while(true) {
			guest_num++;						// 고객 입장
			lotto = 0;							// 번호 초기화
			lotto = (int)(Math.random()*100+1);	// 번호 뽑기
			
			// 뽑은 번호 당첨확인
			ok = false;							//고객의 당첨 여부를 초기화
			for(int i=0;i<luck_no.length;i++) {
				if(lotto == luck_no[i]) {		//당첨
					count--;					//상품 갯수 감소
					ok = true;					//이 고객이 당첨됨을 저장
					luck_no[i]=0;				//이미 당첨된 번호는 제외함
					break;
				}
			}
			if(ok == false){					
				System.out.printf(" %3d번 손님은 다음 기회에\n", guest_num);
			}else if (ok == true) {
				if(lotto == max) {
					System.out.println("────────────────────────────────────────────");
					System.out.printf(" %3d번 손님께서 자동차 당첨! 당첨번호:%d \n", guest_num, lotto);
					System.out.println("────────────────────────────────────────────");
					break;
				} else {
					System.out.printf(" %3d번 손님께서 상품권에 당첨되셨습니다.\n", guest_num);
				}
			}
		}	//while	
	}

	public int getwinner() {
		return this.guest_num;	
	}
	

	
}
