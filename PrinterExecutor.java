class PrinterExecutor {
    public static void main(String[] args) {

        double price = Printer.getPrice();
        String brand = Printer.getBrand();
        double rating = Printer.getRating();
        int reviews = Printer.getReviews();
        String type = Printer.getType();
        boolean wifi = Printer.supportsWiFi();
        int warranty = Printer.getWarranty();
        int stock = Printer.getStock();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Type: " + type);
        System.out.println("WiFi Support: " + wifi);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Stock: " + stock);
    }
}
