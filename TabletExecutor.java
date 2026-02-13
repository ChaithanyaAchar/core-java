class TabletExecutor {
    public static void main(String[] args) {

        double price = Tablet.getPrice();
        String brand = Tablet.getBrand();
        double rating = Tablet.getRating();
        int reviews = Tablet.getReviews();
        int storage = Tablet.getStorage();
        int ram = Tablet.getRam();
        double screenSize = Tablet.getScreenSize();
        int battery = Tablet.getBatteryCapacity();
        String processor = Tablet.getProcessor();
        int warranty = Tablet.getWarranty();
        String color = Tablet.getColor();
        double weight = Tablet.getWeight();
        String category = Tablet.getCategory();
        boolean prime = Tablet.isPrimeAvailable();
        int stock = Tablet.getStock();

        System.out.println("Tablet Price: " + price);
        System.out.println("Tablet Brand: " + brand);
        System.out.println("Tablet Rating: " + rating);
        System.out.println("Tablet Reviews: " + reviews);
        System.out.println("Tablet Storage: " + storage + " GB");
        System.out.println("Tablet RAM: " + ram + " GB");
        System.out.println("Tablet Screen Size: " + screenSize + " inches");
        System.out.println("Tablet Battery Capacity: " + battery + " mAh");
        System.out.println("Tablet Processor: " + processor);
        System.out.println("Tablet Warranty: " + warranty + " year");
        System.out.println("Tablet Color: " + color);
        System.out.println("Tablet Weight: " + weight + " kg");
        System.out.println("Tablet Category: " + category);
        System.out.println("Tablet Prime Available: " + prime);
        System.out.println("Tablet Stock: " + stock);
    }
}
