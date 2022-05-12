package exam_3;

public class Test {
	
	private static int os;
	private static int db;
	private static int ic;
	private static int ca;
	private static int sys;
	private static int ave;
	
	public Test() {
		
		os = (int)(Math.random()*100);
		db = (int)(Math.random()*100);
		ic = (int)(Math.random()*100);
		ca = (int)(Math.random()*100);
		sys = (int)(Math.random()*100);
		
	}
	
	public static int ave(int a, int b, int c, int d, int e) {
		return (a+b+c+d+e)/5;
	}
	
	public void ptr() {
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
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.ave(os,db,ic,ca,sys);
		
		t.ptr();
		
		
	}
}
