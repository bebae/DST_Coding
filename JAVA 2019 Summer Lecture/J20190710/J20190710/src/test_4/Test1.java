package test_4;

// 3명, 3과목
public class Test1 {
	
/*
	int[] kor = new int[3];
	int[] eng = new int[3];
	int[] mat = new int[3];
	int[] tot = new int[3];
*/
	private int kor,eng,mat,tot;
	
	public Test1(){
		kor = eng = mat = 0;			// 초기화
	}
	public void input_proc() {
		
		kor = (int)(Math.random()*101);
		eng = (int)(Math.random()*101);
		mat = (int)(Math.random()*101);
		
		tot = kor+eng+mat;
		
		System.out.printf("kor %3d eng %3d mat %3d  tot = %3d\n",kor,eng,mat,tot);
		
/*
		for(int i=0;i<3;i++) {
			kor[i] = (int)(Math.random()*101);
			eng[i] = (int)(Math.random()*101);
			mat[i] = (int)(Math.random()*101);
		}
		for(int i=0;i<3;i++) {
			tot[i] = kor[i]+eng[i]+mat[i];
		}
		for(int i=0;i<3;i++) {
			System.out.printf("kor %3d eng %3d mat %3d  tot = %3d\n",kor[i],eng[i],mat[i],tot[i]);
		
		}
*/
		System.out.println("-----------------------------------");
	}

	public static void main(String[] args) {
		
		
		// class 배열 ****************************************중요
		Test1[] t = new Test1[3];
		for(int i=0;i<3;i++) {
			t[i] = new Test1();			// 초기화
		}
		
		for(int i=0;i<3;i++) {
			t[i].input_proc();
		}
		
		
	}

}
