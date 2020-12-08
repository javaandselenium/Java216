package typecasting;

public class Paper extends Pen{
	public void whitepaper() {
		System.out.println("whitepapaer");
	}
	
	public void blackpaper() {
		System.out.println("blackpaper");
	}

	public static void main(String[] args) {
		//upcasting
		Pen p=new Paper();
		p.redPen();
		p.bluePen();
		
		//downcasting
		Paper b=(Paper)p;
		b.redPen();
		b.blackpaper();
		b.blackpaper();
		b.whitepaper();

	}

}
