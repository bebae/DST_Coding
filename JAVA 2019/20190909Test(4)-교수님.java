package test4;
// a:26 b:23 c:20
import java.util.Scanner;
public class Test 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n; // �л��� 
		int[] score = null;
		
		int[] class_no = new int[] {26,23,20};
		boolean run = true;
		
		while(run)
		{
		  System.out.println("----------------");
		  System.out.println("  A�� ���� (a)    ");
		  System.out.println("  B�� ���� (b)    ");
		  System.out.println("  C�� ���� (c)    ");
		  System.out.println("  ����     (q)    ");
		  System.out.println("----------------");
		  System.out.print("You select : ?");
		  String select = s.next();
		  
		  if (select.equals("q"))
		  {
			  run = false;
			  System.out.println("exit program");
			  break;
		  }
		  else
		  {
			  switch(select)
			  {
			    case "a" : n = class_no[0]; //26
			               break;
			    case "b" : n = class_no[1]; //23
	               		   break;
			    case "c" : n = class_no[2]; //20
	                       break;
	            default : continue;
			  }
			  
			  score = new int[n]; // 26
			  // initialize
			  for (int i=0; i <score.length; i++)
				score[i] = 0;
			  // input
			  for (int i=0; i <score.length; i++)
				score[i] = (int)(Math.random()*41)+60;
			  
			  System.out.println("-------------------");
          	  System.out.println("  1. �� ���ϱ�      ");
          	  System.out.println("  2. ��ձ��ϱ�     ");
          	  System.out.println("  3. �ִ밪 ���ϱ�  ");
          	  System.out.println("  4. �ּҰ� ���ϱ� ");
          	  System.out.println("  5. ���� ����ϱ� ");
          	  System.out.println("-------------------");
          	  System.out.print("You select : ");
          	  int sel = s.nextInt();
          	  
          	  switch(sel)
          	  {
          	  case 1: // hap
          		  int sum =0;
          		  for (int i=0; i <score.length; i++)
     				sum += score[i];
          		  System.out.println("sum = " + sum);
          	      break;
          	  case 2 : // ave
          		  sum =0;
        		  for (int i=0; i <score.length; i++)
   				      sum += score[i];
        		  int ave = sum /score.length;
        		  System.out.println("ave = " + ave);
        		  break;
          	  case 3 : // max
          		  int max = 0;
          		  for (int i=0; i <score.length; i++)
          		  {
          			  if (max < score[i])
          				  max = score[i];
          		  }
          		  System.out.println("max = "+ max);
          		  break;
          	  case 4 : // min
         		  int min = 100;
         		  for (int i=0; i <score.length; i++)
         		  {
         			  if (min > score[i])
         				  min = score[i];
         		  }
         		  System.out.println("min = "+ min);
         		  break;
          	  case 5 : // result printing
        		  for (int i=0; i <score.length; i++)
                      System.out.println("�л�"+i+": " + score[i]);
        		  break; 
        	  default : continue;
          	  } //switch
		  } //else	
		}//while
	} // main
} //class
