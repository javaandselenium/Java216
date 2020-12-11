package interface1;

public class Myntraimplemntation implements Myntra {

	@Override
	public void signin() {
	System.out.println("sigin");
		
	}

	@Override
	public void addtocart() {
		System.out.println("addtocart");
		
	}

	@Override
	public void whishlist() {
		System.out.println("whislist");
		
	}

	@Override
	public void product() {
		System.out.println("product");
		
	}

	@Override
	public void payments() {
		System.out.println("paymets");
		
	}
	public static void main(String[] args) {
		Myntraimplemntation m=new Myntraimplemntation();
		m.signin();
		m.payments();
		m.whishlist();
		m.product();
	}
}
