package decisionStatements;

public class Test6 {

	public static void main(String[] args) {
		int atmpin=1234;
		int amt=500;
		
		if(atmpin==1234) {
			System.out.println("Thank for the correct pin");
			
			if(amt<=500) {
				System.out.println("sorry you cannot withdraw");
			}
			
			else {
				System.out.println("you can withdraw");
			}
		}
		else {
			System.out.println("Invalid pin");
		}
		  

	}

}
