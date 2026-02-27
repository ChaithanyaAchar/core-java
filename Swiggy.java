class Swiggy {
	public static double search(String foodName, int quantity) {

		double price = 0.0;

		if(foodName.equals("Veg Pulao")) {
			price = 85.00 * quantity;
			return price;
		}
		else if(foodName.equals("Cheese Pizza")) {
			price = 275.00 * quantity;
			return price;
		}
		else if(foodName.equals("Potato Wedges")) {
			price = 145.00 * quantity;
			return price;
		}
		else if(foodName.equals("Lemon Rice")) {
			price = 95.00 * quantity;
			return price;
		}
		else if(foodName.equals("Butter Roti")) {
			price = 35.00 * quantity;
			return price;
		}
		else if(foodName.equals("Set Dosa")) {
			price = 110.00 * quantity;
			return price;
		}
		else if(foodName.equals("Onion Dosa")) {
			price = 120.00 * quantity;
			return price;
		}
		else if(foodName.equals("Mysore Bonda")) {
			price = 60.00 * quantity;
			return price;
		}
		else if(foodName.equals("Hyderabadi Biryani")) {
			price = 260.00 * quantity;
			return price;
		}
		else if(foodName.equals("Schezwan Rice")) {
			price = 170.00 * quantity;
			return price;
		}
		else if(foodName.equals("Hakka Noodles")) {
			price = 160.00 * quantity;
			return price;
		}
		else if(foodName.equals("Veg Wrap")) {
			price = 140.00 * quantity;
			return price;
		}
		else if(foodName.equals("Club Sandwich")) {
			price = 150.00 * quantity;
			return price;
		}
		else if(foodName.equals("Alfredo Pasta")) {
			price = 210.00 * quantity;
			return price;
		}
		else if(foodName.equals("Chocolate Sundae")) {
			price = 120.00 * quantity;
			return price;
		}
		else if(foodName.equals("Oreo Shake")) {
			price = 130.00 * quantity;
			return price;
		}
		else if(foodName.equals("Mint Mojito")) {
			price = 90.00 * quantity;
			return price;
		}
		else if(foodName.equals("Green Tea")) {
			price = 35.00 * quantity;
			return price;
		}
		else if(foodName.equals("Espresso")) {
			price = 70.00 * quantity;
			return price;
		}
		else if(foodName.equals("Orange Juice")) {
			price = 60.00 * quantity;
			return price;
		}
		else if(foodName.equals("Veg Cutlet")) {
			price = 55.00 * quantity;
			return price;
		}
		else if(foodName.equals("Chole Bhature")) {
			price = 170.00 * quantity;
			return price;
		}
		else if(foodName.equals("Chilli Paneer")) {
			price = 190.00 * quantity;
			return price;
		}
		else if(foodName.equals("Crispy Corn")) {
			price = 130.00 * quantity;
			return price;
		}
		else if(foodName.equals("Cheese Momos")) {
			price = 160.00 * quantity;
			return price;
		}
		else if(foodName.equals("Paneer Momos")) {
			price = 150.00 * quantity;
			return price;
		}
		else if(foodName.equals("Kadai Paneer")) {
			price = 210.00 * quantity;
			return price;
		}
		else if(foodName.equals("Garlic Kulcha")) {
			price = 55.00 * quantity;
			return price;
		}
		else if(foodName.equals("North Indian Thali")) {
			price = 230.00 * quantity;
			return price;
		}
		else if(foodName.equals("South Indian Thali")) {
			price = 200.00 * quantity;
			return price;
		}
		else if(foodName.equals("Pepper Egg Curry")) {
			price = 160.00 * quantity;
			return price;
		}
		else if(foodName.equals("Chicken Lollipop")) {
			price = 220.00 * quantity;
			return price;
		}
		else if(foodName.equals("Reshmi Chicken")) {
			price = 290.00 * quantity;
			return price;
		}
		else if(foodName.equals("BBQ Chicken")) {
			price = 310.00 * quantity;
			return price;
		}
		else if(foodName.equals("Crumb Fried Fish")) {
			price = 270.00 * quantity;
			return price;
		}
		else if(foodName.equals("Butter Garlic Prawns")) {
			price = 320.00 * quantity;
			return price;
		}
		else if(foodName.equals("Lucknowi Biryani")) {
			price = 340.00 * quantity;
			return price;
		}
		else if(foodName.equals("Paneer Biryani")) {
			price = 210.00 * quantity;
			return price;
		}
		else if(foodName.equals("Dahi Papdi Chaat")) {
			price = 110.00 * quantity;
			return price;
		}
		else if(foodName.equals("Tandoori Roti")) {
			price = 25.00 * quantity;
			return price;
		}
		else if(foodName.equals("Aloo Paratha")) {
			price = 75.00 * quantity;
			return price;
		}
		else if(foodName.equals("Rava Upma")) {
			price = 65.00 * quantity;
			return price;
		}
		else if(foodName.equals("Bhature")) {
			price = 60.00 * quantity;
			return price;
		}
		else if(foodName.equals("Pineapple Kesari")) {
			price = 95.00 * quantity;
			return price;
		}
		else if(foodName.equals("Jalebi")) {
			price = 80.00 * quantity;
			return price;
		}
		else if(foodName.equals("Rabdi")) {
			price = 90.00 * quantity;
			return price;
		}
		else if(foodName.equals("Kesar Pista Kulfi")) {
			price = 110.00 * quantity;
			return price;
		}
		else {
			System.out.println("Food not available");
		}

		return price;
	}
}