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
	
		int chice = 0;			// ���� ����
		
		while(true) {
			System.out.println(" ����������������������������������");
			System.out.println("     ���� ");
			System.out.println(" ����������������������������������");
			System.out.println("  1. 1�� �׸� ");
			System.out.println("  2. 2�� �׸� ");
			System.out.println("  3. 3�� �׸� ");
			System.out.println("  0.   ���ᡡ ");
			System.out.println(" ����������������������������������");
			System.out.print("�����ϼ��� : ");
			chice = sc.nextInt();
			
			Solution so = new Solution ();

// �������������������������������������������������������������������� if���� ���� while�� ���� �������������������������������������������������������������������� 
			if (chice >= 0 && chice <=9) {
				if (chice == 0) {
					System.out.println("�ý����� �����մϴ�.");
					break;
				} else if (chice == 1) {
					
				} else if (chice == 2) {
				
				} else if (chice == 3) {
					
				}				
			} else {
				System.out.println("�Է°��� ��Ȯ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");	// �Է°��� ���� �ʴٸ� �ٽ� �Է��� �޽��ϴ�.
			} // �Է°� if
		}	// while
	}
}
