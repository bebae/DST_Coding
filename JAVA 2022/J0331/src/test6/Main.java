// 0331 #6 n�� name mid fin rpt chul class
// ���� max, who? error? -> sol) array + class
package test6;

public class Main {
	public static void main(String[] args) {
	
		Test t = new Test();
		t.input_proc();
	    String max_person = t.find_max();
	    t.output_proc(max_person);
	}
}