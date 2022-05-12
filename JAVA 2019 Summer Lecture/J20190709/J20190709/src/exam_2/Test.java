package exam_2;

public class Test {
	
	public Test() {
		int os,db,ic,ca,sys;
		
		os = (int)(Math.random()*100);
		db = (int)(Math.random()*100);
		ic = (int)(Math.random()*100);
		ca = (int)(Math.random()*100);
		sys = (int)(Math.random()*100);
		
		int ave = ave(os,db,ic,ca,sys);
		
		String chul=null,drop=null;
		if(ave>=60) {
			chul = "pass";
			if(os<50||db<50||ic<50||ca<50||sys<50) {
				drop = "과락있음";
			} else {
				drop = "과락없음";
			}
		} else {
			chul = "nonpass";
			drop = "과락있음";
		}
		
		System.out.println(" os  db  ic  ca  sys  ave  chul  "+chul);
		System.out.println(" "+os+"  "+db+"  "+ic+"  "+ca+"   "+sys+"   "+ave+"  drop  "+drop);
	}
	
	public static int ave(int a, int b, int c, int d, int e) {
		return (a+b+c+d+e)/5;
	}
	
	public static void main(String[] args) {
		
		new Test();
		
		
	}
}
