package test_3;
// 3¸í, 3°ú¸ñ
public class Test1 {
	
	int[] kor = new int[3];
	int[] eng = new int[3];
	int[] mat = new int[3];
	int[] tot = new int[3];
	
	public Test1(){
		
	}
	public void input_proc() {
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
	}

	public static void main(String[] args) {
		
		Test1 t = new Test1();
		t.input_proc();
		
	}

}
