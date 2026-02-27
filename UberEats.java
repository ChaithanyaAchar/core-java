class UberEats {
	public static double search(String foodName, int quantity) {

		double price = 0.0;

		if(foodName.equals("Veg Khichdi")) {
			price = 95.00 * quantity;
			return price;
		}
		else if(foodName.equals("Margherita Pizza")) {
			price = 255.00 * quantity;
			return price;
		}
		else if(foodName.equals("Sweet Potato Fries")) {
			price = 155.00 * quantity;
			return price;
		}
		else if(foodName.equals("Tamarind Rice")) {
			price = 105.00 * quantity;
			return price;
		}
		else if(foodName.equals("Plain Roti")) {
			price = 20.00 * quantity;
			return price;
		}
		else if(foodName.equals("Paper Dosa")) {
			price = 100.00 * quantity;
			return price;
		}
		else if(foodName.equals("Ghee Roast Dosa")) {
			price = 140.00 * quantity;
			return price;
		}
		else if(foodName.equals("Medu Bonda")) {
			price = 55.00 * quantity;
			return price;
		}
		else if(foodName.equals("Ambur Biryani")) {
			price = 270.00 * quantity;
			return price;
		}
		else if(foodName.equals("Veg Schezwan Rice")) {
			price = 165.00 * quantity;
			return price;
		}
		else if(foodName.equals("Singapore Noodles")) {
			price = 175.00 * quantity;
			return price;
		}
		else if(foodName.equals("Falafel Wrap")) {
			price = 145.00 * quantity;
			return price;
		}
		else if(foodName.equals("Grilled Sandwich")) {
			price = 135.00 * quantity;
			return price;
		}
		else if(foodName.equals("Arrabiata Pasta")) {
			price = 205.00 * quantity;
			return price;
		}
		else if(foodName.equals("Vanilla Scoop")) {
			price = 85.00 * quantity;
			return price;
		}
		else if(foodName.equals("Strawberry Shake")) {
			price = 125.00 * quantity;
			return price;
		}
		else if(foodName.equals("Blue Lagoon")) {
			price = 95.00 * quantity;
			return price;
		}
		else if(foodName.equals("Herbal Tea")) {
			price = 45.00 * quantity;
			return price;
		}
		else if(foodName.equals("Americano")) {
			price = 80.00 * quantity;
			return price;
		}
		else if(foodName.equals("Apple Juice")) {
			price = 65.00 * quantity;
			return price;
		}
		else if(foodName.equals("Corn Cutlet")) {
			price = 70.00 * quantity;
			return price;
		}
		else if(foodName.equals("Rajma Chawal")) {
			price = 160.00 * quantity;
			return price;
		}
		else if(foodName.equals("Mushroom Chilli")) {
			price = 195.00 * quantity;
			return price;
		}
		else if(foodName.equals("Baby Corn Pepper")) {
			price = 170.00 * quantity;
			return price;
		}
		else if(foodName.equals("Steamed Momos")) {
			price = 115.00 * quantity;
			return price;
		}
		else if(foodName.equals("Paneer Tikka Momos")) {
			price = 165.00 * quantity;
			return price;
		}
		else if(foodName.equals("Shahi Paneer")) {
			price = 225.00 * quantity;
			return price;
		}
		else if(foodName.equals("Roomali Roti")) {
			price = 30.00 * quantity;
			return price;
		}
		else if(foodName.equals("Mini Thali")) {
			price = 190.00 * quantity;
			return price;
		}
		else if(foodName.equals("Family Thali")) {
			price = 260.00 * quantity;
			return price;
		}
		else if(foodName.equals("Keema Egg Curry")) {
			price = 175.00 * quantity;
			return price;
		}
		else if(foodName.equals("Chicken Popcorn")) {
			price = 210.00 * quantity;
			return price;
		}
		else if(foodName.equals("Malai Chicken")) {
			price = 295.00 * quantity;
			return price;
		}
		else if(foodName.equals("Peri Peri Chicken")) {
			price = 315.00 * quantity;
			return price;
		}
		else if(foodName.equals("Kerala Fish Curry")) {
			price = 275.00 * quantity;
			return price;
		}
		else if(foodName.equals("Prawn Ghee Roast")) {
			price = 330.00 * quantity;
			return price;
		}
		else if(foodName.equals("Kolkata Biryani")) {
			price = 335.00 * quantity;
			return price;
		}
		else if(foodName.equals("Mushroom Biryani")) {
			price = 205.00 * quantity;
			return price;
		}
		else if(foodName.equals("Sev Puri")) {
			price = 85.00 * quantity;
			return price;
		}
		else if(foodName.equals("Lachha Paratha")) {
			price = 65.00 * quantity;
			return price;
		}
		else if(foodName.equals("Paneer Paratha")) {
			price = 90.00 * quantity;
			return price;
		}
		else if(foodName.equals("Broken Wheat Upma")) {
			price = 75.00 * quantity;
			return price;
		}
		else if(foodName.equals("Aloo Poori")) {
			price = 95.00 * quantity;
			return price;
		}
		else if(foodName.equals("Mango Kesari")) {
			price = 100.00 * quantity;
			return price;
		}
		else if(foodName.equals("Kheer")) {
			price = 85.00 * quantity;
			return price;
		}
		else if(foodName.equals("Badam Halwa")) {
			price = 120.00 * quantity;
			return price;
		}
		else if(foodName.equals("Tender Coconut Ice Cream")) {
			price = 130.00 * quantity;
			return price;
		}
		else {
			System.out.println("Food not available");
		}

		return price;
	}
}