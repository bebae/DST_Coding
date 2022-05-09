// 0331 #1 name mid fin rpt chul class
package test1;

public class Test {

	public static void main(String[] args) {
	
		String[] f_name = {"김","이","빅","최","조","황","손","송"};
		String[] m_name = {"도","연","수","진","사","희","경","자"};
		String[] l_name = {"희","철","수","영","경","미","오","진"};
		String name;
		int mid, fin, rpt, chul;
		
		name = f_name[(int)(Math.random()*7)] + m_name[(int)(Math.random()*7)]
               + l_name[(int)(Math.random()*7)];
		mid = (int)(Math.random()*30+1);
		fin = (int)(Math.random()*40+1);
		rpt = (int)(Math.random()*20+1);
		chul =(int)(Math.random()*10+1);
		int tot = mid + fin + rpt + chul;
		
		System.out.println("성명  중간 기말 과제 출석 총점");
		System.out.println("------------------------");
		System.out.printf("%3s %2d  %2d  %2d  %2d  %3d",name,mid,fin,rpt,chul,tot);
	}
}
