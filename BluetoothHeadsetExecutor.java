class BluetoothHeadsetExecutor {
    public static void main(String[] args) {

        double price = BluetoothHeadset.getPrice();
        String brand = BluetoothHeadset.getBrand();
        double rating = BluetoothHeadset.getRating();
        int reviews = BluetoothHeadset.getReviews();
        int battery = BluetoothHeadset.getBatteryLife();
        boolean noise = BluetoothHeadset.hasNoiseCancellation();
        int warranty = BluetoothHeadset.getWarranty();
        String color = BluetoothHeadset.getColor();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Battery Life: " + battery + " Hours");
        System.out.println("Noise Cancellation: " + noise);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Color: " + color);
    }
}
