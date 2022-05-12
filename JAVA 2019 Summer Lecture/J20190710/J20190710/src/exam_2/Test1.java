package exam_2;
import java.util.Scanner;
public class Test1 {

	public Test1(){
		String[] name = new String[10];
		String[] tel = new String[13];
		String[] adr = new String[10];
		int sel2=0,n=0;
		
		Scanner s = new Scanner(System.in);
		
		// 기본 선언
		name[0] = "김민수";
		tel[0] = "010-1111-1111";
		adr[0] = "서울";
		name[1] = "박범수";
		tel[1] = "010-1004-1004";
		adr[1] = "대전";
		
		// 목록 출력
		System.out.println("목록 선택");
		System.out.println("1. 목록");
		System.out.println("2. 추가");
		System.out.println("3. 삭제");
		System.out.print("번호 선택 : ");
		int sel =  s.nextInt();

		// 목록 최대값
		for(int i=0;i<10;i++){
			if(name[i]!=null||tel[i]!=null||adr[i]!=null)
				n++;
		}

		
		// 목록 선택시
		switch(sel) {
			case 1 : 
				for (int i=0;i<n;i++){
					System.out.printf("No.%d 이름 : %4s\n전화번호 : %s\n주소 : %4s\n",i+1,name[i],tel[i],adr[i]);
				}
				break;
			case 2 : 
				do {
					int i = n+1;
					System.out.println("이름 :");
					name[i] = s.next();
					System.out.println("전화번호 : ");
					tel[i] = s.next();
					System.out.println("주소 : ");
					adr[i] = s.next();
					
					System.out.println("입력 계속? Yes:1 No:2");
					sel2 = s.nextInt();
					
					i++;
				}while(sel2==1);
				break;
			case 3 :
				for (int i=0;i<n;i++){
					System.out.printf("No.%d 이름 : %4s\n전화번호 : %s\n주소 : %4s\n",i+1,name[i],tel[i],adr[i]);
				}
				System.out.print("삭제할 번호 : ");
				sel2 = s.nextInt();
				
				for (int i=0;i<n;i++){
					if(sel2 == i){
						name[i]=null;
						tel[i]=null;
						adr[i]=null;
					}
				}
				break;

				default : System.out.println("REEOE");
		}
	}

	public static void main(String[] args) {
		
		new Test1();


			
	}

}

