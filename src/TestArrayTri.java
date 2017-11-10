import java.util.Arrays;

public class TestArrayTri {

	private  int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
	
	private void triUsingArrays() {
		int[] arrayCloned = array.clone();
		Arrays.sort(arrayCloned);
		for(int nb : arrayCloned) {
			System.out.print(nb+ " ");
		}
	}
	
	public void makeExo3() {
		System.out.println("Using Arrays : ");
		triUsingArrays();
	}
	
	
	public static void main(String[] args) {

		TestArrayTri testArrayTri = new TestArrayTri();
		testArrayTri.makeExo3();

	}
}
