package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test5 {
	public void test() {
		try {
		FileInputStream f=new FileInputStream("./D");
		}
		catch(Exception w) {
			System.out.println("Hanled");
		}
		System.out.println("Hello java");
	}
	public static void main(String[] args) {
		Test5 t=new Test5();
		t.test();
	}
}
