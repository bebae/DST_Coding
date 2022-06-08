// J0519 #3

package test03;
import java.util.Scanner;

class CheckAgeException extends Exception {
	// 오류 메세지 지정
	public CheckAgeException() {
		super("나이가 유효하지 않습니다.");
	}
}

public class Test_Thread {
	
	// 메인에서 호출할 경우 static을 붙여야 함
	public static int CheckAge() throws CheckAgeException{
		Scanner sc = new Scanner(System.in);
		int age = 0;
		
		System.out.println("나이를 입력 : ");
		age = sc.nextInt();
		if (age < 0) {
			throw new CheckAgeException();
		}
		return age;
	}
	
	public static void main(String[] args) throws CheckAgeException {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		
		if (age < 0) {
			// 나이 오류 발생
			// 주로 while과 if를 써서 처리
		}
		
		try {
			age = CheckAge();
			System.out.println("age = "+age);
		} catch (CheckAgeException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
