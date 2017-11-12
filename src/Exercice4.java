import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercice4 {
	private final int STEP = 10;	
	private final int MAX_LENGTH = 100;
	private Scanner questionUser;
	private int[] array ;
	private int index;

	public Exercice4(){
		questionUser = new Scanner(System.in);
		array = new int[STEP];
		index = -1;
	}

	/**
	 * return 0 if MAX_LENGTH is reached 
	 *        a positive value otherwise
	 */
	private int resize(){
		int length = array.length;
		int diff = MAX_LENGTH - length; 
		if(diff > 0){
			int[] aClone = array.clone();
			array = new int[length + STEP];

			for(int i = 0; i < length; i++){
				array[i] = aClone[i];
			}
		}
		return diff;
	}

	public int menu(){
		int answer = 0;
		do{
			try{
				System.out.println("[1] Add an integer");
				System.out.println("[2] Display");
				System.out.println("[3] quit");
				answer = questionUser.nextInt();
			}catch(InputMismatchException ex){
				System.out.println("It's not an integer");
				questionUser.nextLine();
				answer = 0;
			}

			if(answer < 0 && answer > 4 ){
				System.out.println("Please choose an integer between 1-3");
				answer = 0;
			}
		}while(answer == 0);

		return answer;
	}

	private int value(){
		boolean notInt = true;
		do{
			try{
				System.out.print("Please enter the integer: ");
				return questionUser.nextInt();
			}catch(InputMismatchException ex){
				System.out.println("It's not an integer");
				questionUser.nextLine();
				notInt = false;
			}
		}while(notInt);
		return -1;
	}

	/**
	 * return 0 if the value is added
	 *	  -1 otherwise
	 */
	private int add(){
		int number = value();

		index++;
		if(index < array.length){
			array[index] = number;
		}else{
			if(resize() > 0){
				array[index] = number;
			}else{
				return -1;
			}
		}

		return 0;
	}

	private void display(){
		
		for(int nb : array){
			System.out.print(nb + " "); 
		}

		System.out.println();
	}

	public void make() {
		int answer = 0;
		while(answer == 0){
			switch(menu()){
				case 1:
					if(add() == -1){
						System.out.println("The max length has been reached");
						answer = -1;
					}
					break;
				case 2:
					display();
					break;
				case 3:
					answer = -1;
					break;
				default:
			}
		}

		if(questionUser != null){
			questionUser.close();
		}
		System.out.println("Bye...");
	}

	public static void main(String[] args) {
		Exercice4 exercice4 = new Exercice4();
		exercice4.make();
	}
}
