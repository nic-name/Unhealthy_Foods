import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//The below do while loop checks the user input below and keeps executing the program as long as the user enters 1
		boolean keepLooping;
		do {
			keepLooping = unhealthyFoodCheck();
		} while (keepLooping);
	}
	
	//This method checks the enum list
	public static boolean unhealthyFoodCheck() {

		//Scanner takes the user input uses it to create a string - userInput
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the name of your favourite food. \nThe program will"
				+ " determine whether it is considered an unhealthy food.");
		String userInput = keyboard.nextLine();

		//Create a userInputEnum of healthy foods using the user input string to compare with the list of unhealthy foods
		UnhealthyFoods userInputEnum = UnhealthyFoods.getUnhealthyFoodsEnum(userInput);
		//Create a boolean variable that puts the unhealthy foods values into an arrays list and returns true if the value is in the list
		boolean result = Arrays.asList(UnhealthyFoods.values()).contains(userInputEnum);
		System.out.println("Your entry: " + userInput);

		//try catch exception
		try {
			//if the enum is in the list then throw the unhealthyfoodexception
			if (result == true) {
				throw new UnhealthyFoodException("Unhealthy");
			}
		} catch (UnhealthyFoodException ex) {
			//print out the message below when the exception is caught
			System.out.println("That's an unhealthy food!");
		}
		if (result == false) {
			System.out.println(userInput + " is not on the list of unhealthy foods.");
		}
		
		//ask the user if they wish to continue
		System.out.println("Enter 1 to continue (or any other no. to exit)");
		int continueInput = Integer.parseInt(keyboard.nextLine());
		if (continueInput == 1) {
			return true;
		} else
			return false;
	}

}
