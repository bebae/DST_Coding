package test_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// �迭 ArrayList

public class Test {

	public static void main(String[] args) {
		List l1 = new ArrayList();

		l1.add("ȫ�浿");
		l1.add("park");
		l1.add(new String("��ƹ���"));
		
		l1.add(1,"1st element");		// �迭 (Array)List Ư�� ��ġ�� ��� ����ֱ�
		
	// #1
		for(int i=0;i<l1.size();i++)
			System.out.println(l1.get(i));
		System.out.println("---------------");
		
	// #2
		Iterator iterlator = l1.iterator();
		while (iterlator.hasNext()) {
			System.out.println((String)iterlator.next());
		}
		System.out.println("---------------");
		
		
	// #3
		int index = l1.indexOf("ȫ�浿");
		l1.add(index,"�̾ƹ���");
		
		for(Object object:l1) {
			System.out.println((String)object);
		}
		System.out.println("---------------");
		
		
	
	}

}
