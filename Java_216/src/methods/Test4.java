package methods;

public class Test4 {
	int a=100;
	static int b=200;
	
	public void add() {
		System.out.println("adding");
	}
	
	public static void sub1() {
		System.out.println("subtracting");
	}

	public static void main(String[] args) {
		System.out.println(Test4.b);
		sub1();
		
		Test4 t=new Test4();
		System.out.println(t.a);
		t.add();
		
		
		

	}

}
