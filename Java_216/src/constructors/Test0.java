package constructors;

public class Test0 {
	int a=100;
	
	public void add() {
		System.out.println("add");
	}
	
	Test0(){
		System.out.println("constructors");
	}

	public static void main(String[] args) {
		Test0 t=new Test0();
		t.add();
		System.out.println(t.a);

	}

}
