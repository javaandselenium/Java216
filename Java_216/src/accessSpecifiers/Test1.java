package accessSpecifiers;

public class Test1 {
	public int a=10;
	
	public void add() {
		System.out.println("public method");
	}
	
	public Test1() {
		System.out.println("public constructor");
	}

	public static void main(String[] args) {
	Test1 t=new Test1();
	t.add();
	System.out.println("Public vararible "+t.a);
	
	Test4 t1=new Test4(); 
	t1.mul();
	System.out.println("default vararible "+t1.a);
	}

}
