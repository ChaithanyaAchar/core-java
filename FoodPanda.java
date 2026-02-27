class FoodPanda{
	public static double search(String foodName, int quantity)
	{
		double price=0.0;
		if(foodName.equals("Pulav"))
		{
			price=80.00;
			return price * quantity;
		}
		else if(foodName.equals("Pizza"))
		{
			price=260.00;
			return price * quantity;
		}
		else if(foodName.equals("French fries"))
		{
			price=150.00;
			return price * quantity;
		}
		else if(foodName.equals("Curd Rice"))
		{
			price=100.00;
			return price * quantity;
		}
		else if(foodName.equals("Chapathi"))
		{
			price=70.00;
			return price * quantity;
		}
		else if(foodName.equals("Idli"))
		{
			price=50.00;
			return price * quantity;
		}
		else if(foodName.equals("Dosa"))
		{
			price=90.00;
			return price * quantity;
		}
		else if(foodName.equals("Vada"))
		{
			price=40.00;
			return price * quantity;
		}
		else if(foodName.equals("Biryani"))
		{
			price=220.00;
			return price * quantity;
		}
		else if(foodName.equals("Fried Rice"))
		{
			price=140.00;
			return price * quantity;
		}
		else if(foodName.equals("Noodles"))
		{
			price=130.00;
			return price * quantity;
		}
		else if(foodName.equals("Burger"))
		{
			price=160.00;
			return price * quantity;
		}
		else if(foodName.equals("Sandwich"))
		{
			price=120.00;
			return price * quantity;
		}
		else if(foodName.equals("Pasta"))
		{
			price=180.00;
			return price * quantity;
		}
		else if(foodName.equals("Ice Cream"))
		{
			price=90.00;
			return price * quantity;
		}
		else if(foodName.equals("Gulab Jamun"))
		{
			price=70.00;
			return price * quantity;
		}
		else if(foodName.equals("Rasgulla"))
		{
			price=75.00;
			return price * quantity;
		}
		else if(foodName.equals("Masala Dosa"))
		{
			price=110.00;
			return price * quantity;
		}
		else if(foodName.equals("Plain Dosa"))
		{
			price=80.00;
			return price * quantity;
		}
		else if(foodName.equals("Paneer Butter Masala"))
		{
			price=190.00;
			return price * quantity;
		}
		else if(foodName.equals("Butter Naan"))
		{
			price=40.00;
			return price * quantity;
		}
		else if(foodName.equals("Veg Thali"))
		{
			price=200.00;
			return price * quantity;
		}
		else if(foodName.equals("Poori"))
		{
			price=60.00;
			return price * quantity;
		}
		else if(foodName.equals("Upma"))
		{
			price=50.00;
			return price * quantity;
		}
		else if(foodName.equals("Poha"))
		{
			price=55.00;
			return price * quantity;
		}
		else if(foodName.equals("Samosa"))
		{
			price=30.00;
			return price * quantity;
		}
		else if(foodName.equals("Pani Puri"))
		{
			price=40.00;
			return price * quantity;
		}
		else if(foodName.equals("Bhel Puri"))
		{
			price=45.00;
			return price * quantity;
		}
		else if(foodName.equals("Sev Puri"))
		{
			price=50.00;
			return price * quantity;
		}
		else if(foodName.equals("Veg Manchurian"))
		{
			price=120.00;
			return price * quantity;
		}
		else if(foodName.equals("Gobi Manchurian"))
		{
			price=130.00;
			return price * quantity;
		}
		else if(foodName.equals("Chilli Paneer"))
		{
			price=170.00;
			return price * quantity;
		}
		else if(foodName.equals("Tomato Soup"))
		{
			price=90.00;
			return price * quantity;
		}
		else if(foodName.equals("Sweet Corn Soup"))
		{
			price=95.00;
			return price * quantity;
		}
		else if(foodName.equals("Veg Spring Roll"))
		{
			price=110.00;
			return price * quantity;
		}
		else if(foodName.equals("Veg Momos"))
		{
			price=100.00;
			return price * quantity;
		}
		else if(foodName.equals("Veg Frankie"))
		{
			price=90.00;
			return price * quantity;
		}
		else if(foodName.equals("Veg Shawarma"))
		{
			price=140.00;
			return price * quantity;
		}
		else if(foodName.equals("Paneer Tikka"))
		{
			price=180.00;
			return price * quantity;
		}
		else if(foodName.equals("Tandoori Roti"))
		{
			price=25.00;
			return price * quantity;
		}
		else if(foodName.equals("Veg Kebab"))
		{
			price=160.00;
			return price * quantity;
		}
		else if(foodName.equals("Veg Cutlet"))
		{
			price=60.00;
			return price * quantity;
		}
		else if(foodName.equals("Fruit Salad"))
		{
			price=90.00;
			return price * quantity;
		}
		else if(foodName.equals("Milk Shake"))
		{
			price=120.00;
			return price * quantity;
		}
		else if(foodName.equals("Cold Coffee"))
		{
			price=130.00;
			return price * quantity;
		}
		else if(foodName.equals("Tea"))
		{
			price=20.00;
			return price * quantity;
		}
		else if(foodName.equals("Coffee"))
		{
			price=30.00;
			return price * quantity;
		}
		else{
			System.out.println("Food not available");
		}
		return price;
	}
}