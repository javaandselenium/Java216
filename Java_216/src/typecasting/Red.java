package typecasting;

public class Red extends Blue {
	public void redwater() {
		System.out.println("redWater");
	}
	public void redInk() {
		System.out.println("redink");
	}

	public static void main(String[] args) {
	Blue b=new Red();
	b.blueInk();
	b.blueWater();
	
	}

}
