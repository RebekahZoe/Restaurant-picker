package Main;

import java.util.Scanner;

public class RestaurantRunner {

	public static void main(String[] args) {

		restaurantRunner();

	}

	public static void restaurantRunner() {
		while (true) {
			System.out.println("Please enter your favorite food: ");
			Scanner readInput = new Scanner(System.in);
			String food = readInput.nextLine();
			RestaurantSystem.getFoodType(food);
			if (RestaurantSystem.faveTypeOfFood.equals("Error")) {
				break;
			}
			System.out.println("Please enter Yes or No: ");
			Scanner readInput2 = new Scanner(System.in);
			String answer = readInput2.nextLine();
			if (answer.equals("Yes")) {
				RestaurantSystem.getResponse(answer);
				System.out.println("Goodbye");
				break;
			} else if (answer.equals("No")) {
				RestaurantSystem.getResponse(answer);
				System.out.println("Do you want to choose another food? Please enter Yes or No:");
				Scanner readInput3 = new Scanner(System.in);
				String answer2 = readInput3.nextLine();
				if (answer2.equals("No")) {
					System.out.println("Goodbye");
					break;
				}
			}

		}
	}

}
