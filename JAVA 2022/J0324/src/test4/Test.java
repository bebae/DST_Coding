//0324 #4
//국어 영어 수학 3과목/ n명 // multi class
package test4;
import java.util.Scanner;

public class Test {
	//필드선언
	private int[] kor;
	private int[] eng;
	private int[] mat;
	private int[] tot;
	private int[] ave;
	
	private static int n; //학생 수 
	
	//생성자 배열의크기 배열리셋
	public Test(Scanner s)
	{	
		System.out.print("n :");
		n = s.nextInt(); // n = 3;
		kor = new int[n];
		eng = new int[n];
		mat = new int[n];
		tot = new int[n];
		ave = new int[n];
		
		for (int i=0; i<n; i++)
		{
			kor[i] = eng[i] = mat[i] = tot[i] = ave[i] = 0;
		}
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
	
	public void comp_tot()
	{
		for (int i=0; i<n; i++)
		{
			tot[i] = kor[i] + eng[i] + mat[i];
		}
	}
	
	public void comp_ave()
	{
		for (int i=0; i<n; i++)
		{
			ave[i] = tot[i] / 3;
		}
	}
	
    public void result()
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
	
	
}