class LaptopBagExecutor {
    public static void main(String[] args) {

        double price = LaptopBag.getPrice();
        String brand = LaptopBag.getBrand();
        double rating = LaptopBag.getRating();
        int reviews = LaptopBag.getReviews();
        int capacity = LaptopBag.getCapacity();
        boolean water = LaptopBag.isWaterResistant();
        int warranty = LaptopBag.getWarranty();
        String color = LaptopBag.getColor();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Capacity: " + capacity + " Litres");
        System.out.println("Water Resistant: " + water);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Color: " + color);
    }
}
