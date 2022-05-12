package test_6;
// two integer compare
import java.util.Scanner;

public class Test {

	private int a;
	private int b;
	
	public Test() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("input a(1~10) : ");
		this.a = s.nextInt();
		
		System.out.print("input b(1~10) : ");
		this.b = s.nextInt();
	}
	
	public Test(int a,int b) {		// 컨스럭션 생성자(construction over loading)
		
		this.a = a;
		this.b = b;
		
		
	}
	
	public void cpmpare() {
		if(this.a==this.b)
			System.out.println("A and B the same as");
		else if(this.a>this.b)
			System.out.println("A="+this.a+" > B="+this.b);
		else 
			System.out.println("A="+this.a+" < B="+this.b);
	}
	
	public static void main(String[] args){
		
		Test t1 = new Test();
		t1.cpmpare();
		Test t2 = new Test(10,20);
		t2.cpmpare();
		
	}
}
