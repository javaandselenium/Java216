package decisionStatements;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amt = s.nextInt();
		if(amt>1000)
		System.out.println("withdraw");
	}

}
