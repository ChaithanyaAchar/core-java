class ZeptoExecutor{
	public static void main (String[] food)
	{
		String foodName="Veg Upma";
		double price=Zepto.search(foodName);
		System.out.println("The price of "+foodName +" is:"+price);
	}
}
