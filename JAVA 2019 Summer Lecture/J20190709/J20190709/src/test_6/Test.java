package test_6;

public class Test {
	
	private int kor;
	private int eng;
	private int mat;

	public Test() {
		
		this.kor = (int)(Math.random()*100);
		this.eng = (int)(Math.random()*100);
		this.mat = (int)(Math.random()*100);
	}
	
	public void hap() {
		for(int i=0;i<3;i++) {
			int tot = this.kor+this.eng+this.mat;
			
			System.out.println("kor = "+this.kor);
			System.out.println("eng = "+this.eng);
			System.out.println("mat = "+this.mat);
			System.out.println("tot = "+tot);
			System.out.println("------------");
		}
		
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.hap();
		
	}
}
