package collections;

import java.util.LinkedList;

public class Test17 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
		System.out.println(l.get(3));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
	}

}
