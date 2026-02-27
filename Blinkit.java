class BlinkIt {
    public static double search(String foodName, int quantity) {
        double price = 0.0;

        if (foodName.equals("Veg Poha")) {
            price = 60.00;
            return price * quantity;
        } 
        else if (foodName.equals("Thin Crust Pizza")) {
            price = 245.00;
            return price * quantity;
        } 
        else if (foodName.equals("Curly Fries")) {
            price = 140.00;
            return price * quantity;
        } 
        else if (foodName.equals("Coconut Rice")) {
            price = 100.00;
            return price * quantity;
        } 
        else if (foodName.equals("Multigrain Roti")) {
            price = 30.00;
            return price * quantity;
        } 
        else if (foodName.equals("Ragi Dosa")) {
            price = 110.00;
            return price * quantity;
        } 
        else if (foodName.equals("Masala Uttapam")) {
            price = 130.00;
            return price * quantity;
        } 
        else if (foodName.equals("Batata Vada")) {
            price = 45.00;
            return price * quantity;
        } 
        else if (foodName.equals("Donne Biryani")) {
            price = 255.00;
            return price * quantity;
        } 
        else if (foodName.equals("Veg Triple Rice")) {
            price = 175.00;
            return price * quantity;
        } 
        else if (foodName.equals("Chowmein")) {
            price = 155.00;
            return price * quantity;
        } 
        else if (foodName.equals("Paneer Roll")) {
            price = 145.00;
            return price * quantity;
        } 
        else if (foodName.equals("Cheese Toast")) {
            price = 125.00;
            return price * quantity;
        } 
        else if (foodName.equals("Pesto Pasta")) {
            price = 215.00;
            return price * quantity;
        } 
        else if (foodName.equals("Butterscotch Scoop")) {
            price = 90.00;
            return price * quantity;
        } 
        else if (foodName.equals("Mango Shake")) {
            price = 120.00;
            return price * quantity;
        } 
        else if (foodName.equals("Rose Milk")) {
            price = 70.00;
            return price * quantity;
        } 
        else if (foodName.equals("Masala Tea")) {
            price = 25.00;
            return price * quantity;
        } 
        else if (foodName.equals("Filter Coffee")) {
            price = 50.00;
            return price * quantity;
        } 
        else if (foodName.equals("Watermelon Juice")) {
            price = 55.00;
            return price * quantity;
        } 
        else if (foodName.equals("Paneer Pakora")) {
            price = 95.00;
            return price * quantity;
        } 
        else if (foodName.equals("Amritsari Kulcha")) {
            price = 165.00;
            return price * quantity;
        } 
        else if (foodName.equals("Honey Chilli Potato")) {
            price = 150.00;
            return price * quantity;
        } 
        else if (foodName.equals("Peri Peri Corn")) {
            price = 135.00;
            return price * quantity;
        } 
        else if (foodName.equals("Tandoori Momos")) {
            price = 170.00;
            return price * quantity;
        } 
        else if (foodName.equals("Veg Kurkure Momos")) {
            price = 155.00;
            return price * quantity;
        } 
        else if (foodName.equals("Paneer Lababdar")) {
            price = 225.00;
            return price * quantity;
        } 
        else if (foodName.equals("Ajwain Roti")) {
            price = 35.00;
            return price * quantity;
        } 
        else if (foodName.equals("Budget Thali")) {
            price = 170.00;
            return price * quantity;
        } 
        else if (foodName.equals("Deluxe Thali")) {
            price = 260.00;
            return price * quantity;
        } 
        else if (foodName.equals("Egg Bhurji")) {
            price = 135.00;
            return price * quantity;
        } 
        else if (foodName.equals("Chicken Seekh Kebab")) {
            price = 215.00;
            return price * quantity;
        } 
        else if (foodName.equals("Afghani Chicken")) {
            price = 300.00;
            return price * quantity;
        } 
        else if (foodName.equals("Lemon Pepper Chicken")) {
            price = 290.00;
            return price * quantity;
        } 
        else if (foodName.equals("Goan Fish Curry")) {
            price = 280.00;
            return price * quantity;
        } 
        else if (foodName.equals("Prawn Masala")) {
            price = 325.00;
            return price * quantity;
        } 
        else if (foodName.equals("Sindhi Biryani")) {
            price = 345.00;
            return price * quantity;
        } 
        else if (foodName.equals("Jackfruit Biryani")) {
            price = 215.00;
            return price * quantity;
        } 
        else if (foodName.equals("Bhel Puri")) {
            price = 70.00;
            return price * quantity;
        } 
        else if (foodName.equals("Missi Roti")) {
            price = 45.00;
            return price * quantity;
        } 
        else if (foodName.equals("Methi Paratha")) {
            price = 70.00;
            return price * quantity;
        } 
        else if (foodName.equals("Oats Upma")) {
            price = 85.00;
            return price * quantity;
        } 
        else if (foodName.equals("Aloo Masala Poori")) {
            price = 105.00;
            return price * quantity;
        } 
        else if (foodName.equals("Pista Phirni")) {
            price = 95.00;
            return price * quantity;
        } 
        else if (foodName.equals("Carrot Halwa")) {
            price = 110.00;
            return price * quantity;
        } 
        else if (foodName.equals("Chocolate Kulfi")) {
            price = 120.00;
            return price * quantity;
        } 
		
        else {
            System.out.println("Food not available");
        }

        return price;
    }
}