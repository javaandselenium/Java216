package collections;

import java.util.LinkedHashMap;

public class Test12 {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> t = new LinkedHashMap<String, Integer>();
		t.put("Ramesh", 123);
		t.put("Ganesh", 345);
		t.put("Mahesh", 567);
		t.put("Suresh", 123);

		System.out.println(t);
	}

}
