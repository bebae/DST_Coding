package test;

import java.util.Scanner;
public class Test{	// Test = ��ü

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
  private String name1[] = {"��","��","��","��","��","��","��","��"};
  private String name2[] = {"��","��","��","��","��","��","��","��"};
  private String name3[] = {"��","ö","��","��","��","��","��","��"};
  // private int ��ŷ

  // ������
  public Test(){
	this.os = this.db = this.ic = this.sys= this.cs = 0;

  }

  public void get(int i){		// ������ ���� 40~100
	 
 
	this.os = (int)(Math.random()*61+40);
	this.db = (int)(Math.random()*61+40);
	this.ic = (int)(Math.random()*61+40);
	this.sys = (int)(Math.random()*61+40);
	this.cs = (int)(Math.random()*61+40);
	
	this.number += i+1;
	int x = (int)(Math.random()*7);
	int y = (int)(Math.random()*7);
	int z = (int)(Math.random()*7);
	
	// ���������������������������������������������� �̸� ���� ����������������������������������������
	this.name = this.name1[x]+this.name2[y]+this.name3[z];
	
	
	Cal();
	display_result();
  }
  public void Cal() {		// ���/����
	  
	  this.tot = this.os+this.db+this.ic+this.sys+this.cs;
	  this.ave = this.tot/5;
	  
	  if(this.ave>=90) {
		  grade = "A";
		  this.pass = "�հ�";
	  } else if(this.ave>=80) {
		  grade = "B";
		  this.pass = "�հ�";
	  } else if(this.ave>=70) {
		  grade = "C";
		  this.pass = "�հ�";
	  } else if(this.ave>=60) {
		  grade = "D";
		  this.pass = "�հ�";
	  }
	  else {
		  grade = "F";
		  this.pass = "���հ�";
	  }
	  // ���� 50�� �̸�
	  if(this.os<50 || this.db<50 || this.ic<50 || this.sys<50 || this.cs<50) {
		  this.pass = "����";
	  }
	  
	  
	}
  public void display() {	// ���â �⺻����
	  System.out.printf("%12s %13s ","�����ȣ","�̸�");
	  System.out.printf(" %11s %9s %8s %8s %8s","�üü","�����ͺ��̽�","�������","�ý��ۺм�","��ǻ�ͱ���");
	  System.out.printf(" %7s %10s %8s %10s\n ","����","���","����","�հݿ���");
	  System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
  }
  public void display_result(){	// ������
	  
	  System.out.printf(" %9d %5s ",this.number,this.name);
	  System.out.printf(" %11d %7d %7d %7d %7d ",this.os,this.db,this.ic,this.sys,this.cs);
	  System.out.printf(" %6d %5d %4s ",this.tot,this.ave,this.grade);
	  System.out.printf(" %5s \n",this.pass);
  }	

  public static void main(String[] args){
	 
	Scanner s = new Scanner(System.in);
	int num = 0;
	
	while (true){
		System.out.println("�л� ���� �Է��ϼ��� : ");
		num = s.nextInt();
		if(num<1 || num>100) 
			System.out.printf("�Է� ������ ������ϴ�!(1~100)\n�ٽ� �Է����ּ���.");
		else 
			break;
	}
// �ٽ� 
	Test t1 = new Test();
	Test[] ta = new Test[num];
	
	// ���÷��� �ߺ�X
	t1.display();
	
	for(int i=0;i<num;i++) {
		ta[i] = new Test();
		ta[i].get(i);
	}
	
  } //main

} //class
