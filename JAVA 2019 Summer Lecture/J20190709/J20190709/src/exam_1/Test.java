package exam_1;

public class Test {
	
	public static void main(String[] args) {
		
		int os,db,ic,ca,sys;
		
		os = (int)(Math.random()*100);
		db = (int)(Math.random()*100);
		ic = (int)(Math.random()*100);
		ca = (int)(Math.random()*100);
		sys = (int)(Math.random()*100);
		
		int tot = os+db+ic+ca+sys;
		int ave = tot/5;
		
		String chul=null,drop=null;
		if(ave>=60) {
			chul = "pass";
			if(os<50||db<50||ic<50||ca<50||sys<50) {
				drop = "��������";
			} else {
				drop = "��������";
			}
		} else {
			chul = "nonpass";
			drop = "��������";
		}
		
		System.out.println(" os  db  ic  ca  sys  ave  chul  "+chul);
		System.out.println(" "+os+"  "+db+"  "+ic+"  "+ca+"   "+sys+"   "+ave+"  drop  "+drop);
		
	}
}
