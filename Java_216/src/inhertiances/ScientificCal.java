package inhertiances;

public class ScientificCal extends BasicCal {
	public void sinTeta() {
		System.out.println("sineteta");
	}
	
	public void cosTeta() {
		System.out.println("costeta");
	}
	

	public static void main(String[] args) {
		ScientificCal s=new ScientificCal();
		s.sinTeta();
		s.cosTeta();
	    s.add(10,20);
	    s.sub(90,40);

	}

}
