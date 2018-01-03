package lesson8;

public class MainApp {

	// private int x;

	public static void main(String[] args) {

		// Validator.validateInt(0);
		// Validator val = new Validator();
		// val.validateInt(-5);

		// A a = new A();
		// B b = new B();
		// A ab = new B();
		// A ba = new B();

		SomeInterface sia = new A();
		SomeInterface sib = new B();
		SomeInterface sic = new C();

		sia.doSmth3();
		sib.doSmth3();
		sic.doSmth3();
		
		performOperation(sia);

		// A.doSmth(); //Class name
		// a.doSmth();
		// a.doSmth2(); //
		//
		//
		// B.doSmth(); //Class name
		// b.doSmth();
		// b.doSmth2();
		//
		// ab.doSmth();
		// ab.doSmth2();
		//
		// ba.doSmth();
		// ba.doSmth2();

	}

	public static void performOperation(SomeInterface si) {
		System.out.println("I'm working!");
		si.doSmth3();
	}

}
