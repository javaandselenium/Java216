package interface1;

public class Test1 implements I1,I2{

	@Override
	public void car() {
		System.out.println("Car");
		
	}

	
	@Override
	public void red() {
		System.out.println("red");
	}

	@Override
	public void blue() {
		System.out.println("blue");
		
	}


	@Override
	public void home() {
		System.out.println("home");
		
	}
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.car();
		t.blue();
		t.home();
	}

	
}
