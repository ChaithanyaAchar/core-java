class UberEatsExecutor{
	public static void main (String[] food)
	{
		String foodName="Veg Khichdi";
		double price=UberEats.search(foodName);
		System.out.println("The price of "+foodName +"is:"+price);
	}
}
