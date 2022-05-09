// 0428 #3
// 다중 클래스
// rentCar racingCar sportCar

// ————————————————————————————————————————————————————————————————— 런타임 이상하게 실행됨 잘 몰?루겠음

package test4;



public class Car {
	
	int num = 0;	// 차량번호 Car number
	String kind = "";	// 사용목적 출퇴근용, 여행용  승용차/RV 
	
	public Car() {
		num = 0;
		System.out.println("자동차 임대");
	}
	
	public void setCar(int num, String kind) {
		this.num = num;
		this.kind = kind;
		System.out.println(kind+"가 "+num+"이 대여");
	}
}	// car
class racingCar extends Car{
	private int course = 0;
	
	public racingCar(){
		this.course = 0;
		System.out.println("레이싱카");
	}
	public void setCar(int c) {
		course = c;
		System.out.println("코스번호 "+course+"번");
	}
	public void show() {
		System.out.println("차량번호 : "+num);
		System.out.println("종류 : "+kind);
		System.out.println("코스 : "+course);
	}
	
} // class raingCar


class Main{
	public static void main(String[] args) {
		Car sonata = new Car();
		Car rv = new Car();
		racingCar ra = new racingCar();
		
		ra.setCar(1);
		sonata.setCar(1000, "sonata");
		ra.show();
		
	}
}	// main

