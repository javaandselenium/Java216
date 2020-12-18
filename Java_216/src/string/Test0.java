package string;

public class Test0 {

	public static void main(String[] args) {
	String s="  I LOVE JAVA  ";
	System.out.println(s.length());
	System.out.println(s.charAt(10));
	System.out.println(s.concat("Selenium"));
	System.out.println(s.equals("i love java"));
	System.out.println(s.equalsIgnoreCase(" i love java "));
	System.out.println(s.indexOf('E'));
	System.out.println(s.indexOf("JAVA"));
	System.out.println(s.isEmpty());
	System.out.println(s.isBlank());
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	String t = s.trim();
	System.out.println(t);
	System.out.println(t.length());
	

	}

}
