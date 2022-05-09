// 0331 #3 n명 name mid fin rpt chul class
// 총점 max, who? error? -> sol array
package test3;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		String[] f_name = {"김","이","빅","최","조","황","손","송"};
		String[] m_name = {"도","연","수","진","사","희","경","자"};
		String[] l_name = {"희","철","수","영","경","미","오","진"};
		String name="";
		int mid,fin,rpt,chul;
		mid = fin = rpt = chul =0;
		Scanner s = new Scanner(System.in);
		//System.out.print("n: ");
		//int n=s.nextInt();
		int n = (int)(Math.random()*7+3);

		//input
		for (int i=0; i<n; i++)
		{
			name = f_name[(int)(Math.random()*7)] + m_name[(int)(Math.random()*7)]
	               + l_name[(int)(Math.random()*7)];
			mid = (int)(Math.random()*30+1);
			fin = (int)(Math.random()*40+1);
			rpt = (int)(Math.random()*20+1);
			chul =(int)(Math.random()*10+1);
		}
		
		//process
		int max = 0;
		String max_person="";
		int tot = 0;
		for (int i=0; i<n; i++)
		{
			tot = mid + fin + rpt + chul;
			if (max < tot)
			{	
				max = tot;
				max_person = name;
			}
		}
		
		//output
		System.out.println("성명  중간 기말 과제 출석 총점");
		System.out.println("------------------------");
		for (int i=0; i<n; i++)
		{
			System.out.printf("%3s %2d  %2d  %2d  %2d  %3d\n",name,mid,fin,rpt,chul,tot);
		}
		System.out.printf("%s : %d", max_person, max);
	}
}
