/* 20220509 ���� ����� ������ ���� �����Դϴ�.
 * ��� ���� N���� ���簢���� �����ְ�, ���簢���� �� ���� x��, y�࿡ �����ϴ�.(���簢�� �̿��� �簢���� ����.)
 * ������ ���簢���� ���� �Ʒ� ��ǥ(x1, y1)�� ������ �� ��ǥ(x2, y2)�� ������, (x1, y1, x2, y2)�� ��Ÿ����.
 * �� ���簢���� ���� �������� �� ���� �� ���簢������ �����ϴ� ������ ������ ���϶�
 * ���� ����
 * ���簢���� N : 1 <= N <= 100000
 * ���簢���� ��ǥ x1 >= 0, y1 >= 0, x2 <= 109, y2 <= 109 
 */
package rectangle_area;

import java.util.Scanner;

public class Main {
	
		/* ù ���������� �� ���������� ��ȯ���� ���鼭 boolean �迭�� true ���� �־��ش�.
		 * ��ġ�� �κ��� ������ true�̱� ������ �ߺ��� �߻����� �ʴ´�.	
		 * 	���������� true�� ���� ������ �����ش�. 
		 */
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			boolean[][] arr = new boolean[110][110];
			// ��ü ��ǥ ũ���� �迭
			
			int x1, y1, x2, y2;		// ���簢�� ��ǥ
			int N = 0;				// ���簢�� ����
			int total = 0;
			
			while (true) {
				System.out.print("���簢���� ���� :");
				N = sc.nextInt();
				// ���簢�� ����
				if(N > 0 && N <= 10000)	break;
				System.out.println("���簢�� ������ �Է¹����� 1~100000 �Դϴ�.");
				// ���簢�� ������ ���ѿ� ���� ������ �ٽ� �Է��մϴ�.
			}
			
	        for(int i=0; i<N; i++){
	        	// ���� ���簢���� ������ŭ �ݺ��մϴ�.
	        	System.out.print("X1 :");
	            x1 = sc.nextInt();
	            System.out.print("Y1 :");
	            y1 = sc.nextInt();
	            System.out.print("X2 :");
	            x2 = sc.nextInt();
	            System.out.print("Y2 :");
	            y2 = sc.nextInt();
	            System.out.println("������������������������");
	            // ���簢���� ��ǥ�� �޾� ��ü ũ���� �迭�� true���� ä��ϴ�.
	            
	            for(int j = y1; j<y2; j++){
	            // y1 ���� y2���� true���� ä��ϴ�.
	                for(int k = x1; k<x2; k++){
	                // x1 ���� x2���� true���� ä��ϴ�.
	                    arr[j][k] = true;
	                }
	            }
	            // for���� �̿��Ͽ� ��ü��ǥ�迭�� ���� ���� ���簢���� ��ǥ�� true�� ǥ���մϴ�. 
	            // ���� ��ǥ���� ��ģ���ص� �̹� �� �ڸ��� true ������ ǥ�õǾ� �־� �ߺ����� �ʽ��ϴ�.
	        }
	 
	        for(int j = 0; j<110; j++){
	        	for(int k = 0; k<110; k++){
	        	// ��ü ��ǥ �迭�� �о true�� => ���簢���� ��ħ�� ������� ��ü ���̸� ���մϴ�.
	        		if(arr[j][k]==true){
	        			total++;
	                }
	            }
	        }
	 
	        System.out.println(total);
	    }// static void main

} // class main
