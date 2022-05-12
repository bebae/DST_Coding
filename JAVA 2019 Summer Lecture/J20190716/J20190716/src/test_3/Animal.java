package test_3;

public class Animal {

	String name=null;
	int age=0;
	public Animal(String ani) {
		System.out.println(ani+ " animal created");
	}
	public void crying(String crying) {
		System.out.println(crying + " crying");
	}
	public static void main(String[] args) {
		Dog dog = new Dog("dog");
		dog.crying("woof!");
		
		Cat cat = new Cat("cat");
		cat.crying("meow~");

	}

}
