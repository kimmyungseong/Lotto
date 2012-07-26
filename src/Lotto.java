import java.util.Random;

public class Lotto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printLotto();

	}

	public static void printLotto() {
		for (int i = 0; i < 6; i++) {
			System.out.println(getNumber(random) + 1);
		}
	}

	static Random random = new Random();

	private static int getNumber(Random random) {
		return random.nextInt(45);
	}

}
