package test_2;

public class Bottle implements OpenClose, Painting{
	public void Open() {
		System.out.println("Bottle open");
	}
	public void Close() {
		System.out.println("Bottle close");
		}
	public void RedFill() {
		System.out.println("Bottle red fill");
	}
	public void BlueFill() {
		System.out.println("Bottle blue fill");
	}
}
