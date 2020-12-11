package interface1;

public class Test implements AtmMachine{

	@Override
	public void cardSlot() {
		System.out.println("cardslot");
		
	}

	@Override
	public void pinCode() {
		System.out.println("pincode");
		
	}

	@Override
	public void balance() {
		System.out.println("balance");
		
	}

	@Override
	public void cash() {
		System.out.println("cash");
		
	}
public static void main(String[] args) {
	Test t=new Test();
	t.cardSlot();
	t.cash();
	t.pinCode();
	t.balance();
}
}
