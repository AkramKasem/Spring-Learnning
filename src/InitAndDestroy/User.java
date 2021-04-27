package InitAndDestroy;

public class User {

	private Person person;
	private double salary;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Person person, double salary) {
		super();
		this.person = person;
		this.salary = salary;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [person=" + person + ", salary=" + salary + ", getPerson()=" + getPerson() + ", getSalary()="
				+ getSalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public void Start() {
		System.out.println("Hello Akram in my project");

	}

	public void End() {
		System.out.println("Bye Bye Akram See you Later");
	}

}
