/*
0923-3
toy Car
	field	: color,speed
	method	: fw,bw,stop,fill.... action
toy char
	field	: height, weight
	method	:	eat,speak
score
	field	: width, height
	method	: 
score
	field	: 과목점수
	method	: 총점구하기, 평균구하기, 최대, 최소....

*/

package Test;

public class test{

  int x,y;

  public Test(){
	x=20; y=10;
  }
  


  public static void main(String[] args){
	Test t = new Test();  
  	
	for (int i=0;i<10;i++){
	
	if (x>y){
			System.out.println("x가 y보다 크다");
		}else if (x==y){
			System.out.println("x와 y가 같다");
		}else
			System.out.println("x가 y보다 작다");
	}

  }
}
