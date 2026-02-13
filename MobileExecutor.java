class MobileExecutor {
    public static void main(String[] args) {

        double price = Mobile.getPrice();
        String brand = Mobile.getBrand();
        double rating = Mobile.getRating();
        int reviews = Mobile.getReviews();
        int stock = Mobile.getStock();
        String model = Mobile.getModel();
        int warranty = Mobile.getWarranty();
        double discount = Mobile.getDiscount();
        int deliveryDays = Mobile.getDeliveryDays();
        String category = Mobile.getCategory();
        int battery = Mobile.getBatteryCapacity();
        int storage = Mobile.getStorage();
        int ram = Mobile.getRam();
        String color = Mobile.getColor();
        boolean prime = Mobile.isPrimeAvailable();

        System.out.println("Mobile Price: " + price);
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Rating: " + rating);
        System.out.println("Mobile Reviews: " + reviews);
        System.out.println("Mobile Stock: " + stock);
        System.out.println("Mobile Model: " + model);
        System.out.println("Mobile Warranty: " + warranty + " year");
        System.out.println("Mobile Discount: " + discount + "%");
        System.out.println("Mobile Delivery Days: " + deliveryDays);
        System.out.println("Mobile Category: " + category);
        System.out.println("Mobile Battery Capacity: " + battery + " mAh");
        System.out.println("Mobile Storage: " + storage + " GB");
        System.out.println("Mobile RAM: " + ram + " GB");
        System.out.println("Mobile Color: " + color);
        System.out.println("Mobile Prime Available: " + prime);
    }
}
