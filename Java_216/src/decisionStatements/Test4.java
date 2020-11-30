package decisionStatements;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
       int num = s.nextInt();
       
       if(num%2==0) {
    	   System.out.println(num+"it is even number");
       }
       else {
    	   System.out.println(num+"it is oddnumber");
       }
	}

}
