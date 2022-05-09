// 0407 #1 
// 행운권 추첨
// 중간고사에 관한 내용
package test1;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 상품의 갯수 입력
		System.out.print("상품개수 입력 : ");
		int count = sc.nextInt();			// 상품 갯수 저장
		int[] luck_no = new int[count];		// 갯수만큼 배열
		int guest_num = 0;	// 고객 수
		int lotto = 0;		// 뽑은 번호
		boolean ok = false;	// 당첨 여부
		int max = 0;		// 당첨 숫자 중 가장 큰 수
		
		// 상품 갯수만큼 당첨숫자 지정
		for(int i=0;i<luck_no.length;i++) {
			luck_no[i] = (int)(Math.random()*100+1);
			if(max < luck_no[i]) max = luck_no[i];	//당첨 숫자 중 가장 큰 수를 저장
			System.out.printf("%d, ", luck_no[i]);
		}
		System.out.println("");					//보기좋게 줄바꿈
		
		// 추첨
		while(count > 0) {
			guest_num++;						// 고객 입장
			lotto = 0;							// 번호 초기화
			lotto = (int)(Math.random()*100+1);	// 번호 뽑기
			
			// 뽑은 번호 당첨확인
			ok = false;							//고객의 당첨 여부를 초기화
			for(int i=0;i<luck_no.length;i++) {
				if(lotto == luck_no[i]) {		//당첨
					count--;					//상품 갯수 감소
//					System.out.println(" ────── 당첨됐습니다! ────── ");
					ok = true;					//이 고객이 당첨됨을 저장
					luck_no[i]=0;				//이미 당첨된 번호는 제외함
					break;
				}
			}
			if(ok == false){					// 당첨 여부에 따라 문장 출력
				System.out.printf(" %3d번 손님은 다음 기회에\n", guest_num);
			}else if (ok == true) {
				System.out.printf(" %3d번 손님께서 당첨되셨습니다.\n", guest_num);
				if(lotto == max) {
					System.out.printf(" ────── %d번 소렌토 당첨! ────── \n", lotto);
				} else {
					System.out.println("     헤어드라기 당첨!   ");
				}
			}else {
				System.out.println("ERROR");
			}
		}	//while
		System.out.println("─────────────────────────");
		System.out.printf(" %d명의 손님이 방문하셨습니다. \n", guest_num);
		System.out.println("─────────────────────────");
	}	//main
	
}
