class HeadphonesExecutor {
    public static void main(String[] args) {

        double price = Headphones.getPrice();
        String brand = Headphones.getBrand();
        double rating = Headphones.getRating();
        int reviews = Headphones.getReviews();

        System.out.println("Headphones Price: " + price);
        System.out.println("Headphones Brand: " + brand);
        System.out.println("Headphones Rating: " + rating);
        System.out.println("Headphones Reviews: " + reviews);
    }
}
