// 0428 #1
// 다중 클래스

package test1;

class Human{
	String name;	// 직업이름
	int age;		// 나이
	
	public void print_Info() {
		System.out.println("직급 : "+name+"\n나이 : "+age);
	}
	
}
class Employee extends Human {		// 종업원 클래스에 휴먼을 상속 받음
	public Employee() {
		name = "사장";
		age = 40;
	}
	
	// 상속 받은 것을 개선 = 메소드 리디파인 = 메소드 오버라이딩
	public void print_Info() {
		System.out.println("고용주 : "+name+"\n나이 : "+age);
	}
}

class Alba extends Human {
	public Alba() {
		name = "알바";
		age = 20;
	}
	// 오버라이딩
	public void print_Info() {
		System.out.println("알바 : "+name+"\n나이 : "+age);
	}
	
}

public class test {
	
	public static void main(String[] args) {
		
		Employee em = new Employee();
		Alba al = new Alba();
		
		em.print_Info();
		al.print_Info();
		
		
		
		
	} // main
}
