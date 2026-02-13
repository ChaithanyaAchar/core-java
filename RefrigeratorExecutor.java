class RefrigeratorExecutor {
    public static void main(String[] args) {

        double price = Refrigerator.getPrice();
        String brand = Refrigerator.getBrand();
        double rating = Refrigerator.getRating();
        int reviews = Refrigerator.getReviews();
        int capacity = Refrigerator.getCapacity();
        int warranty = Refrigerator.getWarranty();
        String color = Refrigerator.getColor();
        boolean convertible = Refrigerator.isConvertible();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Capacity: " + capacity + " Litres");
        System.out.println("Warranty: " + warranty + " Years");
        System.out.println("Color: " + color);
        System.out.println("Convertible: " + convertible);
    }
}
