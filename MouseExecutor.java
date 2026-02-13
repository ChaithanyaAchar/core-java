class MouseExecutor {
    public static void main(String[] args) {

        double price = Mouse.getPrice();
        String brand = Mouse.getBrand();
        double rating = Mouse.getRating();
        int reviews = Mouse.getReviews();
        boolean wireless = Mouse.isWireless();
        int dpi = Mouse.getDPI();
        int warranty = Mouse.getWarranty();
        String color = Mouse.getColor();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Wireless: " + wireless);
        System.out.println("DPI: " + dpi);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Color: " + color);
    }
}
