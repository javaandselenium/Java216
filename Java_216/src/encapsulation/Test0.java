package encapsulation;

public class Test0 {

	private String name="John";
	private int phoneNumb=987865467;
	private double salary=3456.098;
	private int age=89;
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getPhoneNumb() {
		return phoneNumb;
	}
	public void setPhoneNumb(int phoneNumb) {
		this.phoneNumb = phoneNumb;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public int getAge() {
		return age;
	}

}
