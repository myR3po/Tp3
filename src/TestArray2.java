
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
				System.out.println("[Programmer way] index is " + i);
				System.out.println("Index is " + (i + 1));
			}
		}
	}

	public int duplicate(int[] anArray) {

		int[] theClone = anArray.clone();
		int arrayLength = anArray.length;
		int nbDuplicate = 0 ;
		int temp = 0;
		/*
		 * With this array it's work but with an other
		 * we need to be careful with the values.
		 */
		int check = Integer.MAX_VALUE;
		for (int i = 0 ; i < arrayLength ; i++) {
			if(theClone[i] != check){
				for (int j = 0 ; j < arrayLength ; j++) {
					if((i != j) && (theClone[j] != check) && theClone[i] == theClone[j]) {
						theClone[j] = check;
						temp++;
					}
				}
				
				if(temp >= 1 ) {
					nbDuplicate++ ;
					theClone[i] = check;
					temp = 0;
				}
			}
		}
		return nbDuplicate;
	}

	public void makeExo2() {
		System.out.println("The mean is " + mean());
		IndexOf15();
		System.out.println("There are " + duplicate(array) + " duplicate(s).");
	}

	public static void main(String[] args) {
		TestArray2 testArray2 = new TestArray2();
		testArray2.makeExo2();
	}
}
