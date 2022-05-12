package test_2;

public class Door implements OpenClose, Painting{
	public void Open() {
		System.out.println("Door open");
	}
	public void Close() {
		System.out.println("Door close");
		}
	public void RedFill() {
		System.out.println("Door red fill");
	}
	public void BlueFill() {
		System.out.println("Door blue fill");
	}
}
