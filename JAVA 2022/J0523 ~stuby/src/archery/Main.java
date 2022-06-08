package archery;

import java.util.Scanner;

class Solution {
    static int[] res = { -1 };
    static int[] lion;
    static int max = -1000;
    
    public void dfs(int[] info, int cnt, int n) {
        if(cnt == n+1) {
            int apeach_point = 0;
            int lion_point = 0;
            for(int i = 0; i <= 10; i++) 
            {
                if(info[i] != 0 || lion[i] != 0) {
                    if(info[i] < lion[i]) 
                        lion_point += 10 - i;
                    else 
                        apeach_point += 10 - i;
                }
            }
            if(lion_point > apeach_point) {
                if(lion_point - apeach_point >= max)
                {
                    res = lion.clone();
                    max = lion_point - apeach_point;
                }
            }
            return ;
        }
        for(int j = 0; j <= 10 && lion[j] <= info[j]; j++) {
            lion[j]++;
            dfs(info, cnt + 1, n);
            lion[j]--;
        }
    }
    
    public int[] solution(int n, int[] info) {
        lion = new int[11];
        dfs(info,1,n);
        return res;
    }
}


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int chice = 0;			// 선택 변수
		
		while(true) {
			System.out.println(" ─────────────────");
			System.out.println("     제목 ");
			System.out.println(" ─────────────────");
			System.out.println("  1. 1번 항목 ");
			System.out.println("  2. 2번 항목 ");
			System.out.println("  3. 3번 항목 ");
			System.out.println("  0.   종료　 ");
			System.out.println(" ─────────────────");
			System.out.print("선택하세요 : ");
			chice = sc.nextInt();
			
			Solution so = new Solution ();

// ────────────────────────────────── if문을 통한 while문 종료 ────────────────────────────────── 
			if (chice >= 0 && chice <=9) {
				if (chice == 0) {
					System.out.println("시스템을 종료합니다.");
					break;
				} else if (chice == 1) {
					
				} else if (chice == 2) {
				
				} else if (chice == 3) {
					
				}				
			} else {
				System.out.println("입력값이 정확하지 않습니다. 다시 입력해주세요.");	// 입력값이 맞지 않다면 다시 입력을 받습니다.
			} // 입력값 if
		}	// while
	}
}
