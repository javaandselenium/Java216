package collections;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20.00);
		a.add("Java");
		
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20.00);
		a1.add("Java");
		
		System.out.println(a.contains(10));
		System.out.println(a.equals(a1));
	}

}
