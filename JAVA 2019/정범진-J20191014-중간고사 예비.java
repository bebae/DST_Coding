package test;

import java.util.Scanner;
public class Test{	// Test = 객체

  
  private int tot[] = new int[20];
  private int ave[] = new int[20];
  private String grade[] = new String[20];
  private int number = 201903100;
  private String pass;
  private String name="";
  private String name1[] = {"김","박","이","정","오","신","심","고"};
  private String name2[] = {"오","대","우","동","우","준","상","지"};
  private String name3[] = {"성","철","진","준","기","원","혁","권"};
  
  static int[] kor = {1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4};
  static int[] eng = {4,3,2,1,4,3,2,1,4,3,2,1,4,3,2,1,4,3,2,1};
  static int[] mat = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
  
  private int stu[][] = new int[20][20];	// [과목][과목의 답]
  
  static String ox[][] = new String[20][20];	// [과목][과목의 OX]
  private int iname=0; // 특정 이름 
  
  // private int 랭킹

  // 생성자
  public Test(){
	
  }

  public void set(int n){
	 	
	// 랜덤 학생의 답 
	for(int i=0;i<3;i++) {
		for(int j=0;j<20;j++) {
			this.stu[i][j] = (int)(Math.random()*4+1);
		}
	}
	
	// 이름
	this.number += n+1;
	this.iname += n+1;
	
	switch(iname) {
		case 1 : this.name="청하";
				 break;
		case 2 : this.name="소향";
				 break;
		case 3 : this.name="펑티모";
				 break;
		
		default :
			int x = (int)(Math.random()*7);
			int y = (int)(Math.random()*7);
			int z = (int)(Math.random()*7);
			
			// ────────────────────무작위 이름 설정 ────────────────────
			this.name = this.name1[x]+this.name2[y]+this.name3[z];
			break;
	}

	
	Dap(n);
	
	
  }
  
  public void Dap(int n) {
	  
	  int o=0;
	  int x=0;
	
	  
	  for(int i=0;i<3;i++) {
		  o=x=0;
		  switch(i) {
		  	case 0 : 
		  		for(int j=0;j<20;j++) {
			  		if(kor[i]==stu[i][j]) {
			  			o += 1;
			  			this.ox[i][j]="O";
			  		} else {
			  			x += 1;
			  			this.ox[i][j]="X";
			  		}
		  		}
		  		break;
		  	case 1 : 
		  		for(int j=0;j<20;j++) {
			  		if(eng[i]==stu[i][j]) {
			  			o += 1;
			  			this.ox[i][j]="O";
			  		} else {
			  			x += 1;
			  			this.ox[i][j]="X";
			  		}
		  		}
		  		break;
		  	case 2 : 
		  		for(int j=0;j<20;j++) {
			  		if(mat[i]==stu[i][j]) {
			  			o += 1;
			  			this.ox[i][j]="O";
			  		} else {
			  			x += 1;
			  			this.ox[i][j]="X";
			  		}
		  		}
		  		break;
		  }
		  this.tot[i]=o*5;
	  }
	  Cal(n);
  }
  
  public void Cal(int n) {		// 계산/산출
	  
	  for(int i=0;i<n;i++) {
		  
	  
	  this.ave[i] = this.tot[i]; // 40점은 기본 점수
	  
		  if(this.ave[i]>=95) {
			  grade[i] = "A+";
			  this.pass = "합격";
		  } else if(this.ave[i]>=90) {
			  grade[i] = "A0";
			  this.pass = "합격";
		  } else if(this.ave[i]>=85) {
			  grade[i] = "B+";
			  this.pass = "합격";
		  } else if(this.ave[i]>=80) {
			  grade[i] = "B0";
			  this.pass = "합격";
		  } else if(this.ave[i]>=75) {
			  grade[i] = "C+";
			  this.pass = "합격";
		  } else if(this.ave[i]>=70) {
			  grade[i] = "C0";
			  this.pass = "합격";
		  } else if(this.ave[i]>=65) {
			  grade[i] = "D+";
			  this.pass = "합격";
		  } else if(this.ave[i]>=60) {
			  grade[i] = "D0";
			  this.pass = "합격";
		  }
		  else {
			  grade[i] = "F";
			  this.pass = "불합격";
		  }
	  }  
  }
  
  public void OX() {
	  
	  int x=0;
	  int i=0;
	  
	  System.out.printf(" %8s \n",this.name);
	  
	  while(x<3) {
		  if (x==0) {
			  System.out.printf("%s 영역 %6s","언어"," ");
		  } else if(x==1){
			  System.out.printf("%s 영역 %3s","외국어"," ");
		  } else if(x==2) { 
			  System.out.printf("%s 영역 %6s","수리"," ");
		  }
		  /*			  
		  for (int i=0;i<3;i++) {
		  for (int j=0;j<20;j++) {
				  System.out.print(kor[j]+" ");
			  }
			  System.out.println("");
			  for (int j=0;j<20;j++) {
				  System.out.print(stu[i][j]+" ");
			  }
			  System.out.println("");
*/
		 
		  for (int j=0;j<20;j++) {
			  System.out.print(ox[x][j]+" ");
		  }

		  System.out.printf(" %3d \n",tot[i] );
		  x += 1;
		  i++;
		  
		  
	  }
	  System.out.println("─────────────────────────────────────────────────");
  }
  public void display() {	// 결과창 기본형식
	  System.out.printf("\n%12s %13s ","수험번호","이름");
	  System.out.printf(" %12s %13s %12s","언어","외국어","수리");
	  System.out.printf(" %12s %11s %10s %11s\n ","총합","평균","학점","합격여부");
	  System.out.println("────────────────────────────────────────────────────────────────────────────────────");
  }
  
public void dis_result(int n){	// 결과 정리
	  
	  System.out.printf(" %9d %5s %6s",this.number,this.name," ");
	  for(int num=0;num<3;num++) {
		  System.out.printf("%4s"," ");
		  System.out.printf(" %02d ",this.tot[num]);	// 언어 과목 점수
	  }
	  
	  System.out.printf(" %5d %6d %5s ",this.tot[n],this.ave[n],this.grade[n]);
	  
	  System.out.printf(" %6s \n",this.pass);
	
}
  
  public static void main(String[] args){
	 
	Scanner s = new Scanner(System.in);
	int num = 0;
	
	while (true){
		System.out.println("학생 수를 입력하세요 : ");
		num = s.nextInt();
		if(num<1 || num>100) 
			System.out.printf("입력 범위를 벗어났습니다!(1~100)\n다시 입력해주세요.");
		else 
			break;
	}
// 핵심 
	Test t1 = new Test();
	Test[] ta = new Test[num];
	
	for(int i=0;i<num;i++) {
		ta[i] = new Test();
		ta[i].set(i);
		ta[i].OX();
	}
	// 중복 아닌 디스플레이
	t1.display();
	
	for(int i=0;i<num;i++) {
		ta[i].dis_result(num);
	}

	
  } //main

} //class
