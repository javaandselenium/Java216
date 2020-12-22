package collections;

import java.util.ArrayList;

public class Test20 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(10);
		a.add("jelly");
		a.add('A');
		a.add(20);
		
		for(Object r:a) {
			System.out.println(r);
		}

	}

}
