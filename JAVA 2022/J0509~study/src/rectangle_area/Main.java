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
	
	static Scanner sc = new Scanner(System.in);
	static private String Jul = "��������������������������������������������������";
	
	// ���簢���� ������ �Է¹޴� �Լ�
	public int square_input() {
		int N = 0;				// ���簢�� ����
		while (true) {
			System.out.println(Jul);
			System.out.print(" ���簢���� ���� :");
			N = sc.nextInt();
			// ���簢�� �Է� ���� ����
			if(N > 0 && N <= 10000)	break; 
			System.out.println("���簢�� ������ �Է¹����� 1~100000 �Դϴ�.");
			// ���簢�� ������ ���ѿ� ���� ������ �ٽ� �Է��մϴ�.
		}
		return N;
	}
	
	// ���簢���� ��ǥ�� �Է¹޾Ƽ� �����ϴ� �Լ�
	public void rectangle_array(int N,int mode,int num) {	// (�簢���� ����, ������ �ڵ��� �����ϴ� ����,�迭 ó�� ���� ����)
		
		/* ù ���������� �� ���������� ��ȯ���� ���鼭 boolean �迭�� true ���� �־��ش�.
		 * ��ġ�� �κ��� ������ true�̱� ������ �ߺ��� �߻����� �ʴ´�.	
		 * 	���������� true�� ���� ������ �����ش�. 
		 */
		// ��ü ��ǥ ũ���� �迭
		boolean[][] arr_bool = new boolean[110][110];
		int[][] arr_int = new int[110][110];
		
		
		int x1=0, y1=0, x2=0, y2=0;		// ���簢�� ��ǥ
		int total = 0;			// ���簢�� ���� ����
		int temp = 0;			// �ӽ� ����
		
		 for(int i=0; i<N; i++){		// ���� ���簢���� ������ŭ �ݺ��մϴ�.
			// ���������������������������������������������������������������� ���� mode ���� ���� ó�� �κ� ��������������������������������������������������������������
			if (mode == 1 || mode == 3) {			// ���� = manual
	        	System.out.print("X1 :");
	            x1 = sc.nextInt();
	            System.out.print("Y1 :");
	            y1 = sc.nextInt();
	            System.out.print("X2 :");
	            x2 = sc.nextInt();
	            System.out.print("Y2 :");
	            y2 = sc.nextInt();
	            System.out.println(Jul);
	            // ���簢���� ��ǥ�� �޾� ��ü ũ���� �迭�� true���� ä��ϴ�.
		        
			} else if (mode == 2 || mode == 4) {		// �ڵ� = automatic
				if (i <= 1) {
					x1 = (int)(Math.random()*10);
					y1 = (int)(Math.random()*10);
					x2 = (int)(Math.random()*10+10);
					y2 = (int)(Math.random()*10+10);
				} else if (i <= 3) {
					x1 = (int)(Math.random()*10+30);
					y1 = (int)(Math.random()*10+30);
					x2 = (int)(Math.random()*10+45);
					y2 = (int)(Math.random()*10+45);
				} else if (i <= 5) {
					x1 = (int)(Math.random()*10+10);
					y1 = (int)(Math.random()*10+30);
					x2 = (int)(Math.random()*10+50);
					y2 = (int)(Math.random()*10+70);
				} else if (i <= 7) {
					x1 = (int)(Math.random()*20+80);
					y1 = (int)(Math.random()*10+30);
					x2 = (int)(Math.random()*10+45);
					y2 = (int)(Math.random()*10+45);
				}  else if (i >= 10) {
					x1 = (int)(Math.random()*70);
					y1 = (int)(Math.random()*70);
					x2 = (int)(Math.random()*50+60);
					y2 = (int)(Math.random()*50+60);
				}
			} else {
				System.out.println(" MODE ERROR");
			}
			
			// x1, x2 �� y1, y2�� ũ�� üũ
			if (x1 > x2) {
				temp = x2;
				x2 = x1;
				x1 = temp;
			}
			if (y1 > y2) {
				temp = y2;
				y2 = y1;
				y1 = temp;
			}
			
			
			// ���������������������������������������������������������������� boolean ó�� �κ� ��������������������������������������������������������������
			if (num == 1) {
				 for(int j = y1;j<y2; j++){
		        // y1 ���� y2���� true���� ä��ϴ�.
		            for(int k = x1;k<x2; k++){
		            // x1 ���� x2���� true���� ä��ϴ�.
		                arr_bool[j][k] = true;
		            }
		        }
		        // for���� �̿��Ͽ� ��ü��ǥ�迭�� ���� ���� ���簢���� ��ǥ�� true�� ǥ���մϴ�. 
		        // ���� ��ǥ���� ��ģ���ص� �̹� �� �ڸ��� true ������ ǥ�õǾ� �־� �ߺ����� �ʽ��ϴ�.
		 
		        for(int j = 0; j<110; j++){
		        	for(int k = 0; k<110; k++){
		        	// ��ü ��ǥ �迭�� �о true�� => ���簢���� ��ħ�� ������� ��ü ���̸� ���մϴ�.
		        		if(arr_bool[j][k]==true)
		        			total++;
		            }
		        }
		    // �� boolean �迭 ó��
		    // ���������������������������������������������������������������� int ó�� �κ� ��������������������������������������������������������������
	        } else if (num == 2) {
	        	for(int j = y1;j<y2;j++) {
	        		for(int k = x1;k<x2; k++){
	        			// ���� ��ǥ�� �迭�� +1�� ���մϴ�.
	        			arr_int[j][k] += 1;
	        		}
	        	}
	        	for(int j = y1;j<y2;j++) {
	        		for(int k = x1;k<x2; k++){
	        			if(arr_int[j][k] != 0) 
	        				total++;
	        		}
	        	}
	        	
	        	
	        } else {
	        	System.out.println(" NUM ERROR");
	        }
		}
        // ���������������������������������������������������������������� �迭 ��� �κ� ��������������������������������������������������������������
        System.out.println(" ���簢���� �� ���� = "+total);
        for(int j = 0;j<arr_int[0].length;j++) {
    		for(int k = 0;k<arr_int.length; k++){
    			if (arr_int[j][k] == 1 || arr_bool[j][k] == true) {
    				System.out.print("��");
    			} else if (arr_int[j][k] == 2) {
    				System.out.print("��");
    			} else if (arr_int[j][k] == 3) {
    				System.out.print("��");
    			} else if (arr_int[j][k] == 4) {
    				System.out.print("��");
    			} else if (arr_int[j][k] >= 5) {
    				System.out.print("��");
    			} else {
    				System.out.print("��");
    			}
    		} 
    		System.out.println("��");
    	}
        
	}	// ���簢�� ���̸� ���ϴ� �Լ�

	public static void main(String[] args){
		
		Main ma = new Main();
		int input = -1;
		
		while(true) {
			System.out.println(Jul);
			System.out.println(" ���簢�� ���� ���ϱ�");
			System.out.println(" 1. �����Է�(boolean)");
			System.out.println(" 2. �ڵ��Է�(boolean)");
			System.out.println(" 3. �����Է�(int)");
			System.out.println(" 4. �ڵ��Է�(int)");
			System.out.println(" 0. ����");
			System.out.println(Jul);
			input = sc.nextInt();
			
			if (input == 1 || input == 2) {
				ma.rectangle_array(ma.square_input(),input,1);
				// rectangle_array(���簢�� ����, boolean�� ������ �ڵ�, boolean �迭 or int �迭)
				// (���簢�� ����, 1 = ���� / 2 = �ڵ�, boolean = 1 / int = 2
			} else if (input == 3 || input == 4) {
				ma.rectangle_array(ma.square_input(),input,2);
			} else if (input == 0) {
				System.out.println(" ���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println(" �ùٸ� ���� �Է����ּ���.");
			}
			
		}	// �޴� �Է� while��
		
    }// static void main

} // class main















