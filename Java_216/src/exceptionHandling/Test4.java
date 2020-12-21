package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {
	public void test() throws FileNotFoundException {
		FileInputStream f=new FileInputStream("./D");
		System.out.println("Hello java");
	}

	public static void main(String[] args) {
	Test4 t=new Test4();
	try {
	t.test();
	}
	catch(Exception e) {
		System.out.println("handled");
	}

	}

}
