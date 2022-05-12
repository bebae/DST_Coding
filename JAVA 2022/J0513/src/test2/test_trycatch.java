// 0513 #2
// 오류제어 trycatch

package test2;
import java.util.Scanner;

public class test_trycatch {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0, y = 0, z = 0;
		
		x=(int)(Math.random()*100);
		y=(int)(Math.random()*100);
		
		// 나누기 0은 오류발생 -> 5/0
		
		while(y==0) {
			y=sc.nextInt();
		}
		if(y == 0) {
			System.out.println("divide by zero error");
		} else {
			try {
				z = x / y;
				System.out.printf("x : %d / y : %d / z : %d",x,y,z);
			} catch(ArithmeticException e) {	// 연산 에러
				System.out.println("연산 Error");
			} finally {		// try catch의 결과와 상관없이 항상 실행이 보장됨
				System.out.println("\n연산 완료");
			}
		}
		
	}
}

/*
* try { 
* 정상이라면 이 코드는 아무런 문제없이 블록의 시작부터 끝까지 실행된다. 
* 하지만 경우에 따라 예외가 발생할 수 있다. 
* 예외는 throw 문에 의해 직접적으로 발생할 수도 있고, 
* 또는 예외를 발생시키는 메서드의 호출에 의해 발생할 수도 있다. 
* } catch (e) {
* 이 블록 내부의 문장들은 오직 try 블록에서 예외가 발생할 경우에만 실행된다. 
* 이 문장들에선 지역 변수 e를 사용하여 Error 객체 또는 앞에서 던진 다른 값을 참조할 수 있다. 
* 이 블록에서는 어떻게든 그 예외를 처리할 수도 있고, 
* 그냥 아무것도 하지 않고 예외를 무시할 수도 있고, 
* 아니면 throw 를 사용해서 예외를 다시 발생시킬 수도 있다. 
* } finally { 
* 이 블록에는 try 블록에서 일어난 일에 관계없이 무조건 실행될 코드가 위치한다. 
* 이 코드는 try 블록이 어떻게든 종료되면 실행된다. 
* try 블록이 종료되는 상황은 다음과 같다. 
* 1) 정상적으로 블록의 끝에 도달했을 때 
* 2) break, continue 또는 return 문에 의해서 
* 3) 예외가 발생했지만 catch 절에서 처리했을 때 
* 4) 예외가 발생했고 그것이 잡히지 않은 채 퍼져나갈 때  
* } */

