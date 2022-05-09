
// 배열 메모리 차지
// cpu에 부담이 가며 os에 영향

class Test{

  private static int func_sum(int kor,int eng,int mat){
  
	//processing
	int tot = kor+eng+mat;
	return tot; 
  }

  public static void main(String[] args){

	//local var.
	int kor, eng, mat;
	
	//input
	kor = eng = mat = 90;
	
	int tot = func_sum(kor,eng,mat);

	//output
	System.out.println("tot = "+tot);
	System.out.println("ave = "+ave);


  }
}
