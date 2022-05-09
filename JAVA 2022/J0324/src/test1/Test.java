//0324 #1
//국어 영어 수학 3과목
package test1;

public class Test {

	public static void main(String[] args) {
		int kor;
		int eng;
		int mat;
		
		kor = eng = mat = 90;
		
		int tot = kor + eng + mat;
		int ave = tot / 3;
		
		System.out.println("kor = " + kor);
		System.out.println("eng = " + eng);
		System.out.println("mat = " + mat);
		System.out.println("tot = " + tot);
		System.out.println("ave = " + ave);	
	}
}
