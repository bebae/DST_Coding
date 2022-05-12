package test_6;
// 사번 성명

import java.util.Scanner;
public class Test1 {
	
	private int id=0;
	private String name=null;

	public Test1() {
		id = 0;
		name = null;
	}
	
	public void call_listing(Scanner s) {
		System.out.println("listing");
	}
	public void call_add(Scanner s) {
		System.out.println("add");
		
		System.out.print("사번:");
		this.id =  s.nextInt();
		System.out.print("성명:");
		this.name = s.next();
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Test1[] insa = new Test1[10];
		for(int i=0;i<10;i++) {
			insa[i] = new Test1();
		}
		
		int pos = 0;
		while(true) {
			System.out.println("--------------------");
			System.out.println("  1. listing");
			System.out.println("  2. add");
			System.out.println("  3. exit");
			System.out.println("--------------------");
			System.out.print("select :");
			int choice = s.nextInt();
			switch(choice) {
				case 1: insa[pos].call_listing(s);
					break;
				case 2: insa[pos].call_add(s);
					break;
				
				default : System.out.println("exit");
					System.exit(0);
			}
		}
		
	}

}
