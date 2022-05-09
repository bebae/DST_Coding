// 0331 #6 n�� name mid fin rpt chul class
// ���� max, who? error? -> sol) array + class
package test6;
import java.util.Scanner;

public class Test {

	    private String[] name;     	
		private int[] mid,fin,rpt,chul,tot; 		

		private int n;
		
		public Test() 
		{
			//System.out.println("con");
			Scanner s = new Scanner(System.in);
			n = (int)(Math.random()*7+3);

			name = new String[n];
			mid = new int[n]; 
			fin = new int[n]; 
			rpt = new int[n]; 
			chul = new int[n];
			tot = new int[n];
			for (int i=0; i<n; i++)
			{ mid[i] = fin[i] = rpt[i] = chul[i] = tot[i] = 0;
			  name[i] = "";
			}
		}
		
		public void input_proc()
		{
			//System.out.println("input");
			String[] f_name = {"��","��","��","��","��","Ȳ","��","��"};
			String[] m_name = {"��","��","��","��","��","��","��","��"};
			String[] l_name = {"��","ö","��","��","��","��","��","��"};
			for (int i=0; i<n; i++)
			{
				name[i] = f_name[(int)(Math.random()*7)] + m_name[(int)(Math.random()*7)]
		               + l_name[(int)(Math.random()*7)];
				mid[i] = (int)(Math.random()*30+1);
				fin[i] = (int)(Math.random()*40+1);
				rpt[i] = (int)(Math.random()*20+1);
				chul[i] =(int)(Math.random()*10+1);
				//System.out.printf("%3s %2d  %2d  %2d  %2d\n",
						//name[i],mid[i],fin[i],rpt[i],chul[i]);
			}
		}
		
		public String find_max()
		{
			//System.out.println("find");
			int max = 0;
			String max_person="";
			for (int i=0; i<n; i++)
			{
				tot[i] = mid[i] + fin[i] + rpt[i] + chul[i];
				if (max < tot[i])
				{	
					max = tot[i];
					max_person = name[i];
				}
			}
			return max_person;
			//System.out.printf("%s : %d", max_person, max);
		}
		
		public void output_proc(String max_person)
		{
			//output
			System.out.println("����  �߰� �⸻ ���� �⼮ ����");
			System.out.println("------------------------");
			for (int i=0; i<n; i++)
			{
				System.out.printf("%3s %2d  %2d  %2d  %2d  %3d\n",
						name[i],mid[i],fin[i],rpt[i],chul[i],tot[i]);
			}
			System.out.println("------------------------");
			int max =0;
			for (int i=0; i<n; i++)
			{
				if (name[i] == max_person) { max = tot[i]; break;} 
			}
			System.out.printf("%s : %3d", max_person, max);
		}
}
