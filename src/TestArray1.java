
public class TestArray1 {

	private int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

	private void displayAll() {
		for (int nb : array) {
			System.out.print(nb + " ");
		}
	}

	private void displayAllInverseOrder() {
		for (int i = array.length - 1; i > -1; i--) {
			System.out.print(array[i] + " ");
		}
	}

	private void displayAllSupTo3() {
		for (int nb : array) {

			if (nb > 3) {
				System.out.print(nb + " ");
			}
		}
	}
	
	private void displayAllEven() {
		for (int nb : array) {
			if ((nb % 2) == 0) {
				System.out.print(nb + " ");
			}
		}
	}
	
	private int displayHighest() {
		int highest = array[0];		
		for (int nb : array) {
			if ( highest < nb) {
				highest = nb;
			}
		}
		return highest;
	}
	
	private int displayLowest() {
		int Lowest = array[0];
		
		for (int nb : array) {

			if ( Lowest > nb) {
				Lowest = nb;
			}
		}
		return Lowest;
	}

	public void makeExo1() {
		System.out.println("All ");
		displayAll();
		System.out.println("\nInverse order ");
		displayAllInverseOrder();
		System.out.println("\nThe numbers high than 3 are :");
		displayAllSupTo3();
		System.out.println("\nThe even numbers are :");
		displayAllEven();
		System.out.println("\nThe highest number is "+ displayHighest());
		System.out.println("The lowest number is "+ displayLowest());
	}

	public static void main(String[] args) {

		TestArray1 testArray1 = new TestArray1();
		testArray1.makeExo1();

	}

}
