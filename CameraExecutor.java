class CameraExecutor {
    public static void main(String[] args) {

        double price = Camera.getPrice();
        String brand = Camera.getBrand();
        double rating = Camera.getRating();
        int reviews = Camera.getReviews();
        int mp = Camera.getMegaPixels();
        String lens = Camera.getLensType();
        String sensor = Camera.getSensorType();
        int warranty = Camera.getWarranty();
        String color = Camera.getColor();
        double weight = Camera.getWeight();
        boolean wifi = Camera.hasWiFi();
        boolean bluetooth = Camera.hasBluetooth();
        int battery = Camera.getBatteryLife();
        String category = Camera.getCategory();
        int stock = Camera.getStock();
        double discount = Camera.getDiscount();
        int delivery = Camera.getDeliveryDays();
        boolean prime = Camera.isPrimeAvailable();

        System.out.println("Camera Price: " + price);
        System.out.println("Camera Brand: " + brand);
        System.out.println("Camera Rating: " + rating);
        System.out.println("Camera Reviews: " + reviews);
        System.out.println("Megapixels: " + mp);
        System.out.println("Lens Type: " + lens);
        System.out.println("Sensor Type: " + sensor);
        System.out.println("Warranty: " + warranty + " Years");
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("WiFi: " + wifi);
        System.out.println("Bluetooth: " + bluetooth);
        System.out.println("Battery Life: " + battery + " shots");
        System.out.println("Category: " + category);
        System.out.println("Stock: " + stock);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Delivery Days: " + delivery);
        System.out.println("Prime Available: " + prime);
    }
}
