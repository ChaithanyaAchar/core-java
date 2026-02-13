class MicrowaveExecutor {
    public static void main(String[] args) {

        double price = Microwave.getPrice();
        String brand = Microwave.getBrand();
        double rating = Microwave.getRating();
        int reviews = Microwave.getReviews();
        int capacity = Microwave.getCapacity();
        boolean grill = Microwave.hasGrillMode();
        int warranty = Microwave.getWarranty();
        String color = Microwave.getColor();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Capacity: " + capacity + " Litres");
        System.out.println("Grill Mode: " + grill);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Color: " + color);
    }
}