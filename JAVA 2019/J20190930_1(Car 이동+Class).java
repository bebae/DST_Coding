package test;

public class Test{	// Test = Car

  // field
  String name;
  String color;
  int loc;

  //construction  overloading= 조건 붙지 않은 클래스 1개와 조건이 붙은 클래스
  public Test(){	// Test = Car
	this.name = "avante";
	this.color = "white";
	this.loc = 0;
  }

  public Test(String name, String color){	// Test = Car
	this.name = name;
	this.color = color;
	this.loc = 0;
  }

  // method : member function
  // method : overloading
  public void fw(){
	loc += 10;
	if(this.loc > 1000) uturn();
	display_loc();
  }
  public void fw(int x){
	loc += x;
	if(this.loc > 1000) uturn();
	display_loc();
  }

  public void uturn(){
	loc -= 1000;
	display_loc();
  }

  public void bw(){
	loc -= 10;
	if(this.loc <0){
		this.loc = 0;
		System.out.println("no more bw");
	}

	display_loc();
  }
  public void bw(int x){
	loc -= x;
	if(this.loc <0){
		this.loc = 0;
		System.out.println("no more bw");
	}
	display_loc();
  }

  public void display_loc(){
	System.out.println(this.name+" currunt location :"+this.loc);
  }
  public void auto_moving(){	// random fw bw
	int sel = 0;
	int x = 0;
	for (int i=0;i<10;i++){
		
		sel = (int)(Math.random()*2+1);
		x = (int)(Math.random()*100+1);
		if (sel==1){ // fw
			fw(x);
		} else {
			bw(x);	
		}
	}
  
  }

  public static void main(String[] args){

	Test avante = new Test();					// Test = Car
	avante.fw();
	avante.bw();
	avante.fw(100);
	avante.bw(100);
	avante.auto_moving();
	System.out.println("───────────────────────────────");
	Test sonata = new Test("sonata","black");	// Test = Car
	sonata.fw();
	sonata.bw();
	sonata.fw(300);
	sonata.bw(300);
	avante.auto_moving();

  } // main

} // class
