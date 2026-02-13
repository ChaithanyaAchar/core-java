class CoolerExecutor {
    public static void main(String[] args) {

        double price = Cooler.getPrice();
        String brand = Cooler.getBrand();
        double rating = Cooler.getRating();
        int reviews = Cooler.getReviews();
        int tank = Cooler.getTankCapacity();
        int warranty = Cooler.getWarranty();
        String color = Cooler.getColor();
        int stock = Cooler.getStock();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Tank Capacity: " + tank + " Litres");
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Color: " + color);
        System.out.println("Stock: " + stock);
    }
}
