package exceptionHandling;

public class Test0 {

	public void demo() {
		System.out.println("Hello java");
	}

	public static void main(String[] args) {
		try {
			int a = 1 / 0;
		} catch (Exception e) {
			System.out.println("handled");
		}
		Test0 t = new Test0();
		t.demo();
		System.out.println("bye");

	}

}
