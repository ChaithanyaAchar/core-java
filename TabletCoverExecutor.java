class TabletCoverExecutor {
    public static void main(String[] args) {

        double price = TabletCover.getPrice();
        String brand = TabletCover.getBrand();
        double rating = TabletCover.getRating();
        int reviews = TabletCover.getReviews();
        boolean shock = TabletCover.isShockProof();
        boolean flip = TabletCover.isFlipCover();
        int warranty = TabletCover.getWarranty();
        String color = TabletCover.getColor();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Shock Proof: " + shock);
        System.out.println("Flip Cover: " + flip);
        System.out.println("Warranty: " + warranty + " Months");
        System.out.println("Color: " + color);
    }
}
