package test_1;

public class Dog extends Animal{

	public Dog() {
		super("dog");
		
	}
	public void cry() {
		System.out.println("�۸� crying");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.cry();
	}
	
}
