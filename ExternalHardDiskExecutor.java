class ExternalHardDiskExecutor {
    public static void main(String[] args) {

        double price = ExternalHardDisk.getPrice();
        String brand = ExternalHardDisk.getBrand();
        double rating = ExternalHardDisk.getRating();
        int reviews = ExternalHardDisk.getReviews();
        int storage = ExternalHardDisk.getStorage();
        boolean usb = ExternalHardDisk.supportsUSB3();
        int warranty = ExternalHardDisk.getWarranty();
        String color = ExternalHardDisk.getColor();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("USB 3.0: " + usb);
        System.out.println("Warranty: " + warranty + " Years");
        System.out.println("Color: " + color);
    }
}
