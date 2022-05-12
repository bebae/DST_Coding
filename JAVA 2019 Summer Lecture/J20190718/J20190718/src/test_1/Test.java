package test_1;
// 예외처리
/*try{

    예외 발생 가능성이 있는 문장들;

}catch(예외 타입1 매개변수명){

    예외타입1의 예외가 발생할 경우 처리 문장들;

}catch(예외 타입 n 매개변수명){

    예외타입 n의 예외가 발생할 경우 처리 문장들;

}finally{

    항상 수행할 필요가 있는 문장들;

}
 */
public class Test {

	public static void process_routine() {
		System.out.println("ok processed");
	}
	public static void main(String[] args) {
		
		int c=0;
		try {			// try catch 예외 처리시 사용(중요)
			
		
			c= 4/0;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			c = -1;
			System.out.println(c);
		} finally {		// 예외 catch 유무와 상관 없이 무조건 수행 = 파일을 사용한 후 닫는 기능과 같이 항상 수행해야 할 필요가 있는 경우에 사용
			process_routine();
		}
	}

}
