package test_1;
// ����ó��
/*try{

    ���� �߻� ���ɼ��� �ִ� �����;

}catch(���� Ÿ��1 �Ű�������){

    ����Ÿ��1�� ���ܰ� �߻��� ��� ó�� �����;

}catch(���� Ÿ�� n �Ű�������){

    ����Ÿ�� n�� ���ܰ� �߻��� ��� ó�� �����;

}finally{

    �׻� ������ �ʿ䰡 �ִ� �����;

}
 */
public class Test {

	public static void process_routine() {
		System.out.println("ok processed");
	}
	public static void main(String[] args) {
		
		int c=0;
		try {			// try catch ���� ó���� ���(�߿�)
			
		
			c= 4/0;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			c = -1;
			System.out.println(c);
		} finally {		// ���� catch ������ ��� ���� ������ ���� = ������ ����� �� �ݴ� ��ɰ� ���� �׻� �����ؾ� �� �ʿ䰡 �ִ� ��쿡 ���
			process_routine();
		}
	}

}
