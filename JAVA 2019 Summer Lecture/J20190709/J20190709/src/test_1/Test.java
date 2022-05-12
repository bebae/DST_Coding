package test_1;

//ranfom var. a,b
// construction overloading
public class Test {
	
	public static int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int a,b;
		
		a = (int)(Math.random()*100+1);
		b = (int)(Math.random()*100+1);
		
		int c = add(a,b);
		
		System.out.println("a = "+a+" b = "+b+" c = "+c);

	}
}
