class MonitorExecutor {
    public static void main(String[] args) {

        double price = Monitor.getPrice();
        String brand = Monitor.getBrand();
        double rating = Monitor.getRating();
        int reviews = Monitor.getReviews();
        int size = Monitor.getScreenSize();
        String resolution = Monitor.getResolution();
        int refresh = Monitor.getRefreshRate();
        int warranty = Monitor.getWarranty();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Screen Size: " + size + " Inches");
        System.out.println("Resolution: " + resolution);
        System.out.println("Refresh Rate: " + refresh + " Hz");
        System.out.println("Warranty: " + warranty + " Years");
    }
}
