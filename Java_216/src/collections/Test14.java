package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test14 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(20);
		a.add(30);
		a.add(10);
		a.add(40);
		a.add(50);
		System.out.println("BeforeSwapping "+a);
		Collections.swap(a,0,a.size()-1);
		System.out.println("Afterswapping "+a);
		Collections.swap(a,1,2);
		System.out.println(a);
		

	}

}
