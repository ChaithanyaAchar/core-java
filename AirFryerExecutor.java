class AirFryerExecutor {
    public static void main(String[] args) {

        double price = AirFryer.getPrice();
        String brand = AirFryer.getBrand();
        double rating = AirFryer.getRating();
        int reviews = AirFryer.getReviews();
        int capacity = AirFryer.getCapacity();
        boolean display = AirFryer.hasDigitalDisplay();
        boolean auto = AirFryer.hasAutoPrograms();
        int warranty = AirFryer.getWarranty();
        String color = AirFryer.getColor();
        int stock = AirFryer.getStock();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Capacity: " + capacity + " Litres");
        System.out.println("Digital Display: " + display);
        System.out.println("Auto Programs: " + auto);
        System.out.println("Warranty: " + warranty + " Years");
        System.out.println("Color: " + color);
        System.out.println("Stock: " + stock);
    }
}