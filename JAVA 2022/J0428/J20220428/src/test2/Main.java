//0428 #2
// 다중 클래스

package test2;

interface Print_Info{
	// 공통으로 사용하는 기능을 인터페이스(Print_info)로 묶어서 정의한다.
	public void print_info();
	// public void func1();
	// 사람으로 치면 잠잔다/먹는다/말한다 등의 기능을 따로 묶어서 정의한다.
	
}

// interface를 사용하기 위해 implements 임플리먼트를 사용하고 반드시 안에 오버라이딩 필요
public class Main implements Print_Info {
	
	private String name;
	private int age;
	
	public void print_info() {
		System.out.println("직업 : "+name+"\n나이 : "+age);
		
	}
	
	public static void main(String[] args) {
		
		Main ma = new Main();
		ma.print_info();
		
		
	}	// main

	
	
}
