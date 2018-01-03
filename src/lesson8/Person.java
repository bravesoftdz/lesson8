package lesson8;

public class Person {

	private int salary;
	private int ages;
	private static int k;
	public static int employes;
	public int id;

	public static void setK(int k) {
		Person.k = k;
	}

	public static int getK() {
		return Person.k;
	}

	public Person(int id) {
		super();
		employes++;
		this.id = id;
	}

	public Person(int id, int salary, int ages) {
		this(id);
		this.ages = ages;
		this.salary = salary * k;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void raiseSalary() {
		this.salary = this.salary * k;
	}

}
