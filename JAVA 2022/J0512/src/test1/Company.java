//0512 #1 
// ���, interface ��������(try catch)
// �������
// �����ȣ ���� �μ� ��å

package test1;
import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String empNo = null;
        String name = null;
        String part = null;
        String position = null;
        
        Employee emp = null; //���
        Manager ma = null; //������
	        
	    try {
	        System.out.print("��� �Է� : ");
	        empNo = sc.next();
	        System.out.print("���� �Է� : ");
	        name = sc.next();
	        System.out.print("�μ� �Է� : ");
	        part = sc.next();
	        System.out.print("���� 1:��� 2:�븮 3:���� 4: ���� �Է� : ");
	        position = sc.next();
	     } catch(Exception e) {
	    	System.out.println("�Է� ����");
	     } // try catch
	    
	    if (position.equals("1") || position.equals("2")) { 
	    	//System.out.println("���");
	    	emp = new Employee(empNo, name, part);
	    	emp.result();
	    } else if (position.equals("3") || position.equals("4")) {
	    	//System.out.println("manager");
	    	ma = new Manager(empNo, name, part, position);
	    	ma.result();
	    }
   
    }	// main
}
