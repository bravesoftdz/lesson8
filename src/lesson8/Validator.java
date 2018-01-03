package lesson8;

public class Validator {

	public static void validateInt(int x) {
		if (x > 0) {
			System.out.println("positive");
		} else if (x < 0) {
			System.out.println("negative");
		} else if(x == 0){
			System.out.println("zero");
		}
	}

}
