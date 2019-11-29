package Main;

public class RestaurantSystem {

	static String faveTypeOfFood;

	public static String getFoodType(String food) {
		String faveFood = null;
		if (food.equals("Pasta")) {
			faveFood = "Is your favorite food Italian?";
			System.out.println(faveFood);
			faveTypeOfFood = "Pasta";
			return faveFood;
		} else if (food.equals("Burgers")) {
			faveFood = "Is your favorite food American?";
			System.out.println(faveFood);
			faveTypeOfFood = "Burgers";
			return faveFood;
		} else if (food.equals("Tacos")) {
			faveFood = "Is your favorite food Mexican?";
			System.out.println(faveFood);
			faveTypeOfFood = "Tacos";
			return faveFood;
		} else if (food.equals("Curry")) {
			faveFood = "Is your favorite food Indian?";
			System.out.println(faveFood);
			faveTypeOfFood = "Curry";
			return faveFood;
		} else {
			faveFood = "Error restart";
			System.out.println("Error");
			faveTypeOfFood = "Error";

		}

		return faveFood;
	}

	public static String getResponse(String response) {
		String responses = null;

		if (response.equals("Yes")) {
			if (faveTypeOfFood.equals("Pasta")) {
				responses = "https://www.tripadvisor.co.uk/Restaurant_Review-g186534-d8008321-Reviews-Jist_Misto-Glasgow_Scotland.html";
				System.out.println(responses);
				return responses;
			} else if (faveTypeOfFood.equals("Burgers")) {
				responses = "https://www.tripadvisor.co.uk/Restaurant_Review-g186534-d10814190-Reviews-Buck_s_Bar-Glasgow_Scotland.html";
				System.out.println(responses);
				return responses;
			} else if (faveTypeOfFood.equals("Tacos")) {
				responses = "https://www.tripadvisor.co.uk/Restaurant_Review-g186534-d6873873-Reviews-Topolabamba-Glasgow_Scotland.html";
				System.out.println(responses);
				return responses;
			} else if (faveTypeOfFood.equals("Curry")) {
				responses = "https://www.tripadvisor.co.uk/Restaurant_Review-g186534-d1509107-Reviews-Koolba-Glasgow_Scotland.html";
				System.out.println(responses);
				return responses;
			}

			return responses;
		} else if (response.equals("no")) {
			responses = "Do you want to choose another food?";
			System.out.println(responses);
		}

		return responses;
	}

}
