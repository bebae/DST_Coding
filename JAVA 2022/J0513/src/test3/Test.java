// 0513 #3
// 외부에서 받을 때 검증이 필요한여 trycatch를 사용한다.
// 검증을 쓰지 않으면 프로그램 줄 수가 매우 작아지지만 

package test3;
import java.util.Scanner;

class CheckAgeException extends Exception{
	public CheckAgeException() {
		super ("나이가 유효하지 않습니다.");
//super 키워드는 부모 클래스로부터 상속받은 필드나 메소드를 자식 클래스에서 참조하는 데 사용하는 참조 변수입니다.
	}
}

public class Test {
	static Scanner sc = new Scanner(System.in);
	
	public static int checkAge() throws CheckAgeException{
		int age = 0;
		
		age = sc.nextInt();
		if (age < 0 || age > 500) throw new CheckAgeException();
		// 조건이 맞다면 Check 클래스 실행
		
		return age;
	}
	public static void main(String[] args) {
		int age = 0;
		
		System.out.print("나이를 입력 : ");
	//	age = sc.nextInt();
		try {
			age = checkAge();
			System.out.println("age : "+age);
		} catch (CheckAgeException e) {
			System.out.println(e.getMessage());
			// getMessage() = 시스템 자체 오류메시지를 띄어줌 
		}
		
	}
}














