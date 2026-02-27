class SwiggyExecutor {
	public static void main(String[] food) {

		String foodName = "Veg Pulao";
		int quantity = 2;
		double price = Swiggy.search(foodName, quantity);
		System.out.println("The price of " + foodName + " for " + quantity + " quantity is: " + price);

		foodName = "Hyderabadi Biryani";
		quantity = 1;
		price = Swiggy.search(foodName, quantity);
		System.out.println("The price of " + foodName + " for " + quantity + " quantity is: " + price);

		foodName = "Cheese Momos";
		quantity = 3;
		price = Swiggy.search(foodName, quantity);
		System.out.println("The price of " + foodName + " for " + quantity + " quantity is: " + price);

		foodName = "BBQ Chicken";
		quantity = 2;
		price = Swiggy.search(foodName, quantity);
		System.out.println("The price of " + foodName + " for " + quantity + " quantity is: " + price);

		foodName = "Kesar Pista Kulfi";
		quantity = 4;
		price = Swiggy.search(foodName, quantity);
		System.out.println("The price of " + foodName + " for " + quantity + " quantity is: " + price);
	}
}