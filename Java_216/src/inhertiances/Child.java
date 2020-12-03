package inhertiances;

public class Child extends Parent{
	
	public void cycle() {
		System.out.println("Cycle is the property fromchild");
	}
	
	public void bike() {
		System.out.println("bike is the property fromchild");
	}

	public static void main(String[] args) {
	Child c=new Child();
	c.cycle();
	c.car();
	c.home();
	c.bike();

	}

}
