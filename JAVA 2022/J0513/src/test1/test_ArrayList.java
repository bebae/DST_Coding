// 0513 #1
// arraryList alike python List �������� �迭 Ȯ��
// x = []  int[] x;
// x.append(0)  x= new int[10]
// ����

package test1;
import java.util.ArrayList;
import java.util.Iterator;

public class test_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("hellow ");
		al.add("world ");
		al.add("java");
		System.out.println(al);		// al[0] al[1] al[2]
		
		al.set(1,  "top");			// �迭 ��� ����(���� ��� ����)
		System.out.println(al);
		
		al.remove("hellow ");		// �迭 ��� ����(���� ���)
		System.out.println(al);
		
		al.remove(0);				// �迭 ��� ����(��ġ ���)
		System.out.println(al);
		
		al.clear();					// �迭 �ʱ�ȭ
		System.out.println(al);
		
		al.add("Python");
		System.out.println(al);
		System.out.println("ArrayList size = "+al.size());	// �迭�� ũ��
		
		al.add("hellow ");
		al.add("world ");
		al.add("java");
		System.out.println(al);
		
		System.out.println("����������������������������������������������������������������");
		for(int i=0;i<al.size();i++)
			System.out.print(al.get(i)+" ");
		System.out.println();
		
		for(String str:al)			// �̷� �����ε� ����
			System.out.print(str+" ");
		System.out.println();
		
		Iterator it = al.iterator();
		while(it.hasNext()) {		// ������ ���� �� �޾� �� �̷� �����ε� ����
			System.out.print(it.next()+" ");
		}
		System.out.println("\n����������������������������������������������������������������");
		
// ��������������������������������������������������������������������������������������������������������������������������������������������������������
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		System.out.println(arr);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}	// main

}
















