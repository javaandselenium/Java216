package constructors;

public class Sub {

	Sub(int a, int b) {
		System.out.println(a - b);
	}

	Sub(double a, double b) {
		System.out.println(a - b);
	}

	Sub(int a, double b) {
		System.out.println(a - b);

	}

	Sub(double a, double b, int c) {
		System.out.println(a - b - c);
	}

	public static void main(String[] args) {
		Sub s=new Sub(10,5);
		Sub s1 = new Sub(30.00,10,10);

	}

}
