package methods;

public class Test5 {
	int a=900;
	static int b=20;
	
	public void sub() {
		System.out.println("subtracting");
	}
	
	public static void mul() {
		System.out.println("mul");
	}
	
	public void add() {
		System.out.println("adding");
	}

	public static void main(String[] args) {
		Test5 t=new Test5();
		t.add();
		System.out.println(t.a);
		t.sub();
		Test5.mul();
		System.out.println(Test5.b);
		Test4.sub1();

	}

}
