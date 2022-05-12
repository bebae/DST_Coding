package test_3;
	// 己利贸府 mid,finrpt,chul
import java.util.Scanner;
	
public class Test3 {

	public static void main(String[] args) {
	
		String hak;		// char[], char*
		Scanner s = new Scanner(System.in);
		
		int mid;
		System.out.print("mid : ");
		mid = s.nextInt();				// scanf("",&) include stdio.h
		int fin;
		System.out.print("fin : ");
		fin = s.nextInt();
		int rpt;
		System.out.print("rpt : ");
		rpt = s.nextInt();
		int chul;
		System.out.print("chul : ");
		chul = s.nextInt();
		
		int tot = mid+fin+rpt+chul;
		
		
		if (tot>90) hak="A";
		else if (tot>80) hak="B";
		else if (tot>70) hak="C";
		else hak="F";
		
			
		System.out.println("钦 = "+tot+" 乞闭 = "+hak);
	}
}
