package test_1;

import java.util.Scanner;

public class Test1 {
	
	//memeber data
		private static int a;
		private static int b;
		
		public Test1() {
			Scanner s = new Scanner(System.in);
			
			
			//a = s.nextInt();
			//b = s.nextInt();
			a = (int)(Math.random()*10+1);
			b = (int)(Math.random()*10+1);
		}

		// construction(생성자) : son of class(클래스의 아들) 
		public static void compute(String op) {
			int c=0;
			switch(op) {
			 case "+" : c = a+b;
			 	break;
			 case "-" : c = a-b;
			 	break;
			 case "*" : c = a*b;
			 	break;
			 case "/" : c = a/b;
			 	break;
			 default : System.out.println("op error");
			}
			result(c);
		}
		
		// method
		public static void result(int c) {
			System.out.println("A = "+a+" B = "+b);
			System.out.println(c);
		}
}
