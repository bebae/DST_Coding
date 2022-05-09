package test3;
import java.util.Scanner;
public class Test 
{
	public static void main(String[] args) 
	{
		int[] subj; //과목
		int n;  //과목 수
        boolean run = true; //true false
        int tot = 0, ave = 0;
        String grade ="F";
        String yn = "";
        Scanner s = new Scanner(System.in);
        while(run)
        {
        	System.out.println("Continue(y/n)?");
        	yn = s.next(); // "y" "n"
        	if (yn.equals("n"))
        	{
        		System.out.println("end program");
        		run = false;
        		break;
        	}
        	
        	// yes
        	System.out.print("n(3~5)? ");
        	n = s.nextInt();
        	subj = new int[n];
        	//input
        	for (int i=0; i < subj.length;i++)
  	      	{
  	            System.out.print("과목"+i+":");
  	    		subj[i] = s.nextInt();
  	      	}
        	
        	// save the tot and ave, grade
        	for (int i=0; i < subj.length;i++)
        		tot = tot + subj[i];
        	ave = tot / subj.length;
        	switch (ave / 10)
        	{
        	   case 10:
        	   case  9: grade = "A";
        	            break;
        	   case  8: grade = "B";
        	            break;
        	   case  7: grade = "C";
        	            break;
        	   case  6: grade = "D";
        	            break;
        	   default :grade = "F";
        	            break;
        	}
        	
        	// output
        	for (int i=0; i < subj.length;i++)
  	      	  System.out.print("과목"+i+": "
        	   +subj[i]); // 과목0 : 90
        	System.out.println("tot : " + tot);
        	System.out.println("ave : " + ave);
        	System.out.println("grade : " + grade);    	
        } // while
	} // main
}  //class