package accessSpecifiers;

public class Test2 {

	public static void main(String[] args) {
		Test1 t=new Test1();
		t.add();
		System.out.println("Public vararible "+t.a);

		Test3 t=new Test3();
		t.sub();
		System.out.println("Private varaible "+t.a);
	}

}
