// J0519 #2
// file�� ���� try catch

package test02;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;

class Test1 {
	public void me() {
		try {
			InputStream in = new FileInputStream("input.txt");
		} catch (FileNotFoundException e) {		// ������ ���� �� ����ó��
			e.printStackTrace();
		}
	}
}
class Test2 {
	public void me(){
		try {
			InputStream in = new FileInputStream("input.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

public class test_file_trycatch {
	public static void main(String[] args){
		Test1 t1 = new Test1();
		t1.me();
		
		Test2 t2 = new Test2();
		t2.me();
	}
}















