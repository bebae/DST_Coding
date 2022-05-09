package Test;

public class test{

  //field
  int kor,eng,mat;

  public Test(){	//생성자
	this.kor = this.eng = this.mat = 90;
  }
  //method - member func
  public int func_sum(){
	int tot = this.kor+this.eng+this.mat;
	System.out.println("tot ="+tot);
	return tot;
  }


  public static void main(String[] args){
	Test t = new Test();
	// kor = 90;/ t.kor = 90; (X) 전역변수는 이런 식으론 선언불가
	// t.input(90,90,90); kor=90 (X) 보안

	t.func_sum();
  }
}
