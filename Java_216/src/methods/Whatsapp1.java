package methods;

public class Whatsapp1 extends Whatsapp{
	
	public void status() {
		System.out.println("photos and videos and message");
	super.status();
	}
	
	public static void main(String[] args) {
		Whatsapp1 w=new Whatsapp1();
		w.status();
	}
}
