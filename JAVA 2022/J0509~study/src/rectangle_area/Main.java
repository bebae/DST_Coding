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
	
		/* 첫 꼭지점에서 끝 꼭지점까지 순환문을 돌면서 boolean 배열에 true 값을 넣어준다.
		 * 겹치는 부분은 어차피 true이기 때문에 중복이 발생하지 않는다.	
		 * 	최종적으로 true인 값의 갯수를 새어준다. 
		 */
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			boolean[][] arr = new boolean[110][110];
			// 전체 좌표 크기의 배열
			
			int x1, y1, x2, y2;		// 직사각형 좌표
			int N = 0;				// 직사각형 갯수
			int total = 0;
			
			while (true) {
				System.out.print("직사각형의 갯수 :");
				N = sc.nextInt();
				// 직사각형 갯수
				if(N > 0 && N <= 10000)	break;
				System.out.println("직사각형 갯수의 입력범위는 1~100000 입니다.");
				// 직사각형 갯수의 제한에 맞지 않으면 다시 입력합니다.
			}
			
	        for(int i=0; i<N; i++){
	        	// 받은 직사각형의 갯수만큼 반복합니다.
	        	System.out.print("X1 :");
	            x1 = sc.nextInt();
	            System.out.print("Y1 :");
	            y1 = sc.nextInt();
	            System.out.print("X2 :");
	            x2 = sc.nextInt();
	            System.out.print("Y2 :");
	            y2 = sc.nextInt();
	            System.out.println("────────────");
	            // 직사각형의 좌표를 받아 전체 크기의 배열에 true값을 채웁니다.
	            
	            for(int j = y1; j<y2; j++){
	            // y1 부터 y2까지 true값을 채웁니다.
	                for(int k = x1; k<x2; k++){
	                // x1 부터 x2까지 true값을 채웁니다.
	                    arr[j][k] = true;
	                }
	            }
	            // for문을 이용하여 전체좌표배열에 현재 받은 직사각형의 좌표를 true로 표시합니다. 
	            // 만약 좌표값이 겹친다해도 이미 그 자리는 true 값으로 표시되어 있어 중복되지 않습니다.
	        }
	 
	        for(int j = 0; j<110; j++){
	        	for(int k = 0; k<110; k++){
	        	// 전체 좌표 배열을 읽어서 true값 => 직사각형의 겹침과 상관없이 전체 넓이를 구합니다.
	        		if(arr[j][k]==true){
	        			total++;
	                }
	            }
	        }
	 
	        System.out.println(total);
	    }// static void main

} // class main
