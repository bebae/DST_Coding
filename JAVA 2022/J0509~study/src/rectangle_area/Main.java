/* 20220509 부터 만들기 시작한 자율 과제입니다.
 * 평면 위에 N개의 직사각형이 놓여있고, 직사각혀의 각 변은 x축, y축에 평행하다.(직사각형 이외의 사각형은 없다.)
 * 각각의 직사각형은 왼쪽 아래 좌표(x1, y1)과 오른쪽 위 좌표(x2, y2)를 가지며, (x1, y1, x2, y2)로 나타낸다.
 * 각 직사각형은 서로 겹쳐있을 수 있을 때 직사각형들이 차지하는 면적의 총합을 구하라
 * 제한 조건
 * 직사각형의 N : 1 <= N <= 100000
 * 직사각형의 좌표 x1 >= 0, y1 >= 0, x2 <= 109, y2 <= 109 
 */
package rectangle_area;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static private String Jul = "─────────────────────────";
	
	// 직사각형의 갯수를 입력받는 함수
	public int square_input() {
		int N = 0;				// 직사각형 갯수
		while (true) {
			System.out.println(Jul);
			System.out.print(" 직사각형의 갯수 :");
			N = sc.nextInt();
			// 직사각형 입력 제한 갯수
			if(N > 0 && N <= 10000)	break; 
			System.out.println("직사각형 갯수의 입력범위는 1~100000 입니다.");
			// 직사각형 갯수의 제한에 맞지 않으면 다시 입력합니다.
		}
		return N;
	}
	
	// 직사각형의 좌표를 입력받아서 진행하는 함수
	public void rectangle_array(int N,int mode,int num) {	// (사각형의 갯수, 수동과 자동의 구별하는 변수,배열 처리 구별 변수)
		
		/* 첫 꼭지점에서 끝 꼭지점까지 순환문을 돌면서 boolean 배열에 true 값을 넣어준다.
		 * 겹치는 부분은 어차피 true이기 때문에 중복이 발생하지 않는다.	
		 * 	최종적으로 true인 값의 갯수를 새어준다. 
		 */
		// 전체 좌표 크기의 배열
		boolean[][] arr_bool = new boolean[110][110];
		int[][] arr_int = new int[110][110];
		
		
		int x1=0, y1=0, x2=0, y2=0;		// 직사각형 좌표
		int total = 0;			// 직사각형 넓이 변수
		int temp = 0;			// 임시 변수
		
		 for(int i=0; i<N; i++){		// 받은 직사각형의 갯수만큼 반복합니다.
			// ──────────────────────────────── 받은 mode 값에 따라 처리 부분 ───────────────────────────────
			if (mode == 1 || mode == 3) {			// 수동 = manual
	        	System.out.print("X1 :");
	            x1 = sc.nextInt();
	            System.out.print("Y1 :");
	            y1 = sc.nextInt();
	            System.out.print("X2 :");
	            x2 = sc.nextInt();
	            System.out.print("Y2 :");
	            y2 = sc.nextInt();
	            System.out.println(Jul);
	            // 직사각형의 좌표를 받아 전체 크기의 배열에 true값을 채웁니다.
		        
			} else if (mode == 2 || mode == 4) {		// 자동 = automatic
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
			
			// x1, x2 와 y1, y2의 크기 체크
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
			
			
			// ──────────────────────────────── boolean 처리 부분 ───────────────────────────────
			if (num == 1) {
				 for(int j = y1;j<y2; j++){
		        // y1 부터 y2까지 true값을 채웁니다.
		            for(int k = x1;k<x2; k++){
		            // x1 부터 x2까지 true값을 채웁니다.
		                arr_bool[j][k] = true;
		            }
		        }
		        // for문을 이용하여 전체좌표배열에 현재 받은 직사각형의 좌표를 true로 표시합니다. 
		        // 만약 좌표값이 겹친다해도 이미 그 자리는 true 값으로 표시되어 있어 중복되지 않습니다.
		 
		        for(int j = 0; j<110; j++){
		        	for(int k = 0; k<110; k++){
		        	// 전체 좌표 배열을 읽어서 true값 => 직사각형의 겹침과 상관없이 전체 넓이를 구합니다.
		        		if(arr_bool[j][k]==true)
		        			total++;
		            }
		        }
		    // ↑ boolean 배열 처리
		    // ──────────────────────────────── int 처리 부분 ───────────────────────────────
	        } else if (num == 2) {
	        	for(int j = y1;j<y2;j++) {
	        		for(int k = x1;k<x2; k++){
	        			// 받은 좌표의 배열에 +1씩 더합니다.
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
        // ──────────────────────────────── 배열 출력 부분 ───────────────────────────────
        System.out.println(" 직사각형의 총 면적 = "+total);
        for(int j = 0;j<arr_int[0].length;j++) {
    		for(int k = 0;k<arr_int.length; k++){
    			if (arr_int[j][k] == 1 || arr_bool[j][k] == true) {
    				System.out.print("■");
    			} else if (arr_int[j][k] == 2) {
    				System.out.print("●");
    			} else if (arr_int[j][k] == 3) {
    				System.out.print("◆");
    			} else if (arr_int[j][k] == 4) {
    				System.out.print("▲");
    			} else if (arr_int[j][k] >= 5) {
    				System.out.print("★");
    			} else {
    				System.out.print("□");
    			}
    		} 
    		System.out.println("☆");
    	}
        
	}	// 직사각형 넓이를 구하는 함수

	public static void main(String[] args){
		
		Main ma = new Main();
		int input = -1;
		
		while(true) {
			System.out.println(Jul);
			System.out.println(" 직사각형 면적 구하기");
			System.out.println(" 1. 수동입력(boolean)");
			System.out.println(" 2. 자동입력(boolean)");
			System.out.println(" 3. 수동입력(int)");
			System.out.println(" 4. 자동입력(int)");
			System.out.println(" 0. 종료");
			System.out.println(Jul);
			input = sc.nextInt();
			
			if (input == 1 || input == 2) {
				ma.rectangle_array(ma.square_input(),input,1);
				// rectangle_array(직사각형 갯수, boolean에 수동과 자동, boolean 배열 or int 배열)
				// (직사각형 갯수, 1 = 수동 / 2 = 자동, boolean = 1 / int = 2
			} else if (input == 3 || input == 4) {
				ma.rectangle_array(ma.square_input(),input,2);
			} else if (input == 0) {
				System.out.println(" 프로그램을 종료합니다.");
				break;
			} else {
				System.out.println(" 올바른 값을 입력해주세요.");
			}
			
		}	// 메뉴 입력 while문
		
    }// static void main

} // class main















