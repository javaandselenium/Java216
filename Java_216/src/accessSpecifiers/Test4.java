package accessSpecifiers;

public class Test4 {

	int a = 10;

	void mul() {
		System.out.println("default method");
	}

	Test4() {
		System.out.println("default constructor");
	}

	public static void main(String[] args) {
		Test4 t1=new Test4(); 
			t1.mul();
			System.out.println("default vararible "+t1.a);
			
			Test5 t2 = new Test5();
			t2.add();
			System.out.println("protected varaible " + t2.a);
		}


}
