package test;

import java.util.Scanner;
public class Test{
  public static void main(String[] args){
	
	int[] subj = new int[3];		// 과목수
	int tot = 0;				// kor = eng = mat =90;
	
	for (int i=0;i<subj.length;i++){
		subj[i] = 90;
		tot += subj[i];
	}

	int ave = tot/subj.length;

	while (){
	
		if (ave >= 90){
			grade = "A";
		} else if(ave >= 80){
			grade = "B";
		} else if(ave >= 70){
			grade = "C";
		} else if(ave >= 60){
			grade = "D";
		} else {
			grade = "F";
		}
	} //while



  }
}
