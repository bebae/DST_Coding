package test_2;
import java.util.Scanner;

// �л� �� n
// max min find
// n : input nextInt()
// define  final private int n = 10
// n first, ���� array(�迭) length(����)
////////	var. #2	////////
// n ���� n+1 ...����ó�� ?? = n�� ���� java
// 7/16 extends ���, thread, interface
public class Test {
	
	private int[] score=null;
	
	public Test() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("n ? ");
		int n = s.nextInt();
		score = new int[n];
		for (int i=0;i<n;i++) {
			score[i] = 0;
		}
		
	}
	public void jumsu() {
		
		for (int i=0;i<score.length;i++) {
			score[i] = (int)(Math.random()*101);
			System.out.println("score"+i+"= "+score[i]);
			
		}
	}
	public void minmax() {
		int max=0;
		int min=101;
		for(int i=0;i<score.length;i++) {
			if(score[i]>max) max = score[i];
			if(score[i]<min) min = score[i];
		}
		System.out.println("max ="+max);
		System.out.println("min ="+min);
	}

	public static void main(String[] args) {
		Test t = new Test();							// �� ����  ���� ��Ų ��
		t.jumsu();
		Scanner s = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------");
			System.out.println("1 : listing");
			System.out.println("2 : min/max");
			System.out.println("5 : exit");
			System.out.println("-------------------");
			System.out.print("you choice :");
			int choice = s.nextInt();
			
			switch(choice) {
				case 1 : t.jumsu();
					break;
				case 2 : t.minmax();					
					break;
				case 3 :
					break;
				case 5 : System.out.println("exit");
						System.exit(0);
				
					
					break;
				default : System.out.println("error"); 
					break;
			}
		}
	}
}
/*
  if( id=""||id=null) continue

101 100-1234 boksu-dong
102 100-1234 boksu-dong
104 ...

*/