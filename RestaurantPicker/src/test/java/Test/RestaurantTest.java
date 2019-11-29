package Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Main.RestaurantSystem;

public class RestaurantTest {


	@Test
	public void ItalianTest() {
		RestaurantSystem restaurantSystem = new RestaurantSystem();
		String food = restaurantSystem.getFoodType("Pasta");
		Assert.assertEquals("Is your favorite food Italian?", food);
		
		String response = restaurantSystem.getResponse("Yes");
		Assert.assertEquals("https://www.tripadvisor.co.uk/Restaurant_Review-g186534-d8008321-Reviews-Jist_Misto-Glasgow_Scotland.html",response);
		String response2 = restaurantSystem.getResponse("no");
		Assert.assertEquals("Do you want to choose another food?",response2);
		
	}
	@Test
	public void AmericanTest() {
		RestaurantSystem restaurantSystem = new RestaurantSystem();
		String food = restaurantSystem.getFoodType("Burgers");
		Assert.assertEquals("Is your favorite food American?", food);
		
		String response = restaurantSystem.getResponse("Yes");
		Assert.assertEquals("https://www.tripadvisor.co.uk/Restaurant_Review-g186534-d10814190-Reviews-Buck_s_Bar-Glasgow_Scotland.html",response);
		String response2 = restaurantSystem.getResponse("no");
		Assert.assertEquals("Do you want to choose another food?",response2);
		
	}
	
	@Test
	public void MexicanTest() {
		RestaurantSystem restaurantSystem = new RestaurantSystem();
		String food = restaurantSystem.getFoodType("Tacos");
		Assert.assertEquals("Is your favorite food Mexican?", food);
		
		String response = restaurantSystem.getResponse("Yes");
		Assert.assertEquals("https://www.tripadvisor.co.uk/Restaurant_Review-g186534-d6873873-Reviews-Topolabamba-Glasgow_Scotland.html",response);
		String response2 = restaurantSystem.getResponse("no");
		Assert.assertEquals("Do you want to choose another food?",response2);
		
	}
	
	@Test
	public void IndianTest() {
		RestaurantSystem restaurantSystem = new RestaurantSystem();
		String food = restaurantSystem.getFoodType("Curry");
		Assert.assertEquals("Is your favorite food Indian?", food);
		
		String response = restaurantSystem.getResponse("Yes");
		Assert.assertEquals("https://www.tripadvisor.co.uk/Restaurant_Review-g186534-d1509107-Reviews-Koolba-Glasgow_Scotland.html",response);
		String response2 = restaurantSystem.getResponse("no");
		Assert.assertEquals("Do you want to choose another food?",response2);
		
	}
	@Test
	public void ErrorTest() {
		RestaurantSystem restaurantSystem = new RestaurantSystem();
		String error = restaurantSystem.getFoodType("Food");
		Assert.assertEquals("Error restart", error);
		
	
		
	}
}
