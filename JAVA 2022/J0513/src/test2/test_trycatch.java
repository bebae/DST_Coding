// 0513 #2
// �������� trycatch

package test2;
import java.util.Scanner;

public class test_trycatch {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0, y = 0, z = 0;
		
		x=(int)(Math.random()*100);
		y=(int)(Math.random()*100);
		
		// ������ 0�� �����߻� -> 5/0
		
		while(y==0) {
			y=sc.nextInt();
		}
		if(y == 0) {
			System.out.println("divide by zero error");
		} else {
			try {
				z = x / y;
				System.out.printf("x : %d / y : %d / z : %d",x,y,z);
			} catch(ArithmeticException e) {	// ���� ����
				System.out.println("���� Error");
			} finally {		// try catch�� ����� ������� �׻� ������ �����
				System.out.println("\n���� �Ϸ�");
			}
		}
		
	}
}

/*
* try { 
* �����̶�� �� �ڵ�� �ƹ��� �������� ����� ���ۺ��� ������ ����ȴ�. 
* ������ ��쿡 ���� ���ܰ� �߻��� �� �ִ�. 
* ���ܴ� throw ���� ���� ���������� �߻��� ���� �ְ�, 
* �Ǵ� ���ܸ� �߻���Ű�� �޼����� ȣ�⿡ ���� �߻��� ���� �ִ�. 
* } catch (e) {
* �� ��� ������ ������� ���� try ��Ͽ��� ���ܰ� �߻��� ��쿡�� ����ȴ�. 
* �� ����鿡�� ���� ���� e�� ����Ͽ� Error ��ü �Ǵ� �տ��� ���� �ٸ� ���� ������ �� �ִ�. 
* �� ��Ͽ����� ��Ե� �� ���ܸ� ó���� ���� �ְ�, 
* �׳� �ƹ��͵� ���� �ʰ� ���ܸ� ������ ���� �ְ�, 
* �ƴϸ� throw �� ����ؼ� ���ܸ� �ٽ� �߻���ų ���� �ִ�. 
* } finally { 
* �� ��Ͽ��� try ��Ͽ��� �Ͼ �Ͽ� ������� ������ ����� �ڵ尡 ��ġ�Ѵ�. 
* �� �ڵ�� try ����� ��Ե� ����Ǹ� ����ȴ�. 
* try ����� ����Ǵ� ��Ȳ�� ������ ����. 
* 1) ���������� ����� ���� �������� �� 
* 2) break, continue �Ǵ� return ���� ���ؼ� 
* 3) ���ܰ� �߻������� catch ������ ó������ �� 
* 4) ���ܰ� �߻��߰� �װ��� ������ ���� ä �������� ��  
* } */

