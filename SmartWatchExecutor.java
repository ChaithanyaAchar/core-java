class SmartWatchExecutor {
    public static void main(String[] args) {

        double price = SmartWatch.getPrice();
        String brand = SmartWatch.getBrand();
        double rating = SmartWatch.getRating();
        int reviews = SmartWatch.getReviews();

        System.out.println("SmartWatch Price: " + price);
        System.out.println("SmartWatch Brand: " + brand);
        System.out.println("SmartWatch Rating: " + rating);
        System.out.println("SmartWatch Reviews: " + reviews);
    }
}