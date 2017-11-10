
public class TestArray2 {

	private int[] array =  {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 

	private float mean() {
		int sum = 0;
		for (int nb : array) {
			sum += nb;
		}

		return (float) sum / (float) array.length;
	}

	private void IndexOf15() {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 15) {
				System.out.println("Index is " + (i + 1));
			}
		}
	}

	public int doublon() {

//		TODO (ME) not  good
		int nbDoublon = 0 ;
		int temp = 0;
		for (int i = 0 ; i < array.length ; i++) {
			for (int j = 0 ; j < array.length ; j++) {
				
				if((i != j)) {
						if(array[i] == array[j]) {
					temp++;
				}
						}
			}
			
			if(temp >= 2 ) {
				nbDoublon++ ;
			}
			temp = 0;
		}
		return nbDoublon;
	}

	public void makeExo2() {
		System.out.println("The mean is " + mean());
		IndexOf15();
		System.out.println("There are " + doublon());
	}

	public static void main(String[] args) {

		TestArray2 testArray2 = new TestArray2();
		testArray2.makeExo2();

	}

}
