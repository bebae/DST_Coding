//0324 #2
//국어 영어 수학 3과목/ n명
package test2;
import java.util.Scanner;

public class Test {
	//필드선언
	private int[] kor;
	private int[] eng;
	private int[] mat;
		
	private static int n; //학생 수 
		
	public Test()
	{	
		Scanner s = new Scanner(System.in);
		System.out.print("n :");
		n = s.nextInt(); // n = 3;
		kor = new int[n];
		eng = new int[n];
		mat = new int[n];
		for (int i=0; i<n; i++)
		{
			kor[i] = eng[i] = mat[i] = 0;
		}
		s.close();
	}
	public void input_proc()
	{
		for (int i=0; i<n; i++)
		{
			kor[i] = (int)(Math.random() * 50 +50);
			eng[i] = (int)(Math.random() * 50 +50);
			mat[i] = (int)(Math.random() * 50 +50);
		}
	}
	
	public int[] comp_tot()
	{
		int[] tot = new int[n];
		for (int i=0; i<n; i++) tot[i] = 0;
		
		for (int i=0; i<n; i++)
		{
			tot[i] = kor[i] + eng[i] + mat[i];
		}
		return tot;
	}
	
	public int[] comp_ave(int[] tot)
	{
		int[] ave = new int[n];
		for (int i=0; i<n; i++) ave[i] = 0;
		
		for (int i=0; i<n; i++)
		{
			ave[i] = tot[i] / 3;
		}
		return ave;
	}
	
    public void result(int[] tot,int[] ave)
    {
    	for (int i =0; i<n; i++)
    	{
			System.out.printf("kor[%d]= %d\n",i,kor[i]);
			System.out.printf("eng[%d]= %d\n",i,eng[i]);
			System.out.printf("mat[%d]= %d\n",i,mat[i]);
			System.out.printf("tot[%d]= %d\n",i,tot[i]);
			System.out.printf("ave[%d]= %d\n",i,ave[i]);
			System.out.println("");
    	}
    }
	
	public static void main(String[] args) {

		int[] tot = new int[n];
		int[] ave = new int[n];
		
		Test t = new Test();
		t.input_proc();
		tot = t.comp_tot();
		ave = t.comp_ave(tot);
		t.result(tot,ave);
	}
}