package test_1;
// 4칙 연산
// 오버로딩
import java.util.Scanner;
public class Test {
	
	
	
	public static void main(String[] args) {
		
		String op = null;
		
		Test1 t = new Test1();			// class 불러오기
		
		
		
		int sel = (int)(Math.random()*4);
		switch (sel) {
			case 0 : op = "+";
				break;
			case 1 : op = "-";
				break;
			case 2 : op = "*";
				break;
			case 3 : op = "/";
				break;
			default : System.out.println("error");
		}
		
		
		t.compute(op);
		
		
	}
}
