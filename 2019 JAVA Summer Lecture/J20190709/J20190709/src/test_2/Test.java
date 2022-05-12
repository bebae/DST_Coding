package test_2;

//ranfom var. a,b
// construction overloading
public class Test {
	
	public Test() {		// »ı¼ºÀÚ
		
		int a = (int)(Math.random()*100+1);
		int b = (int)(Math.random()*100+1);
	
		int c = add(a,b);
		System.out.println("a = "+a+" b = "+b+" c = "+c);

	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		
		new Test();
		
	
	}
}
