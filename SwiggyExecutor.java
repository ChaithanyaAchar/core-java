class SwiggyExecutor{
	public static void main (String[] food)
	{
		String foodName="Veg Pulav";
		double price=Swiggy.getprice(foodName);
		System.out.println("The price of "+foodName +"is:"+price);
	}
}