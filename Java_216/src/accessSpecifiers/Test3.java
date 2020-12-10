package accessSpecifiers;

public class Test3 {
	private int a = 10;

	private void sub() {
		System.out.println("private method");
	}

	private Test3() {
		System.out.println("private constructot");
	}

	public static void main(String[] args) {
		Test3 t=new Test3();
		t.sub();
		System.out.println("Private varaible "+t.a);
		
		Test4 t1=new Test4(); 
		t1.mul();
		System.out.println("default vararible "+t1.a);

	}

}
