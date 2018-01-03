package lesson8;

public class MainPerson {

	public static void main(String[] args) {

		// System.out.println("p1 person " + p1.getSalary());
		// System.out.println("p2 person " + p2.getSalary());
		//
		// System.out.println("===========================================");
		//
		// p1.raiseSalary();
		// p2.raiseSalary();
		//
		// Person.setK(2);
		//
		// System.out.println("p1 person " + p1.getSalary());
		// System.out.println("p2 person " + p2.getSalary());

		Person.setK(2);

		Person p1 = new Person(1, 500, 5);
		Person p2 = new Person(2, 100, 1);
		Person p3 = new Person(4, 100, 1);

		// p1.raiseSalary();
		// p2.raiseSalary();
		// p3.raiseSalary();

		System.out.println("p1 salary " + p1.getSalary());
		System.out.println("p2 salary " + p2.getSalary());
		System.out.println("p3 salary " + p3.getSalary());

		System.out.println("===========================================");

		System.out.println("Total employes: " + Person.employes);
		System.out.println("Total salary: " + (p1.getSalary() + p2.getSalary() + p3.getSalary()));

		System.out.println("===========================================");
		
		
		

	}

}
