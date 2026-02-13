class KeyboardExecutor {
    public static void main(String[] args) {

        double price = Keyboard.getPrice();
        String brand = Keyboard.getBrand();
        double rating = Keyboard.getRating();
        int reviews = Keyboard.getReviews();
        boolean mechanical = Keyboard.isMechanical();
        boolean rgb = Keyboard.hasRGBLighting();
        int warranty = Keyboard.getWarranty();
        String color = Keyboard.getColor();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Mechanical: " + mechanical);
        System.out.println("RGB Lighting: " + rgb);
        System.out.println("Warranty: " + warranty + " Years");
        System.out.println("Color: " + color);
    }
}
