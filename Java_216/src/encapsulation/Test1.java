package encapsulation;

public class Test1 {

	public static void main(String[] args) {
		Test0 t=new Test0();
		System.out.println(t.getAge());
		System.out.println(t.getName());
		System.out.println(t.getPhoneNumb());
		t.setPhoneNumb(123456789);
		System.out.println("After modification "+t.getPhoneNumb());
		System.out.println(t.getSalary());
		t.setSalary(3458768.7877);
		System.out.println("After increment of salary"+t.getSalary());
		

	}

}
