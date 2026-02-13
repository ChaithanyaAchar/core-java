class CeilingFanExecutor {
    public static void main(String[] args) {

        double price = CeilingFan.getPrice();
        String brand = CeilingFan.getBrand();
        double rating = CeilingFan.getRating();
        int reviews = CeilingFan.getReviews();
        int blades = CeilingFan.getBladeCount();
        int speed = CeilingFan.getSpeed();
        int warranty = CeilingFan.getWarranty();
        String color = CeilingFan.getColor();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Blade Count: " + blades);
        System.out.println("Speed: " + speed + " RPM");
        System.out.println("Warranty: " + warranty + " Years");
        System.out.println("Color: " + color);
    }
}
