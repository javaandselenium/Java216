package exceptionHandling;

public class Test3 {

	public void demo() {
		System.out.println("close the DB");
	}

	public static void main(String[] args) {
		try {
			int i = 1 / 0;
		} catch (Exception e) {
			System.out.println("handled");
		} finally {
			Test3 t = new Test3();
			t.demo();
			System.out.println("hello");
		}

	}

}
