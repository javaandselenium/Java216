package methods;

public class Test6 {
	int a=10;
	static int b=100;
	
	public void add() {
		System.out.println("adding");
	}
	
	public static void sub() {
		System.out.println("subtracting");
	}

	public static void main(String[] args) {
		Test6 t=new Test6();
		t.add();
		System.out.println(t.a);
		Test6.sub();
		System.out.println(Test6.b);

	}

}
