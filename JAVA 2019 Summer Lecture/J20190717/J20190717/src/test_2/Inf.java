package test_2;

// 문을 닫는다/연다, 병을 딴다/잠근다
// 하는 짓은 비슷하지만 대상이 다른 것을 인터페이스를 사용

interface OpenClose{
	public abstract void Open();
	public abstract void Close();
}

// 색상
interface Painting{
	public abstract void RedFill();
	public abstract void BlueFill();
}
