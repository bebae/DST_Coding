package test_3;


//ranfom var. a,b
// construction overloading
public class Test {
	
	private static int a;
	private static int b;
	
	public Test() {		// »ı¼ºÀÚ
		
		this.a = (int)(Math.random()*100+1);
		this.b = (int)(Math.random()*100+1);
	
	}
	
	public int add(int a, int b) {
		return this.a+this.b;
	}
	
	public void printproc(int c) {
		System.out.println("a = "+this.a+" b = "+this.b+" c = "+(this.a+this.b));
	}
	public static void main(String[] args) {
		
		Test t = new Test();
		
		int c = t.add(a, b);		
		t.printproc(c);
	
	}
}
