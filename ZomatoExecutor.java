class ZomatoExecutor{
	public static void main (String[] food)
	{
		String foodName="Dose";
		double price=Zomato.search(foodName);
		System.out.println("The price of "+foodName +"is:"+price);
	}
}