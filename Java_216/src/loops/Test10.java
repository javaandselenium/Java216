package loops;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the time");
		int time = s.nextInt();
		
		if(time<12) {
			System.out.println("Good morning");
		}
		else if(time<18) {
			System.out.println("Good eveing");
		}

		else {
			System.out.println("good night");{
	
			}
		}
	}

}
