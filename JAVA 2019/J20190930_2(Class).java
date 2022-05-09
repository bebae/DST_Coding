package test;

public class Test{	// Test = Sungjuk

  private int kor;
  private int eng;
  private int mat;
  private int tot=0;
  private int ave=0;
  private String grade;
  // private int 랭킹

  // 생성자
  public Sungjuk(){
	this.kor = this.eng = this.mat = 0;

  }
  public Sungjuk(int x){
	this.kor = this.eng = this.mat = x;
  }
  public void exam(){
	this.kor = (int)(Math.random()*100);
	this.eng = (int)(Math.random()*100);
	this.mat = (int)(Math.random()*100);
	if (this.kor==0)
		this.kor = kor;
	else
		this.kor += (int)(kor*0.4);

	if (this.eng==0)
		this.eng = kor;
	else
		this.eng += (int)(eng*0.4);

	if (this.mat==0)
		this.mat = mat;
	else
		this.mat += (int)(mat*0.4);
	
	display_result();
  }
  public void display_result(){	// 시험결과
	this.tot = this.kor+this.eng+this.mat;
	this.ave = this.tot/3;
	if(this.ave>=90)
		grade = "A";
	else if(this.ave>=80)
		grade = "B";
	else
		grade = "C";
  }
  public void score_update(){	// 추가시험(성적 올려주기)
	int curr_score = get_score();
	if(curr_score < 70){
		extra_rpt();
	}
  }

  public int get_score(){	// 전역변수 값 받아오기 class
	return this.ave;
  }
  public void extra_rpt(){	// 추가시험 성적보정
	int curr_score = get_score();
	if(curr_score <= 60)
		this.ave = 70;
	else
		this.ave = this.ave+10;
  }

  public static void main(String[] args){
	
	Sungjuk a = new Sungjuk();
	a.exam();				// 시험
	a.score_update();		// 추가 시험

	Sungjuk b = new Sungjuk();
	b.exam();

	Sungjuk c = new Sungjuk();
	c.exam();
	c.score_update();

	
  } //main

} //class
