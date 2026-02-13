class IronBoxExecutor {
    public static void main(String[] args) {

        double price = IronBox.getPrice();
        String brand = IronBox.getBrand();
        double rating = IronBox.getRating();
        int reviews = IronBox.getReviews();
        int power = IronBox.getPower();
        boolean steam = IronBox.hasSteamFunction();
        int warranty = IronBox.getWarranty();
        String color = IronBox.getColor();

        System.out.println("Iron Box Price: " + price);
        System.out.println("Iron Box Brand: " + brand);
        System.out.println("Iron Box Rating: " + rating);
        System.out.println("Iron Box Reviews: " + reviews);
        System.out.println("Iron Box Power: " + power + " Watts");
        System.out.println("Iron Box Steam Function: " + steam);
        System.out.println("Iron Box Warranty: " + warranty + " Years");
        System.out.println("Iron Box Color: " + color);
    }
}
