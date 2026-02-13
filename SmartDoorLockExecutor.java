class SmartDoorLockExecutor {
    public static void main(String[] args) {

        double price = SmartDoorLock.getPrice();
        String brand = SmartDoorLock.getBrand();
        double rating = SmartDoorLock.getRating();
        int reviews = SmartDoorLock.getReviews();
        boolean fingerprint = SmartDoorLock.hasFingerprintAccess();
        boolean bluetooth = SmartDoorLock.hasBluetooth();
        boolean password = SmartDoorLock.hasPasswordAccess();
        int warranty = SmartDoorLock.getWarranty();
        String color = SmartDoorLock.getColor();
        int stock = SmartDoorLock.getStock();

        System.out.println("Smart Lock Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Fingerprint Access: " + fingerprint);
        System.out.println("Bluetooth: " + bluetooth);
        System.out.println("Password Access: " + password);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Color: " + color);
        System.out.println("Stock: " + stock);
    }
}