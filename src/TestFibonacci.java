import java.util.InputMismatchException;
import java.util.Scanner;

public class TestFibonacci {

	private Scanner questionUser;
	
	public TestFibonacci(){
		questionUser = new Scanner(System.in);
	}

	private int prompt() throws InputMismatchException {
		System.out.print("Please enter a positive integer: ");
		return questionUser.nextInt();
	}

	private int fibonacci(int number){
		if(number == 0 ){
			return 0;
		}
		
		if(number == 1 || number == 2){
			return 1;
		}

		return fibonacci(number - 1) + fibonacci(number - 2);
	}

	public void makeExo5(){
		int N = 0;
		try{
			N = prompt();
			if(N >= 0){
				System.out.println("Fibonacci of "+ N + " is " + fibonacci(N));
			}else{	
				System.out.println("[ERROR] "+ N + " is not positive.");
			}
		}catch(InputMismatchException ex){
			System.out.println("[ERROR] It's not an Integer.");
		}

		if(questionUser != null){
			questionUser.close();
		}
	}

	public static void main(String[] args) {
		TestFibonacci testFibonacci = new TestFibonacci();
		testFibonacci.makeExo5();
	}
}
