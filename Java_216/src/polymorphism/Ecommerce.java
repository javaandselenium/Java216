package polymorphism;

public class Ecommerce {

	public void shopping() {
		System.out.println("Shoping");
	}
}

class Amazon extends Ecommerce{
	public void shopping() {
		System.out.println("Shopping from amazon");
	}
}

class Myntra extends Ecommerce{
	public void shopping() {
		System.out.println("Shopping from myntra");
	}
}

class Flipkart extends Ecommerce{
	public void shopping() {
		System.out.println("Shopping from flipkart");
	}
}

class Demo
{
	public static void main(String[] args) {
		Ecommerce e=new Myntra();
		e.shopping();
	}
}