package methods;

public class Test7 {

	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}

	public void add(int a, double b) {
		System.out.println("integer and double");
	}

	public void add(double a, int b, int c) {
		System.out.println("double integer 1 and integer 2");
	}

	public void add(int b, int c, double a) {
		System.out.println("integer1 integer2 and double");
	}
	public static void main(String[] args) {
		Test7 t=new Test7();
		t.add(2,4);
		t.add(2,2, 3.6868);
	}

}
