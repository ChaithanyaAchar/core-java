class TripodExecutor {
    public static void main(String[] args) {

        double price = Tripod.getPrice();
        String brand = Tripod.getBrand();
        double rating = Tripod.getRating();
        int reviews = Tripod.getReviews();
        int height = Tripod.getMaxHeight();
        boolean mobile = Tripod.supportsMobile();
        boolean camera = Tripod.supportsCamera();
        int warranty = Tripod.getWarranty();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Max Height: " + height + " cm");
        System.out.println("Mobile Support: " + mobile);
        System.out.println("Camera Support: " + camera);
        System.out.println("Warranty: " + warranty + " Year");
    }
}
