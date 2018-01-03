package lesson8;

public class A implements SomeInterface{

	// static {
	// System.out.println("Static 1 A");
	// }
	//
	// static {
	// System.out.println("Static 2 A");
	// }
	//
	// {
	// System.out.println("Logic 1 A");
	// }
	//
	// {
	// System.out.println("Logic 2 A");
	// }
	
	@Override
	public void doSmth3() {
		System.out.println("A doSmth3");
	}

	// int x;
	//
	// public static void doSmth() {
	// System.out.println("A static");
	// }
	//
	// public void doSmth2() {
	// x = 3;
	// System.out.println("A non-static");
	// }
}
