package collections;

import java.util.Vector;

public class Test2 {

	public static void main(String[] args) {
		Vector c=new Vector();
		c.add(10);
		c.add('A');
		c.add("java");
		c.add(true);
		c.add(10);
		c.add(10);
		c.add('A');
		c.add("java");
		c.add('A');
		c.add("java");
		c.add(true);
		c.add(10);
		c.add(10);
		
		System.out.println("The size of the list " +c.size());
		
		for(int i=0;i<c.size();i++) {
			System.out.println(c.get(i));
		}
		
		System.out.println("The capacity of the list "+c.capacity());
		
		
		

	}

}
