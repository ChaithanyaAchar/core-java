class SmartScaleExecutor {
    public static void main(String[] args) {

        double price = SmartScale.getPrice();
        String brand = SmartScale.getBrand();
        double rating = SmartScale.getRating();
        int reviews = SmartScale.getReviews();
        boolean app = SmartScale.supportsAppSync();
        int limit = SmartScale.getWeightLimit();
        int warranty = SmartScale.getWarranty();
        String color = SmartScale.getColor();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("App Sync: " + app);
        System.out.println("Weight Limit: " + limit + " Kg");
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Color: " + color);
    }
}
