package loops;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		//String name="Ananya";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		//String name=s.nextLine();
		String name = s.next("1234");
		
		while(name=="1234") {
			System.out.println("crrt name");
		}
System.out.println("hello");
	}

}
