package test_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;

// 파일 읽어오기

public class Test {

	public static void main(String[] args) throws Exception {
		
		InputStream inf = new FileInputStream("d:/test.txt");
		
		int num;
		byte[] buff = new byte[8];
		String data="";
		while(true) {
			num = inf.read(buff);
			if(num == -1) break;
			data += new String(buff,0,num);
		}
				
		System.out.println(data);
		inf.close();

	}

}
