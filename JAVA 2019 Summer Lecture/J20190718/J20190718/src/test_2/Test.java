package test_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.me();
		
		Test1 t2 = new Test1();
		t2.me();
	}

}

class Test1 {
	public void me() {
		try {
			InputStream in = new FileInputStream("input.txt");
	
		} catch (FileNotFoundException e){
			e.printStackTrace();
			System.out.println("");
		}
	}
}
class Test2 {
	public void me() throws FileNotFoundException {	
			InputStream in = new FileInputStream("input.txt");
	}
}




