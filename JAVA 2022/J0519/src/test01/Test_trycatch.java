// J0519 #1
/* 오류제어 try~catch
 * app => 인터럽트 -> 처리 프로그램
 * 키보드의 버그 블루스크린
 * 버퍼링 송수신 에러 => fifo=선입선출 시스템, 출력은 spooling
 * generic type error <String> T
 * divide by zero 3/0 일 때 에러 
 */ 

package test01;
import java.util.Scanner;

public class Test_trycatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x=0, y=0;
		int z=0;
		
		x = (int)(Math.random()*100);
		y = (int)(Math.random()*100);

		if (y==0) {
			System.out.println("0이 아닌 양수값을 입력 : ");
			y = sc.nextInt();
		}
		if (y==0) {
			System.out.println("divide by zero error!");
		} else {
			try {								// 예외 발생 코드
				z = x/y;
				System.out.println("X / Y = "+z);
			} catch(ArithmeticException e) {	// 예외 발생 시 처리되는 코드
				z = -1;
				System.out.println(e.getMessage());
			} finally {							// 항상 처리되는 코드
				System.out.println("Error Processed");
			}
		}
		
			
		
	}

}
