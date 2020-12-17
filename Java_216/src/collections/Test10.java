package collections;

import java.util.TreeMap;

public class Test10 {

	public static void main(String[] args) {
		TreeMap<String,Integer>t=new TreeMap<String,Integer>();
		t.put("Ramesh",123);
		t.put("Ganesh",345);
		t.put("Mahesh",567);
		t.put("Suresh",123);
		
		System.out.println(t);
		System.out.println(t.keySet());
		System.out.println(t.values());
	}

}
