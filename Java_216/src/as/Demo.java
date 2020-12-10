package as;

import accessSpecifiers.Test1;
import accessSpecifiers.Test3;
import accessSpecifiers.Test4;
import accessSpecifiers.Test5;

public class Demo extends Test5{

	public static void main(String[] args) {
		Test1 t=new Test1();
		t.add();
		System.out.println("Public vararible "+t.a);

		
		Demo t2 = new Demo();
		t2.add();
		System.out.println("protected varaible " + t2.a);
	}

}
