import java.util.Arrays;

public class TestArrayTri {

	private int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

	public void display(int[] anArray) {
		for (int nb : anArray) {
			System.out.print(nb + " ");
		}
		System.out.println();
	}

	private int[] triBulle() {
		int[] arrayCloned = array.clone();
		int temp;
		boolean permit = false;
		do {
			permit = false;
			for (int i = 0; i < arrayCloned.length - 1; i++) {
				if (arrayCloned[i] > arrayCloned[i + 1]) {

					temp = arrayCloned[i];
					arrayCloned[i] = arrayCloned[i + 1];
					arrayCloned[i + 1] = temp;
					permit = true;
				}
			}
		} while (permit);

		return arrayCloned;
	}

	private int[] triUsingArrays() {
		int[] arrayCloned = array.clone();
		Arrays.sort(arrayCloned);
		return arrayCloned;
	}

	public void makeExo3() {
		System.out.println("triBulle : ");
		display(triBulle());
		System.out.println("Using Arrays : ");
		display(triUsingArrays());
	}

	public static void main(String[] args) {

		TestArrayTri testArrayTri = new TestArrayTri();
		testArrayTri.makeExo3();

	}
}
