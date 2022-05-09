// 0331 #4 n명 name mid fin rpt chul class
// 총점 max, who? error? -> sol) array
package test4;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		String[] f_name = {"김","이","빅","최","조","황","손","송"};
		String[] m_name = {"도","연","수","진","사","희","경","자"};
		String[] l_name = {"희","철","수","영","경","미","오","진"};

		//System.out.println("------------------------1-");
	    String[] name;     // 1	
		int[] mid,fin,rpt,chul; // 2)
     
		Scanner s = new Scanner(System.in);
		//System.out.print("n: ");
		//int n=s.nextInt();
		int n = (int)(Math.random()*7+3);
		//System.out.println("------------------------2-");		
        name = new String[n];
		//mid = fin = rpt = chul =0;  //3) 변수:reset, 배열:size, reset
		mid = new int[n]; fin = new int[n]; rpt = new int[n]; chul = new int[n];
		for (int i=0; i<n; i++)
		{ mid[i] = fin[i] = rpt[i] = chul[i] = 0;
		  name[i] = "";}
		//System.out.println("------------------------3-");	
		
		//input
		//System.out.println("input");
		for (int i=0; i<n; i++)
		{
			name[i] = f_name[(int)(Math.random()*7)] + m_name[(int)(Math.random()*7)]
	               + l_name[(int)(Math.random()*7)];
			mid[i] = (int)(Math.random()*30+1);
			fin[i] = (int)(Math.random()*40+1);
			rpt[i] = (int)(Math.random()*20+1);
			chul[i] =(int)(Math.random()*10+1);
			//System.out.printf("%3s %2d  %2d  %2d  %2d\n",
			//		name[i],mid[i],fin[i],rpt[i],chul[i]);
		}
		
		//process
		//System.out.println("process");
		int max = 0;
		String max_person="";
		
		//int tot =0;
		int[] tot = new int[n];
		for (int i=0; i<n; i++) tot[i] = 0;
		
		for (int i=0; i<n; i++)
		{
			tot[i] = mid[i] + fin[i] + rpt[i] + chul[i];
			if (max < tot[i])
			{	
				max = tot[i];
				max_person = name[i];
			}
		}
		
		//output
		System.out.println("성명  중간 기말 과제 출석 총점");
		System.out.println("------------------------");
		for (int i=0; i<n; i++)
		{
			System.out.printf("%3s %2d  %2d  %2d  %2d  %3d\n",
					name[i],mid[i],fin[i],rpt[i],chul[i],tot[i]);
		}
		System.out.printf("%s : %d", max_person, max);
	}
}
