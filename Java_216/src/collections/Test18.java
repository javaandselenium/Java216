package collections;

import java.util.TreeSet;

public class Test18 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet<>();
		t.add(10);
		t.add(30);
		t.add(20);
		t.add(50);
		t.add(40);
		System.out.println(t);
		System.out.println(t.descendingSet());

	}

}
