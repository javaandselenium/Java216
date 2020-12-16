package collections;

import java.util.ArrayList;

public class Test0 {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(20.00);
	a.add("Java");
	a.add('A');
	a.add("");
	a.add(10);
	a.add(true);
	System.out.println(a.size());
	//a.add(2,"Selenium");
	//a.clear();
	//a.remove(3);
	
	//System.out.println(a.isEmpty());
	
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
	}
	
	
	}

}
