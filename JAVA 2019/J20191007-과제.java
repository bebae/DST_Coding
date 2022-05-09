package test;

import java.util.Scanner;
public class Test{	// Test = 객체

  private int os;
  private int db;
  private int ic;
  private int sys;
  private int cs;
  private int tot=0;
  private int ave=0;
  private int number = 201903100;
  private String grade;
  private String pass;
  private String name="";
  private String name1[] = {"김","박","이","정","오","신","심","고"};
  private String name2[] = {"오","대","우","동","우","준","상","지"};
  private String name3[] = {"성","철","진","준","기","원","혁","권"};
  // private int 랭킹

  // 생성자
  public Test(){
	this.os = this.db = this.ic = this.sys= this.cs = 0;

  }

  public void get(int i){		// 랜덤값 지정 40~100
	 
 
	this.os = (int)(Math.random()*61+40);
	this.db = (int)(Math.random()*61+40);
	this.ic = (int)(Math.random()*61+40);
	this.sys = (int)(Math.random()*61+40);
	this.cs = (int)(Math.random()*61+40);
	
	this.number += i+1;
	int x = (int)(Math.random()*7);
	int y = (int)(Math.random()*7);
	int z = (int)(Math.random()*7);
	
	// ────────────────────무작위 이름 설정 ────────────────────
	this.name = this.name1[x]+this.name2[y]+this.name3[z];
	
	
	Cal();
	display_result();
  }
  public void Cal() {		// 계산/산출
	  
	  this.tot = this.os+this.db+this.ic+this.sys+this.cs;
	  this.ave = this.tot/5;
	  
	  if(this.ave>=90) {
		  grade = "A";
		  this.pass = "합격";
	  } else if(this.ave>=80) {
		  grade = "B";
		  this.pass = "합격";
	  } else if(this.ave>=70) {
		  grade = "C";
		  this.pass = "합격";
	  } else if(this.ave>=60) {
		  grade = "D";
		  this.pass = "합격";
	  }
	  else {
		  grade = "F";
		  this.pass = "불합격";
	  }
	  // 과락 50점 미만
	  if(this.os<50 || this.db<50 || this.ic<50 || this.sys<50 || this.cs<50) {
		  this.pass = "과락";
	  }
	  
	  
	}
  public void display() {	// 결과창 기본형식
	  System.out.printf("%12s %13s ","수험번호","이름");
	  System.out.printf(" %11s %9s %8s %8s %8s","운영체체","데이터베이스","정보통신","시스템분석","컴퓨터구조");
	  System.out.printf(" %7s %10s %8s %10s\n ","총합","평균","학점","합격여부");
	  System.out.println("────────────────────────────────────────────────────────────────────────────────────");
  }
  public void display_result(){	// 시험결과
	  
	  System.out.printf(" %9d %5s ",this.number,this.name);
	  System.out.printf(" %11d %7d %7d %7d %7d ",this.os,this.db,this.ic,this.sys,this.cs);
	  System.out.printf(" %6d %5d %4s ",this.tot,this.ave,this.grade);
	  System.out.printf(" %5s \n",this.pass);
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
	
	// 디스플레이 중복X
	t1.display();
	
	for(int i=0;i<num;i++) {
		ta[i] = new Test();
		ta[i].get(i);
	}
	
  } //main

} //class
