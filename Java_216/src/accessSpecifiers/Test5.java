package accessSpecifiers;

public class Test5 {
	protected int a = 10;

	protected void add() {
		System.out.println("protected method");
	}

	protected Test5() {
		System.out.println("protected constructot");
	}

	public static void main(String[] args) {
		Test5 t2 = new Test5();
		t2.add();
		System.out.println("protected varaible " + t2.a);

	}

}
