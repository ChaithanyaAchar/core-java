class EarbudsExecutor {
    public static void main(String[] args) {

        double price = Earbuds.getPrice();
        String brand = Earbuds.getBrand();
        double rating = Earbuds.getRating();
        int reviews = Earbuds.getReviews();
        int battery = Earbuds.getBatteryLife();
        boolean noise = Earbuds.hasNoiseCancellation();
        String color = Earbuds.getColor();
        int warranty = Earbuds.getWarranty();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Battery Life: " + battery + " Hours");
        System.out.println("Noise Cancellation: " + noise);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " Year");
    }
}
