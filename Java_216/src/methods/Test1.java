package methods;

public class Test1 {

	static String name = "John";
	static String bankName = "ABC";
	static int balance = 1000;
	static int withdrwaAmt = 500;

	public static void withdraw() {
		int currentBal = balance - withdrwaAmt;
		System.out.println(currentBal);
	}

	public static void main(String[] args) {
		withdraw();
	}

}
