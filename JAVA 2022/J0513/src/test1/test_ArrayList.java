// 0513 #1
// arraryList alike python List 동적으로 배열 확장
// x = []  int[] x;
// x.append(0)  x= new int[10]
// 동적

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
		
		al.set(1,  "top");			// 배열 요소 지정(기존 요소 변경)
		System.out.println(al);
		
		al.remove("hellow ");		// 배열 요소 삭제(내용 기반)
		System.out.println(al);
		
		al.remove(0);				// 배열 요소 삭제(위치 기반)
		System.out.println(al);
		
		al.clear();					// 배열 초기화
		System.out.println(al);
		
		al.add("Python");
		System.out.println(al);
		System.out.println("ArrayList size = "+al.size());	// 배열의 크기
		
		al.add("hellow ");
		al.add("world ");
		al.add("java");
		System.out.println(al);
		
		System.out.println("────────────────────────────────");
		for(int i=0;i<al.size();i++)
			System.out.print(al.get(i)+" ");
		System.out.println();
		
		for(String str:al)			// 이런 식으로도 가능
			System.out.print(str+" ");
		System.out.println();
		
		Iterator it = al.iterator();
		while(it.hasNext()) {		// 다음에 오는 걸 받아 옴 이런 식으로도 가능
			System.out.print(it.next()+" ");
		}
		System.out.println("\n────────────────────────────────");
		
// ────────────────────────────────────────────────────────────────────────────
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
















