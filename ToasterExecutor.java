class ToasterExecutor {
    public static void main(String[] args) {

        double price = Toaster.getPrice();
        String brand = Toaster.getBrand();
        double rating = Toaster.getRating();
        int reviews = Toaster.getReviews();
        int slices = Toaster.getSliceCapacity();
        boolean auto = Toaster.hasAutoPopUp();
        int warranty = Toaster.getWarranty();
        String color = Toaster.getColor();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Slice Capacity: " + slices);
        System.out.println("Auto Pop-Up: " + auto);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Color: " + color);
    }
}
