class DeskLampExecutor {
    public static void main(String[] args) {

        double price = DeskLamp.getPrice();
        String brand = DeskLamp.getBrand();
        double rating = DeskLamp.getRating();
        int reviews = DeskLamp.getReviews();
        boolean touch = DeskLamp.hasTouchControl();
        int brightness = DeskLamp.getBrightnessLevels();
        int warranty = DeskLamp.getWarranty();
        String color = DeskLamp.getColor();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Touch Control: " + touch);
        System.out.println("Brightness Levels: " + brightness);
        System.out.println("Warranty: " + warranty + " Years");
        System.out.println("Color: " + color);
    }
}
